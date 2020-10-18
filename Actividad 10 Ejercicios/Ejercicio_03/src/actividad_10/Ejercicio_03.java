package actividad_10;

import java.util.Scanner;

/**
 *
 * @author Criswxart
 */
public class Ejercicio_03 {

    public static void main(String[] args) {
       
        double numero;
        Scanner t = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        numero = t.nextDouble();
        
        if (numero > 0) {
            System.out.println("El número [" + numero + "] es positivo");
        }else if(numero == 0){
            System.out.println("El número [" + (int) numero + "] es neutro");
        }else{
            System.out.println("El número [" + numero + "] es negativo");
        }
    }
    
}
