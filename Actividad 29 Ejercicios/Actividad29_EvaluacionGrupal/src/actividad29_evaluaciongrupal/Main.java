package actividad29_evaluaciongrupal;

import java.util.Scanner;

/**
 *
 * @author Criswxart
 */
public class Main {

    static Scanner t = new Scanner(System.in);
    static Dueno d;
    static Vehiculo v;
    
    public static void crearCliente() {

        String nombre, telefono;
        int codigoArea = 0;
        char tipo = 0;
        boolean rep = false;

        System.out.println("Ingrese su nombre");
        nombre = t.next();

        System.out.println("Ingrese su código de área");
        codigoArea = t.nextInt();

        if (codigoArea <= 0 || codigoArea >= 100) {
            while (!rep) {
                System.out.println("El código de área debe tener solo 2 digitos");
                codigoArea = t.nextInt();
                if (codigoArea > 0 && codigoArea < 100) {
                    rep = true;
                }
            }
        }

        System.out.println("Ingrese su teléfono");
        telefono = t.next();

        rep = false;
        while (!rep) {
            System.out.println("Ingrese el tipo (‘F’: frecuente, ‘N’: normal)");
            tipo = t.next().charAt(0);

            if (tipo == 'F' || tipo == 'N') {
                rep = true;
            }else{
                 System.out.println("¡UPS! Ingrese F o N ");
            }
           
        }
        System.out.println("¡Se ha creado al dueño con exito!");
        d = new Dueno(nombre, codigoArea, telefono, tipo);

    }
    
    public static void crearVehiculo() {
        String patente;
        boolean estadoRevisionTecnica = false;
        int kilometraje, anio, largo_string, opc;
        boolean rep = false;

        System.out.println("Ingrese la patente de su auto ");
        t.nextLine();
        patente = t.nextLine();
        largo_string = patente.length();
        if (largo_string != 6) {
            while (!rep) {
                System.out.println("El largo de la patente debe ser 6 caracteres");
                patente = t.nextLine();
                largo_string = patente.length();
                if (largo_string == 6) rep = true;
            }
        }
        
        System.out.println("Ingrese el año del auto");
        anio = t.nextInt();
        
        rep = false;
        System.out.println("Ingrese el kilometraje de su auto");
        kilometraje = t.nextInt();
        if (kilometraje < 0 || kilometraje > 500000) {
             while (!rep) {
                System.out.println("Rango de kilometraje entre 0 a 500000 km");
                kilometraje = t.nextInt();
                if (kilometraje > 0 || kilometraje <= 500000) rep = true;
            }
        }
        
        rep = false;
        do {  
            System.out.println("¿ Cual es el estado de su revisión técnica?");
            System.out.println("1. Revisión al día");
            System.out.println("2. Revisión atrasada");
            System.out.println("Ingrese la opción");
            opc = t.nextByte();
            
            switch (opc) {
                case 1:
                    estadoRevisionTecnica = true;
                    rep = true;
                    break;
                case 2:
                    estadoRevisionTecnica = false;
                    rep = true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
            
        } while (!rep);
        
        System.out.println("¡Se ha ingresado el vehículo con exito!");
        v = new Vehiculo(patente, estadoRevisionTecnica, kilometraje, anio, d);
        System.out.println(v.toString());
    }
    
    public static void menu(){
        boolean repetir = false;
        int opcion;
        
        do {
            System.out.println("1. Crear un cliente");
            System.out.println("2. Crear vehículo");
            System.out.println("3. Utilizar métodos");
            System.out.println("4. Salir del programa");
            System.out.println("Ingrese una opción: ");
            opcion = t.nextInt();
            
            switch (opcion) {

                case 1:
                    crearCliente();
                    break;
                case 2:
                    crearVehiculo();
                    break; 
               case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("¡Gracias por utilizar el programa!");
                    repetir = true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
            
            
        } while (!repetir);

        
        
    }
    
    
    public static void main(String[] args) {
        
        
        System.out.println("Bienvenidos al  taller mecánico “Optimus Car” ");
        
        menu();
        
    }
    
}
