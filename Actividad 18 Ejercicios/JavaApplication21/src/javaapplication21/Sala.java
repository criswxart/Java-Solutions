package javaapplication21;
/**
 *
 * @author Criswxart
 */
public class Sala {
    
    private String nombre_sala;
    private double precio;

    public Sala(String nombre_sala, double precio) {
        this.nombre_sala = nombre_sala;
        this.precio = precio;
    }

    public String getNombre_sala() {
        return nombre_sala;
    }

    public void setNombre_sala(String nombre_sala) {
        this.nombre_sala = nombre_sala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Sala{" + "nombre_sala=" + nombre_sala + ", precio=" + precio + '}';
    }

     public void mostrarSalas() {
        System.out.println(" ********** ");
        System.out.println("Nombre de la Sala : " + nombre_sala);
        System.out.println("Precio de la Sala : " + precio);
    } 
      public void mostrarOpcionesSalas() {
        System.out.println("1. Sala Gigante : ");
        System.out.println("2. Sala 3D : ");
        System.out.println("3. Sala Tradicional");
        System.out.println("Ingrese la opción");
    } 
    
      public static void voucherCliente( String nombre, int cantidad, double precio ) {
        
        double precioTotal;
        
        precioTotal = cantidad * precio;
        
        System.out.println(" ********** VOUCHER CLIENTE *********** ");
        System.out.println("Sala : " + nombre);
        System.out.println("Cantidad de Tickets : " + cantidad);
        System.out.println("Precio Total : " + precioTotal);
        
    }
     
    
}
