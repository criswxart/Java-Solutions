package actividad19_ejercicio1;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author Cristian Godoy
 * @version 1.0
 */
public class Actividad19_Ejercicio1 {

    public static void main(String[] args) {
        
        
        Director director = new Director("Christopher Nolan", "Reino Unido", false);
        Distribuidora dis = new Distribuidora("Home", LocalDate.of(1994, Month.MARCH, 5));
        PeliculaOSerie pelicula = new PeliculaOSerie("Batman: El caballero de la noche", 120, "Matan a su familia y se venga de todos", director, dis);
        
        System.out.println(pelicula);
        
    }
    
}
