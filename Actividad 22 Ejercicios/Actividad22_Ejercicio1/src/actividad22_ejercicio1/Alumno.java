
package actividad22_ejercicio1;
/**
 *
 * @author Cristian
 * @version 1.0
 */
public class Alumno {
    
    private String nombre;
    private String rut;
    private int edad;
    private boolean isCasado;
    private char sexo;
    private Carrera c;

    public Alumno(String nombre, String rut, int edad, boolean isCasado, char sexo, Carrera c) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.isCasado = isCasado;
        this.sexo = sexo;
        this.c = c;
    }

    public Alumno() {
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isIsCasado() {
        return isCasado;
    }

    public void setIsCasado(boolean isCasado) {
        this.isCasado = isCasado;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Carrera getC() {
        return c;
    }

    public void setC(Carrera c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", rut=" + rut + ", edad=" + edad + ", isCasado=" + isCasado + ", sexo=" + sexo + ", c=" + c + '}';
    }
    
    
}
