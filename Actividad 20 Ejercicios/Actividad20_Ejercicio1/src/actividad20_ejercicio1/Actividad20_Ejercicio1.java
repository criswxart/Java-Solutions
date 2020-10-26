package actividad20_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Cristian Godoy
 * @version 1.0
 */
public class Actividad20_Ejercicio1 {

   static Scanner teclado = new Scanner(System.in);
   static Coleccion c = new Coleccion();
   
    private static void ingresar() {
        //todas las variables definidas dentro del metodo son locales
        Scanner read = new Scanner(System.in);
        String rut, nombre="";
        int numero, edad;
        System.out.println("Ingrese el rut");
        rut = teclado.next();
        System.out.println("Ingrese numero");
        numero = teclado.nextInt();
        
        do{
        System.out.println("Ingrese nombre");
        nombre = read.nextLine();
        }while(nombre.trim().equals(""));
        
        do{
        System.out.println("Ingrese edad");
        edad = teclado.nextInt();
        }while(edad <18);
        
        Puesto p = new Puesto(rut, numero, nombre, edad);
        c.agregarPuesto(p);
        //mensaje de confirmación
        System.out.println("Se agregó el puesto correctamente");
    }

    private static void calcular() {
        System.out.println("La cantidad de dueños entre 18 y 30 es " + c.cantidadDueños());
    }

    private static boolean Menu() {
        boolean repetir = true;
        int opcion;
        System.out.println("1. Ingrese información del Puesto");
        System.out.println("2. Cantidad de Dueños entre 18 y 30");
        System.out.println("3. Salir");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                ingresar();
                break;
            case 2:
                calcular();
                break;
            case 3:
                repetir = false;
                break;
        }
        return repetir;
    }

    public static void main(String[] args) {
        while (Menu());
    }

  
   
    
}
