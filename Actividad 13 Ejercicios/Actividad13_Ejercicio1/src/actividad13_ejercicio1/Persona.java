
package actividad13_ejercicio1;
/**
 *
 * @author Cristian
 * @version 1.0
 */
public class Persona {
     
    //Atributos
    
    private int edad;
    private char genero;

    //Constructor

    public Persona(int edad, char genero) {
        this.edad = edad;
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", genero=" + genero + '}';
    }
}
