package actividad21_ejercicio_formativo;

import java.util.HashSet;

/**
 *
 * @author Cristian Godoy
 * @version 1.0
 */
public class Cancion {
    
   private String nombre;
   private int duracion;
   private boolean enVivo;
   private Persona interprete;

    public Cancion(String nombre, int duracion, boolean enVivo, Persona interprete) {
        
        setNombre(nombre);
        setDuracion(duracion);
        this.enVivo = enVivo;
        this.interprete = interprete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() >=2) {
            this.nombre = nombre;
        }else{
            System.out.println("Nombre muy corto");
        }
        
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion >= 60) {
            this.duracion = duracion;
        }else{
            System.out.println("Duración minima de 1 min");
        }
        
    }

    public boolean isEnVivo() {
        return enVivo;
    }

    public void setEnVivo(boolean enVivo) {
        this.enVivo = enVivo;
    }

    public Persona getInterprete() {
        return interprete;
    }

    public void setInterprete(Persona interprete) {
        this.interprete = interprete;
    }

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", duraci\u00f3n=" + duracion + ", enVivo=" + enVivo + ", interprete=" + interprete.toString() + '}';
    }
   
    public String impresion(){
        String salida = "";
        salida = salida + nombre + " - " + interprete.getNombre();
        return salida;
    }
   
    
    public String mostrar_duracion(){
        
        String msj = "";
        
        if (duracion < 70) 
            msj = "corto";
        if (duracion >=70 && duracion <=200) 
            msj = "media";
        if (duracion >200) 
            msj = "larga";
        
        return msj;
        
    }
    
    
}
