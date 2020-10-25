
package actividad12_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Cristian Godoy
 * @version 1.0
 */
public class Actividad12_Ejercicio1 {

    static Scanner teclado = new Scanner(System.in);
 
    public static void metodo1() {
 
        int numero1 = 4, numero2 = 5;
        System.out.println("los numeros definidos son :" + numero1 + " y " + numero2);
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + (numero1 + numero2));
 
    }
 
    public static void metodo2(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
 
    }
 
    public static void metodo3(int num1, int num2) {
 
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
 
    }
 
    public static void metodo4() {
        int num1 = 4, num2 = 7;
        System.out.println("los numeros definidos son :" + num1 + " y " + num2);
 
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num1 - num2));
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero");
        }
        System.out.println("La división de " + num1 + " y " + num2 + " es: " + (num1 / num2));
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + (num1 * num2));
 
    }
 
    public static void metodo5(int num1, int num2) {
 
        System.out.println("los numeros definidos son :" + num1 + " y " + num2);
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num1 - num2));
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero");
        }
        System.out.println("La división de " + num1 + " y " + num2 + " es: " + (num1 / num2));
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + (num1 * num2));
 
    }
 
    public static void metodo6(int num1, int num2) {
 
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num1 - num2));
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero");
        }
        System.out.println("La división de " + num1 + " y " + num2 + " es: " + (num1 / num2));
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + (num1 * num2));
 
    }
 
    public static void main(String[] args) {
 
        //Declaración de variables
        int numero1, numero2;
 
        System.out.println("Método 1");
        metodo1();
        System.out.println("*************************");
 
        System.out.println("Método 2");
        metodo2(14, 7);
        System.out.println("*************************");
 
        System.out.println("Método 3");
        System.out.println("Ingrese el primer número");
        numero1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número");
        numero2 = teclado.nextInt();
        metodo3(numero1, numero2);
        System.out.println("*************************");
 
        System.out.println("Método 4");
        metodo4();
        System.out.println("*************************");
        System.out.println("Método 5");
        metodo5(12, 6);
        System.out.println("*************************");
        System.out.println("Método 6");
        System.out.println("Ingrese el primer número");
        numero1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número");
        numero2 = teclado.nextInt();
        metodo6(numero1, numero2);
 
    }
    
}
