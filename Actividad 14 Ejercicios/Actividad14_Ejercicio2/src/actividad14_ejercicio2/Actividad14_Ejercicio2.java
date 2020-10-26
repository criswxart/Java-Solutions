package actividad14_ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristian
 * @version 1.0
 */
public class Actividad14_Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ramoInput = 0;
        double notaPromedio = 0.0;
        boolean flag = false;
        double nota3 = 0.0;

        Ramo ramo1 = new Ramo("Matematica", 5.5, 4.2, 0);
        Ramo ramo2 = new Ramo("Lenguaje", 3.4, 5.2, 0);
        Ramo ramo3 = new Ramo("Biología", 7.0, 4.9, 0);
        Ramo ramo4 = new Ramo("Programación", 3.0, 4.0, 0);
        Ramo ramo5 = new Ramo("Historia", 4.3, 7.0, 0);
        ArrayList<Ramo> listaRamos = new ArrayList<>();

        listaRamos.add(ramo1);
        listaRamos.add(ramo2);
        listaRamos.add(ramo3);
        listaRamos.add(ramo4);
        listaRamos.add(ramo5);

        int numeroRamo = 1;
        System.out.println("Seleccione el ramo para calcular nota: ");
        for (Ramo ramo : listaRamos) {
            System.out.println(numeroRamo + "- " + ramo.getNombre().toString());
            numeroRamo++;
        }

        ramoInput = sc.nextInt();

        do {
            System.out.println("Ingrese el promedio que desea obtener: ");
            notaPromedio = sc.nextDouble();

            if (notaPromedio < 1.0 && notaPromedio > 7.0) 
                System.out.println("Debe ingresar nuevamente el dentro del rango");
            else 
                flag=true;

        } while (!flag);
        
        
        Ramo ramoFinal = new Ramo();
        ramoFinal.setNombre(listaRamos.get(ramoInput-1).nombre);
        ramoFinal.setNota1(listaRamos.get(ramoInput-1).nota1);
        ramoFinal.setNota2(listaRamos.get(ramoInput-1).nota2);
        
        nota3 = calculoNota3(notaPromedio, ramoFinal.getNota1(), ramoFinal.getNota2());
        
        ramoFinal.setNota3(nota3);
        System.out.println(ramoFinal.getNota1());
        System.out.println(ramoFinal.getNota2());
        System.out.println(ramoFinal.getNota3());
        
        
        
        System.out.println("Tienes que sacarte un: "+ ramoFinal.getNota3() + "para obtener el promedio " +notaPromedio);
        
         
    }

    private static double calculoNota3(double promedio, double n1, double n2) {
        double nota3;
        nota3 = (promedio*3) - n1 - n2;
        return nota3;
    }
    
}
