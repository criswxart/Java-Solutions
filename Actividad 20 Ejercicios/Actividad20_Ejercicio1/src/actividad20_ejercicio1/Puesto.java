/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad20_ejercicio1;

/**
 *
 * @author Criswxart
 */
public class Puesto {
     private String rut;
    private int numero;
    private String nombre;
    private int edad;

    public Puesto(String rut, int numero, String nombre, int edad) {
        this.rut = rut;
        this.numero = numero;
        this.nombre = nombre;
        this.edad = edad;
    }

    
    
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Puesto{" + "rut=" + rut + ", numero=" + numero + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
}
