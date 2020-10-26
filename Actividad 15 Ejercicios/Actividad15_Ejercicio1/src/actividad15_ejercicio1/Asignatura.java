package actividad15_ejercicio1;
/**
 *
 * @author Cristian Godoy
 * @version 1.0
 */
public class Asignatura {
    String nombre;
    double nota1;
    double nota2;
    double nota3;
    int ponderacion1;
    int ponderacion2;
    int ponderacion3;

    public Asignatura(String nombre, double nota1, double nota2, double nota3, int ponderacion1, int ponderacion2, int ponderacion3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.ponderacion1 = ponderacion1;
        this.ponderacion2 = ponderacion2;
        this.ponderacion3 = ponderacion3;
    }

    public Asignatura() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public int getPonderacion1() {
        return ponderacion1;
    }

    public void setPonderacion1(int ponderacion1) {
        this.ponderacion1 = ponderacion1;
    }

    public int getPonderacion2() {
        return ponderacion2;
    }

    public void setPonderacion2(int ponderacion2) {
        this.ponderacion2 = ponderacion2;
    }

    public int getPonderacion3() {
        return ponderacion3;
    }

    public void setPonderacion3(int ponderacion3) {
        this.ponderacion3 = ponderacion3;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", ponderacion1=" + ponderacion1 + ", ponderacion2=" + ponderacion2 + ", ponderacion3=" + ponderacion3 + '}';
    }
    
}
