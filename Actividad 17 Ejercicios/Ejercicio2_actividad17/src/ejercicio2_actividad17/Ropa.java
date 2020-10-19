package ejercicio2_actividad17;
/**
 *
 * @author Criswxart
 */
public class Ropa {
    private String tipo_ropa;
    private String talla;
    private String modelo;
    private double precio;

    public Ropa(String tipo_ropa, String talla, String modelo, double precio) {
        this.tipo_ropa = tipo_ropa;
        this.talla = talla;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getTipo_ropa() {
        return tipo_ropa;
    }

    public void setTipo_ropa(String tipo_ropa) {
        this.tipo_ropa = tipo_ropa;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   

    @Override
    public String toString() {
        return "Ropa{" + "tipo_ropa=" + tipo_ropa + ", talla=" + talla + ", modelo=" + modelo + ", precio=" + precio + '}';
    }
    
    
}
