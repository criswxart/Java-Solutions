/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad21_ejercicio_formativo;

/**
 *
 * @author Cristian Godoy
 * @version 1.0
 */
public class Persona {
     private String nombre;
    private int edad;
    private char sexo;

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        setEdad(edad);
        setSexo(sexo);
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
        if(edad >=5 && edad <=90){
        this.edad = edad;
        }else{
            System.out.println("Edad no valida");
        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if(sexo =='F' || sexo =='M'){
        this.sexo = sexo;}
        else{
            System.out.println("Letra inválida");
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
}
