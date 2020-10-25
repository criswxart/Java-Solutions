
package actividad13_ejercicio2;
/**
 *
 * @author Cristian Godoy
 * @version 1.0
 */
public class Paciente {
    //Atributos
    private String nombre, apellidos, telefono;
    private char genero, estado_civil;
    private int edad;

    //Metodo Constructor
    public Paciente(String nombre, String apellidos, int edad, char genero, char estado_civil, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.genero = genero;
        this.estado_civil = estado_civil;
        this.telefono = telefono;
        
    }
    
    //Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public char getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(char estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    
    //Métodos personalizados
    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", genero=" + genero + ", estado_civil=" + estado_civil + ", telefono=" + telefono + ", edad=" + edad + '}';
    }
    
}
