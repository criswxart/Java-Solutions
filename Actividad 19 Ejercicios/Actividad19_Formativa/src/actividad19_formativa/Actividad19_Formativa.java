package actividad19_formativa;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 * @author Cristian Godoy
 * @version 1.0
 */
public class Actividad19_Formativa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // definición de localdate
        
        
        //obtener fecha de hoy
         LocalDate date = LocalDate.now();
         System.out.println(date);
        
         LocalDate date2 = LocalDate.parse("2020-10-18");
         System.out.println(date2);
         /*
         LocalDate date3 = LocalDate.of(2020, Month.MARCH, 31);
         System.out.println(date3);
         
         LocalDate date4 = LocalDate.of(2020, 12, 25);
         
         System.out.println("Ingrese dia");
         int dia = teclado.nextInt();
         System.out.println("Ingrese mes");
         int mes = teclado.nextInt();
         System.out.println("Ingrese año");
         int año = teclado.nextInt();
         
         LocalDate date5 = LocalDate.of(año, mes, dia);
         System.out.println(date5);
         */
         
        Paciente paciente = new Paciente("18788869-7", "Cristian", "Godoy", 'M', 100, false);
        Habitacion hab1 = new Habitacion(paciente,17,'A',date2,20);
        
        System.out.println(hab1.imprimirDatos());
        hab1.calcularDescuento();
        paciente.darAlta();
        System.out.println(hab1.imprimirDatos());
        System.out.println(hab1.calcularDescuento());
        
    }
    
}
