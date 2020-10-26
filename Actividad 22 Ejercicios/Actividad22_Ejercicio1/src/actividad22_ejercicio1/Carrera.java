package actividad22_ejercicio1;
/**
 *
 * @author Cristian Godoy
 * @version 1.0
 */
public class Carrera {
    
    private int codigo;
    private String nombre;
    private int duracion;
    private String titulo;

    public Carrera(int codigo, String nombre, int duracion, String titulo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracion = duracion;
        this.titulo = titulo;
    }

    public Carrera() {
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Carrera{" + "codigo=" + codigo + ", nombre=" + nombre + ", duracion=" + duracion + ", titulo=" + titulo + '}';
    }
    
    public String imprimir(){
        String salida = "";
        
        salida+= "Códgo de la carrera: " +codigo + "\n" 
                + "Nombre de la carrera: " + nombre +"\n" 
                + "Duración: " + duracion + " años" + " \n"
                + "Titulo: " + titulo;
                
        return salida;

    }
    
}
