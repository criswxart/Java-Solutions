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
public class Oviparo extends Animal {
    
    public void ponerHuevos(){
        
    }
    
    public Oviparo(float peso) {
        super(peso);
    }
    
    @Override
    public String toString() {
        return "Oviparo{" + super.getPeso() + '}';
    }
    
}
