package actividad21_ejercicio_formativo;
/**
 *
 * @author Cristian
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
       
        Persona p = new Persona("Paul McCartney", 23, 'M');
        Cancion c = new Cancion("Yesterday", 120, true, p);
        
        //Crear Colección
        Album a = new Album();
        
        //Ejecución de métodos
        a.agregar(c);
        
        //listar
        System.out.println(a.listar());
        
    }
    
}
