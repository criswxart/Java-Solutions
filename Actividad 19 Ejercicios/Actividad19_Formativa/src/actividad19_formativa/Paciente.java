/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad19_formativa;

/**
 *
 * @author Criswxart
 */
public class Paciente {
    private String rut;
    private String nombre;
    private String apellido;
    private char sexo;
    private double peso;
    private boolean alta;

    public Paciente(String rut, String nombre, String apellido, char sexo, double peso, boolean alta) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.peso = peso;
        this.alta = alta;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Paciente{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", peso=" + peso + ", alta=" + alta + '}';
    }
    
    //Método que permite dar de alta a un paciente
    public void darAlta(){    
        if(!alta)  //alta == false
            alta = true;
    }

}
