package actividad16_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Cristian
 * @version 1.0
 */
public class Actividad16_Ejercicio1 {

    static Scanner t = new Scanner(System.in);
    static double suma = 0, promedio;
    static String nombre, apellido;

    public static boolean Menu() {
        int opcion;
        boolean repetir = true;

        System.out.println("MEN� DE OPCIONES");
        System.out.println("1. Ingresar nombre y apellido del alumno");
        System.out.println("2. Ingresar notas");
        System.out.println("3. Mostrar los datos del alumno y su promedio");
        System.out.println("4. Calcular la nota final de la asignatura");
        System.out.println("5. Salir");
        System.out.println("Ingrese una opci�n");
        opcion = t.nextInt();

        switch (opcion) {
            case 1:
                ingresar_alumno();
                break;
            case 2:
                notas();
                break;
            case 3:
                promedio();
                break;
            case 4:
                calcular_promedio_final();
                break;
            case 5:
                repetir = false;
                break;

            default:
                System.out.println("Ingrese una opci�n v�lida");
        }
        return repetir;

    }

    private static void calcular_promedio_final() {
        double nota, prom_final;
        System.out.println("Ingrese la nota del examen");
        nota = t.nextDouble();
        prom_final = promedio * 0.6 + nota * 0.4;

        if (prom_final >= 4.0) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

    }

    private static void promedio() {
        double prom_examen;
        promedio = suma / 3;
        System.out.println("Resultado:");
        System.out.println("'" + nombre + " " + apellido + "'");
        System.out.println("Su promedio de notas es: " + promedio);
        System.out.println("Ponderaci�n con el 60% es: " + promedio * 0.6);
        prom_examen = (4) - (promedio * 0.6);
        System.out.println("Debes sacarte un: " + prom_examen + " para pasar con nota 4.0");

    }

    private static void notas() {
        double notas;
        int i = 0;

        suma = 0;
        while (i < 3) {
            System.out.println("Ingrese la nota " + (i + 1));
            notas = t.nextDouble();
            suma = suma + notas;
            i++;
        }

    }

    private static void ingresar_alumno() {
        System.out.println("Ingrese el nombre del alumno");
        nombre = t.next();
        System.out.println("Ingrese el apellido del alumno");
        apellido = t.next();

    }

    public static void main(String[] args) {

        while (Menu());

    }

}
