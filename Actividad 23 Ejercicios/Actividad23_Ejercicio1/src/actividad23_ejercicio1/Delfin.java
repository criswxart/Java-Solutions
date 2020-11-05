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
public class Delfin extends Mamifero{
    
    public Delfin(boolean sangreCaliente, float peso) {
        super(sangreCaliente, peso);
    }

    @Override
    public String toString() {
        return "Delfin{" + super.toString() + '}';
    }
   
    public void nadar(){
        
    }
}
