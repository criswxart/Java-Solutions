package actividad18_ejercicio2;
/**
 *
 * @author Criswxart
 */
public class Plan {
    
    private String nombre_plan;
    private double precio_plan;

    public Plan(String nombre_plan, double precio_plan) {
        this.nombre_plan = nombre_plan;
        this.precio_plan = precio_plan;
    }

    public String getNombre_plan() {
        return nombre_plan;
    }

    public void setNombre_plan(String nombre_plan) {
        this.nombre_plan = nombre_plan;
    }

    public double getPrecio_plan() {
        return precio_plan;
    }

    public void setPrecio_plan(double precio_plan) {
        this.precio_plan = precio_plan;
    }

    @Override
    public String toString() {
        return "Plan{" + "nombre_plan=" + nombre_plan + ", precio_plan=" + precio_plan + '}';
    }
    
    public static void voucherCliente( String nombre_plan, int cantidad, double precio ) {
        
        double precioTotal;
        
        precioTotal = cantidad * precio;
        
        System.out.println(" ********** VOUCHER CLIENTE *********** ");
        System.out.println("Plan contratado : " + nombre_plan);
        System.out.println("Cantidad de planes : " + cantidad);
        System.out.println("Precio Total : " + precioTotal);
        
    }
}
