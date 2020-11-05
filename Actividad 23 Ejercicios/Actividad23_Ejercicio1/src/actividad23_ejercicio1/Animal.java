/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad23_ejercicio1;

/**
 *
 * @author Criswxart
 */
public class Animal {
    
    private float peso;
    
     public Animal(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" + "peso=" + peso + '}';
    }
    
    public void comer(){
        
    }
    
    
}
