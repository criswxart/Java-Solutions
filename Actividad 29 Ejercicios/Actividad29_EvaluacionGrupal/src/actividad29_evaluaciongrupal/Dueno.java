package actividad29_evaluaciongrupal;

/**
 *
 * @author Criswxart
 */
public class Dueno {
    
    private String nombre;
    private int codigoArea;
    private String telefono;
    private char tipo;

    public Dueno(String nombre, int codigoArea, String telefono, char tipo) {
        this.nombre = nombre;
        this.codigoArea = codigoArea;
        this.telefono = telefono;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Dueno{" + "nombre=" + nombre + ", codigoArea=" + codigoArea + ", telefono=" + telefono + ", tipo=" + tipo + '}';
    }
    
    
    
}
