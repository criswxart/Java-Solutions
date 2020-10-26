package actividad21_ejercicio_formativo;

import java.util.ArrayList;

/**
 *
 * @author Cristian Godoy
 * @version 1.0
 */
public class Album {
    
    ArrayList<Cancion> listaCanciones = new ArrayList<>();
    public String agregar(Cancion c){
        String msj = "";
        boolean existe = false;
        for (Cancion aux : listaCanciones) {
            
            if (aux.getNombre().equals(c.getNombre()) && aux.getInterprete().getNombre().equals(c.getInterprete().getNombre())) {
                existe = true;
                
            }
        }
        if (existe) {
            msj = "No se puede agregar porque ya existe";
        }else{
            listaCanciones.add(c);
            msj = "Se agregó la canción";
        }
        return msj;
    }
    
    public String listar(){
        String salida = "";
        
        for (Cancion aux : listaCanciones) {
            salida = salida + aux.toString() + "\n";
        }
        return salida;
    }
    
    public String eliminar(String nombre){
        String salida = "";
        int i = 0, indice = -1;
        
        for (Cancion aux : listaCanciones) {
            
            if (aux.getNombre().equals(nombre)) {
                indice = i;
            }
            i++;
        }
        if (indice != -1) {
            listaCanciones.remove(indice);
            salida = "Se elimino la canción";
        }else{
            salida = "No se pudo eliminar la canción, el nombre de la canción no existe";
        }
        return salida;
    }
}
