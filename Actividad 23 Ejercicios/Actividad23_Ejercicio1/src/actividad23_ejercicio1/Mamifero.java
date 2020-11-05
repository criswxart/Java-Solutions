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
public class Mamifero extends Animal{
    
    private boolean sangreCaliente;

    public Mamifero(boolean sangreCaliente,float peso) {
        super(peso);
        this.sangreCaliente = sangreCaliente;
      
    }

    public boolean isSangreCaliente() {
        return sangreCaliente;
    }

    public void setSangreCaliente(boolean sangreCaliente) {
        this.sangreCaliente = sangreCaliente;
    }
    

    
    public void parir(){
        
    }
    
    public void amamantar(){
        
    }

    @Override
    public String toString() {
        return "Mamifero{" + "sangreCaliente=" + sangreCaliente + 
                super.toString() + '}';
    }
    
    
}
