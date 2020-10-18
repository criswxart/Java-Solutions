package actividad_11;

import java.util.Scanner;

/**
 *
 * @author Criswxart
 */
public class Ejercicio_01 {
    
    public static void main(String[] args) {
        
        String nombre_articulo, codigo;
        int precio, i = 0;
        boolean repetir = false;
        Scanner t = new Scanner(System.in);
        
 
        for (int j = 0; j < 2; j++) {
            
            System.out.println("Ingrese el código del articulo [" + (j+1) +"]");
            codigo = t.next();
            if (!(codigo.equals("01") || codigo.equals("02"))) {

                while (!repetir) {
                    System.out.println("Los códigos aceptados son: [01] y [02]");
                    codigo = t.next();
                    if (codigo.equals("01") || codigo.equals("02"))  repetir = true;
                       
                }
            }
            
            System.out.println("Ingrese el nombre del articulo [" + (j+1) +"]" );
            nombre_articulo = t.next();
            System.out.println("Ingrese el precio del articulo [" + (j+1) +"]");
            precio = t.nextInt();
            
            System.out.println("Código del articulo = " + codigo);
            System.out.println("Nombre articulo = " + nombre_articulo);
            System.out.println("Precio del articulo = " + precio);
            if (codigo == "01") {
                System.out.println("Precio del articulo con un 10% de descuento es: " + (precio*0.9));
            }else{
                System.out.println("Precio del articulo con un 20% de descuento es: " + (precio*0.8));
            }
            codigo = " ";
            nombre_articulo = " ";
            precio = 0;
            
        }       
    }
    
}
