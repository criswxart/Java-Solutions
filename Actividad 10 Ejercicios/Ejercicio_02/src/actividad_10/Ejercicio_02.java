package actividad_10;

import java.util.Scanner;
/**
 *
 * @author Criswxart
 */
public class Ejercicio_02 {

    public static void main(String[] args) {
        
        //Declaración de variables
        double numero, suma = 0;
        int i = 0;
        Scanner t = new Scanner(System.in);
        
        System.out.println("Promedio de 4 números decimales");
            
        do {
            System.out.println("Ingrese el número " + (i + 1));
            numero = t.nextDouble();
            suma = suma + numero;
            i++;
        } while (i < 4);
       
        System.out.println("El promedio de los 4 números es: " + (suma/4));
        
    }
    
}
