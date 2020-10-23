package actividad21_ejercicio1;
/**
 *
 * @author Criswxart
 */
public class Producto {
    
    private String nombreProducto;
    private int codigo;
    private String marcaProducto;
    private String tipoProducto;
    private String formatoProducto;
    private String paisOrigen;
    private double precioProducto;
    private int stock;

    public Producto(String nombreProducto, String marcaProducto, String tipoProducto, String formatoProducto, String paisOrigen, double precioProducto, int stock, int codigo) {
        this.nombreProducto = nombreProducto;
        this.marcaProducto = marcaProducto;
        this.tipoProducto = tipoProducto;
        this.formatoProducto = formatoProducto;
        this.paisOrigen = paisOrigen;
        this.precioProducto = precioProducto;
        this.stock = stock;
        this.codigo = codigo;
    }

    public Producto() {
        precioProducto = 0;
        stock = 0;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getFormatoProducto() {
        return formatoProducto;
    }

    public void setFormatoProducto(String formatoProducto) {
        this.formatoProducto = formatoProducto;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", marcaProducto=" + marcaProducto + ", tipoProducto=" + tipoProducto + ", formatoProducto=" + formatoProducto + ", paisOrigen=" + paisOrigen + ", precioProducto=" + precioProducto + ", stock=" + stock + '}';
    }
    
    
    
}
