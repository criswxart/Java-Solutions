package actividad15_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Cristian Godoy
 * @version 1.0
 */
public class Actividad15_Ejercicio1 {

   
    public static Scanner leer = new Scanner(System.in);
    public static Asignatura asignatura = new Asignatura();

    private static boolean verificarNota(double nota) {
        boolean result = false;
        if (nota >= 1.0 && nota <= 7.0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    private static void ingresaNotas() {
        double nota1=0.0;
        double nota2=0.0;
        double nota3=0.0;

        boolean salida;
        do {
            System.out.println("Ingrese nota1: ");
            nota1 = leer.nextDouble();
            if (verificarNota(nota1)) {
                asignatura.setNota1(nota1);
                salida = true;
            } else {
                System.out.println("Debe ingresar una nota válida");
                salida = false;
            }

            System.out.println("Ingrese nota2: ");
            nota2 = leer.nextDouble();
            if (verificarNota(nota2)) {
                asignatura.setNota2(nota2);
                salida = true;
            } else {
                System.out.println("Debe ingresar una nota válida");
                salida = false;
            }

            System.out.println("Ingrese nota3: ");
            nota3 = leer.nextDouble();
            if (verificarNota(nota3)) {
                asignatura.setNota3(nota3);
                salida = true;
            } else {
                System.out.println("Debe ingresar una nota válida");
                salida = false;
            }

        } while (!salida);

    }

    private static void ingresarPoderaciones() {
        int ponderacion1;
        int ponderacion2;
        int ponderacion3;
        boolean salida = false;

        do {
            System.out.println("Ingrese ponderación nota1");
            ponderacion1 = leer.nextInt();
            System.out.println("Ingrese ponderación nota2");
            ponderacion2 = leer.nextInt();
            System.out.println("Ingrese ponderación nota3");
            ponderacion3 = leer.nextInt();
            int total = ponderacion1 + ponderacion2 + ponderacion3;
            if (total != 100) {
                System.out.println("La ponderación total del ramo es mayor a cien");
                salida = false;
            } else {
                asignatura.setPonderacion1(ponderacion1);
                asignatura.setPonderacion2(ponderacion2);
                asignatura.setPonderacion3(ponderacion3);
                salida = true;
            }
        } while (!salida);

    }

    private static void obtenerResultado() {

        double nota1Ponderada;
        double nota2Ponderada;
        double nota3Ponderada;
        double promedioFinal;
        nota1Ponderada = asignatura.getNota1() * ((double) asignatura.getPonderacion1() / 100);
        nota2Ponderada = asignatura.getNota2() * ((double) asignatura.getPonderacion2() / 100);
        nota3Ponderada = asignatura.getNota3() * ((double) asignatura.getPonderacion3() / 100);

        promedioFinal = nota1Ponderada + nota2Ponderada + nota3Ponderada;

        System.out.println(asignatura.toString());

        if (promedioFinal >= 4.0) {
            System.out.println("Asignatura Aprobada con promedio: " + promedioFinal);
        } else {
            System.out.println("Asignarura Reprobada con promedio: " + promedioFinal);
        }
    }

    private static void ingresarAsignatura() {
        asignatura.setNombre(leer.next());
        System.out.println("Asignatura Ingresada");
    }

    private static boolean Menu() {
        boolean repetir = true;
        int opcion;

        System.out.println("Menu");
        System.out.println("1. Ingresar nombre asignatura");
        System.out.println("2. Ingresar Notas");
        System.out.println("3. Ingresar Ponderaciones");
        System.out.println("4. Obtener Promedio y Evaluacion");
        System.out.println("5. Salir");
        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                ingresarAsignatura();
                break;
            case 2:
                ingresaNotas();
                break;
            case 3:
                ingresarPoderaciones();
                break;
            case 4:
                obtenerResultado();
                break;
            case 5:
                repetir = false;
                break;
        }
        return repetir;
    }

    public static void main(String[] args) {
        while (Menu());
    }

    
}
