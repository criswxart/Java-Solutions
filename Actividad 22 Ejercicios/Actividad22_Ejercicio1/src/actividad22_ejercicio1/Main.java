package actividad22_ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author Cristian Godoy
 * @version 1.0
 */
public class Main {

    
    
    public static void main(String[] args) {
        
        ArrayList<Carrera> listaCarreras = new ArrayList<>();
        Carrera c1 = new Carrera(123,"Ing. Civil", 5, "Ingeniero Civil en Construcción");
        Carrera c2 = new Carrera(743,"Pedagogía en Historia", 5, "Pedagogía en Historia");
        
        listaCarreras.add(c1);
        listaCarreras.add(c2);
        
        Alumno a1 = new Alumno("Cristian","1888888-7",26,false,'M',c1);
        Alumno a2 = new Alumno("Mauricio","7788845-7",30,false,'M',c2);
        
        System.out.println("Imprimir los atributos de un alumno");
        System.out.println(a1.toString());
        
        System.out.println("Imprimir las carreras de los alumnos");
        for (Carrera aux : listaCarreras) {
            System.out.println(aux.imprimir());
        }
        
        System.out.println("Cambio de carrera a: " + a1.getNombre() + " Carrera: " + a1.getC().getNombre() + " a: " + c2.getNombre());
        
        a1.setC(c2);
        System.out.println("Cambio exitoso!");
        System.out.println(a1.toString());
        
       
    }
    
}
