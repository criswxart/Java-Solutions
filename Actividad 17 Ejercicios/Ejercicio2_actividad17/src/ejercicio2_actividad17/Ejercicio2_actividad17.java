
package ejercicio2_actividad17;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Criswxart
 */
public class Ejercicio2_actividad17 {

    public static void main(String[] args) {
       
        
        ArrayList<Ropa> lista_ropa = new ArrayList<>();
        Scanner t = new Scanner(System.in);
        int opcion;
        double desc, suma;
        boolean repetir = false;
        Ropa ropa = new Ropa("Poleron", "XL", "Adidas", 55000 );
        Ropa ropa2 = new Ropa("Zapatilla", "45", "Nike", 30000 );
        
        lista_ropa.add(ropa);
        lista_ropa.add(ropa2);
        
        System.out.println("***** Prendas *******");
        for (Ropa aux : lista_ropa) {         
             System.out.println(aux.toString());
        }
        
        do {            
            System.out.println("Aplicar descuento");
            System.out.println("1. Festividad 30% de descuento");
            System.out.println("2. Temporada baja 60% de descuento");
            System.out.println("3. Día de semana baja 15% de descuento");
            System.out.println("Ingrese la opción");
            opcion = t.nextInt();
            
            switch (opcion) {
                case 1:
                   
                    System.out.println("Precio Final con el descuento");
                    System.out.println("Producto 1");
                    System.out.println("Modelo " + lista_ropa.get(0).getModelo() );
                    System.out.println("Total a pagar: " + lista_ropa.get(0).getPrecio()*0.7 );
                    System.out.println("Producto 2");
                    System.out.println("Modelo " + lista_ropa.get(1).getModelo() );
                    System.out.println("Total a pagar: " + lista_ropa.get(1).getPrecio()*0.7 );
                    suma = lista_ropa.get(0).getPrecio()*0.7 +  lista_ropa.get(1).getPrecio()*0.7 ;
                    System.out.println("TOTAL : $"+ suma);
                    repetir = true;
                    break;
                case 2:
                   

                    System.out.println("Precio Final con el descuento");
                    System.out.println("Producto 1");
                    System.out.println("Modelo " + lista_ropa.get(0).getModelo() );
                    System.out.println("Total a pagar: " + lista_ropa.get(0).getPrecio()*0.4 );
                    System.out.println("Producto 2");
                    System.out.println("Modelo " + lista_ropa.get(1).getModelo() );
                    System.out.println("Total a pagar: " + lista_ropa.get(1).getPrecio()*0.4 );
                    suma = lista_ropa.get(0).getPrecio()*0.4 + lista_ropa.get(1).getPrecio()*0.4;
                    System.out.println("TOTAL : $"+ suma);
                    repetir = true;
                    break;
                case 3:
                   

                    System.out.println("Precio Final con el descuento");
                    System.out.println("Producto 1");
                    System.out.println("Modelo " + lista_ropa.get(0).getModelo() );
                    System.out.println("Total a pagar: " + lista_ropa.get(0).getPrecio()*0.85 );
                    System.out.println("Producto 2");
                    System.out.println("Modelo " + lista_ropa.get(1).getModelo() );
                    System.out.println("Total a pagar: " + lista_ropa.get(1).getPrecio()*0.85 );
                    suma = lista_ropa.get(0).getPrecio()*0.85 + lista_ropa.get(1).getPrecio()*0.85;
                    System.out.println("TOTAL : $"+ suma);
                    repetir = true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
        } while (!repetir);
        
    }
    
}
