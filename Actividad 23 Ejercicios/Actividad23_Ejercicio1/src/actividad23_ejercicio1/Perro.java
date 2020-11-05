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
public class Perro extends Mamifero{
    
    private String colorPelo;

    public Perro(String colorPelo, boolean sangreCaliente, float peso) {
        super(sangreCaliente,peso);
        this.colorPelo = colorPelo;
        
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    
    
    
    
    public void ladrar(){
        
    }
    
}
