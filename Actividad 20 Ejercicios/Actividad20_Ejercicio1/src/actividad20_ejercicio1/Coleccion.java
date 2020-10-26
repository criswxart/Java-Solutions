/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad20_ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author Criswxart
 */
public class Coleccion {
     //Coleccion es una simulación de una base de datos
    ArrayList<Puesto> listadoPuestos = new ArrayList<>();
    
    //métodos del mantenedor : Agregar, buscar, eliminar, actualizar, listar
    public void agregarPuesto(Puesto p){
        listadoPuestos.add(p);  
    }
    
    //metodo customer que retorna la cantidad 
    // de dueños que tiene entre 18 y 30
    public int cantidadDueños(){
        int cantidad = 0;
        for(Puesto p : listadoPuestos){
            if(p.getEdad()>=18 && p.getEdad()<=30){
                cantidad++;
            }
        }
        return cantidad;
    }
    
}
