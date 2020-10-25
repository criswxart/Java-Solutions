package actividad13_ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author Cristian Godoy
 * @version 1.0
 */
public class Actividad13_Ejercicio2 {

    public static void main(String[] args) {
         int cont_m = 0,cont_h = 0;
        
        Paciente paciente1 = new Paciente("Cristian","Godoy",26,'M','S',"787854");
        Paciente paciente2 = new Paciente("Maria","Lopez G",50,'F','C',"123456789");
        Paciente paciente3 = new Paciente("Carlos","Guzmán R",70,'M','V',"754554");
        Paciente paciente4 = new Paciente("Carolina","Perez P",50,'F','S',"123456789");
        Paciente paciente5 = new Paciente("Jorge","Campos",21,'M','C',"7884444");
        Paciente paciente6 = new Paciente("Sadrac","pepe",27,'M','S',"8788544");
        
        ArrayList<Paciente> listadoPacientes = new ArrayList<>();
        
        listadoPacientes.add(paciente1);
        listadoPacientes.add(paciente2);
        listadoPacientes.add(paciente3);
        listadoPacientes.add(paciente4);
        listadoPacientes.add(paciente5);
        listadoPacientes.add(paciente6);
        
        for (Paciente aux : listadoPacientes) {
            System.out.println(aux.toString());
        }
        
        for (Paciente aux : listadoPacientes) {
            
            if(aux.getGenero() == 'F' && aux.getEstado_civil() == 'C'){
                System.out.println("Nombre del paciente: " +aux.getNombre() + " Apellidos: " + aux.getApellidos() + " Telefono: " + aux.getTelefono());
            }
            if(aux.getGenero() == 'M' && aux.getEstado_civil() == 'S'){
                System.out.println("Nombre del paciente: " +aux.getNombre() + " Apellidos: " + aux.getApellidos() + " Telefono: " + aux.getTelefono());
            }
            if (aux.getGenero() == 'F') {
                cont_m++;
            }
            if (aux.getGenero() == 'M') {
                cont_h++;
          
            }
        }
        
        System.out.println("cantidad de hombres: " + cont_h);
        System.out.println("cantidad de hombres: " + cont_m);
    }
    
}
