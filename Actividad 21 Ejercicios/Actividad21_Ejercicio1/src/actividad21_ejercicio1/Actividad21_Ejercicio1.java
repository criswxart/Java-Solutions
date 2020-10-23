package actividad21_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Criswxart
 */
public class Actividad21_Ejercicio1 {

    public static void main(String[] args) {
       
        Scanner t = new Scanner(System.in);
        String nombre, marca, tipo, paisOrigen, formato;
        int stock, codigo;
        double precio;
        boolean r = false;
        
        Producto producto1 = new Producto("Iphone", "Apple", "Celular", "Caja", "EE.UU", 850000.0, 50, 52245);
        Producto producto2 = new Producto();
        
        System.out.println("Ingrese el código del producto");
        codigo = t.nextInt();
        System.out.println("Ingrese el nombre del producto");
        nombre = t.next();
        System.out.println("Ingrese la marca del producto");
        marca = t.next();
        System.out.println("Ingrese el tipo del producto");
        tipo = t.next();
        System.out.println("Ingrese el formato del producto");
        formato = t.next();
        System.out.println("Ingrese el pais de origen del producto");
        paisOrigen = t.next();
        System.out.println("Ingrese el precio del producto");
        precio = t.nextDouble();
        if (precio <= 0) {
            while (!r) {
                System.out.println("El precio debe ser mayor a 0");
                precio = t.nextDouble();
                if (precio > 0) r = true;
                     
            }
        }
        r = false;
        System.out.println("Ingrese el stock del producto");
        stock = t.nextInt();
        if (stock <= 0) {
            while (!r) {
                System.out.println("El stock debe ser mayor a 0");
                stock = t.nextInt();
                if (stock > 0) r = true;
                     
            }
        }
        
        Producto producto3 = new Producto(nombre, marca, tipo, formato, paisOrigen, precio, stock, codigo);
        System.out.println("Con parametros, datos en duro");
        System.out.println(producto1.toString());
        System.out.println("Sin parametros");
        System.out.println(producto2.toString());
        System.out.println("Ingresados y con validación");
        System.out.println(producto3.toString());
        
        
    }
    
}
