package actividad13_ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristian Godoy
 * @version 1.0
 */
public class Actividad13_Ejercicio1 {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        int edad,promedio_edad,suma, cant_mujeres, cant_hombres, cant_n, cant_j, cant_a, num_personas;
        char genero;
        Persona p;
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        cant_mujeres = 0;
        cant_hombres = 0;
        suma = 0;
        cant_n = 0;
        cant_j = 0;
        cant_a = 0;
       
        System.out.println("Ingrese cantidad de personas del gym");
        num_personas = teclado.nextInt();
        
      
        for (int i = 0; i < num_personas; i++) {
            System.out.println("Ingrese el genero de la persona " + "[" + (i+1) +"]");
            genero = teclado.next().charAt(0);
            System.out.println("Ingrese la edad de la persona "+ "[" + (i+1) +"]");
            edad = teclado.nextInt();
            p = new Persona(edad, genero);
            listaPersonas.add(p);
            if (listaPersonas.get(i).getGenero() == 'M') {
                cant_hombres++;
            }
            if (listaPersonas.get(i).getEdad() >=10 && listaPersonas.get(i).getEdad() <= 17) {
                cant_n++;
            }
            if (listaPersonas.get(i).getEdad() >=18 && listaPersonas.get(i).getEdad() <= 29) {
                cant_j++;
            }
            if (listaPersonas.get(i).getEdad() >=30 && listaPersonas.get(i).getEdad() <= 50) {
                cant_a++;
            }
            if (listaPersonas.get(i).getGenero() == 'F') {
                cant_mujeres++;
            }
            suma = suma + edad;
        }
       promedio_edad = suma/num_personas;
       
        System.out.println("cantidad de mujeres: " + cant_mujeres);
        System.out.println("cantidad de hombres: " + cant_hombres);
       
        System.out.println("cantidad de niños: " + cant_n);
        System.out.println("cantidad de jovenes: " + cant_j);
        System.out.println("cantidad de adultos: " + cant_a);
        
        if (promedio_edad >=10 && promedio_edad <= 17) {
            System.out.println("Categoria niños");
        }
       if (promedio_edad >=18 && promedio_edad <= 29) {
            System.out.println("Categoria jovenes");
        }
        if (promedio_edad >=30 && promedio_edad <= 50) {
            System.out.println("Categoria adultos");
        }
    }
    
}
