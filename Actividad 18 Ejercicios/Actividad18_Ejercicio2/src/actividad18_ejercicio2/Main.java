package actividad18_ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristian Godoy
 */
public class Main {
    static Scanner teclado = new Scanner(System.in);
    static double precio = 0;
    static String nombre_plan = "";
    static int cant_plan1 = 0, cant_plan2 = 0, cant_plan3 = 0, cant_total = 0, cant_planes = 0;
    static Plan plan;
    static ArrayList<Plan> lista_planes = new ArrayList<>();
    
    private static void Ingresar_Plan(){
        
        int i = 0, largo_string = 0;
        boolean rep = false;
        
        while (i < 3) {
            
            System.out.println("Ingrese el nombre del plan: " + (i+1));
            teclado.nextLine();
            nombre_plan = teclado.nextLine();
            largo_string = nombre_plan.length();
            if (largo_string < 11) {
                while (!rep) {
                    System.out.println("Ingrese un nombre del plan mayor a 10 caracteres");
                    nombre_plan = teclado.next();
                    if (nombre_plan.length() > 11) {
                        rep = true;
                    }
                }
            }
            
            System.out.println("Ingrese el precio del plan " +(i+1));
            precio = teclado.nextDouble();

            if (precio <=0 || precio >=20000) {
                while (!rep) {
                    System.out.println("Ingrese un precio entre $1 y $19999");
                    precio = teclado.nextInt();
                    if (precio > 0 && precio < 20000) {
                        rep = true;
                    }
                }
            }
            plan = new Plan(nombre_plan, precio);
            lista_planes.add(plan);
            i++;
        }
        System.out.println("Ingreso de precios exitoso!");
        System.out.println("");
        System.out.println("*****************************");
    }
    
    private static void Venta_Planes(){
        boolean rep = false, confirmar_venta = false;
        int opc_principal, opc_venta, opc_confirmar;
        String nombre_plan = " ";
        double precio_plan;
        do {
            System.out.println(" ********* SISTEMA DE VENTAS ********** ");
            System.out.println("1. Realizar venta : ");
            System.out.println("2. Volver al menú principal : ");
            System.out.println("Ingrese una opción del menú : ");
            opc_principal = teclado.nextInt();

            switch (opc_principal) {
                case 1:
                   
                    System.out.println("Planes:");
                    System.out.println("1. " + lista_planes.get(0).getNombre_plan());
                    System.out.println("2. " + lista_planes.get(1).getNombre_plan());
                    System.out.println("3. " + lista_planes.get(2).getNombre_plan());
                    System.out.println("Ingrese el plan a contratar ");
                    opc_venta = teclado.nextInt();
                    switch (opc_venta) {
                        case 1:
                            System.out.println("Venta del plan: " + lista_planes.get(0).getNombre_plan() );
                            System.out.println("Ingrese la cantidad de planes a comprar");
                            cant_planes = teclado.nextInt();
                            
                            nombre_plan = lista_planes.get(0).getNombre_plan();
                            precio_plan = lista_planes.get(0).getPrecio_plan();

                            do {

                                plan.voucherCliente(nombre_plan, cant_planes, precio_plan);
                                System.out.println("¿Confirma la venta?");
                                System.out.println("1. Si, ");
                                System.out.println("2. No, ");
                                opc_confirmar = teclado.nextInt();

                                if (opc_confirmar == 1) {
                                    cant_plan1 += cant_planes;
                                    cant_total += cant_planes;
                                    confirmar_venta = true;
                                } else if (opc_confirmar == 2) {
                                    break;
                                } else {
                                    System.out.println("Ingrese una opción válida. ");
                                }

                            } while (!confirmar_venta);


                        break;
                        case 2:
                            System.out.println("Venta del plan: " + lista_planes.get(1).getNombre_plan());
                            System.out.println("Ingrese la cantidad de planes a comprar");
                            cant_planes = teclado.nextInt();

                            nombre_plan = lista_planes.get(1).getNombre_plan();
                            precio_plan = lista_planes.get(1).getPrecio_plan();

                            do {

                                plan.voucherCliente(nombre_plan, cant_planes, precio_plan);
                                System.out.println("¿Confirma la venta?");
                                System.out.println("1. Si, ");
                                System.out.println("2. No, ");
                                opc_confirmar = teclado.nextInt();

                                if (opc_confirmar == 1) {
                                    cant_plan2 += cant_planes;
                                    cant_total += cant_planes;
                                    confirmar_venta = true;
                                } else if (opc_confirmar == 2) {
                                    break;
                                } else {
                                    System.out.println("Ingrese una opción válida. ");
                                }

                            } while (!confirmar_venta);

                            break;
                         case 3:
                            System.out.println("Venta del plan: " + lista_planes.get(1).getNombre_plan());
                            System.out.println("Ingrese la cantidad de planes a comprar");
                            cant_planes = teclado.nextInt();

                            nombre_plan = lista_planes.get(2).getNombre_plan();
                            precio_plan = lista_planes.get(2).getPrecio_plan();

                            do {

                                plan.voucherCliente(nombre_plan, cant_planes, precio_plan);
                                System.out.println("¿Confirma la venta?");
                                System.out.println("1. Si, ");
                                System.out.println("2. No, ");
                                opc_confirmar = teclado.nextInt();

                                if (opc_confirmar == 1) {
                                    cant_plan3 += cant_planes;
                                    cant_total += cant_planes;
                                    confirmar_venta = true;
                                } else if (opc_confirmar == 2) {
                                    break;
                                } else {
                                    System.out.println("Ingrese una opción válida. ");
                                }

                            } while (!confirmar_venta);
                            confirmar_venta = false;
                        break;
                        default:
                            System.out.println("Ingrese una opción válida");
                    }
                    
                    break;
                case 2:
                    System.out.println("Volviendo al menú principal ........");
                    rep = true;
                   
                    break;

                default:
                    System.out.println("Ingrese una opción válida");
            }

        } while (!rep);
    }
    private static void Cierre_Turno(){
        double total;
        total = cant_plan1 * lista_planes.get(0).getPrecio_plan()+ cant_plan2 * lista_planes.get(1).getPrecio_plan()+ cant_plan3 * lista_planes.get(2).getPrecio_plan();
        System.out.println("********* CIERRE DE CAJA *********");
        System.out.println("Cantidad total de planes vendidas: " + cant_total);
        System.out.println("Cantidad de ventas del plan "+ lista_planes.get(0).getNombre_plan()+ " es: " + cant_plan1);
        System.out.println("Cantidad de ventas del plan "+ lista_planes.get(1).getNombre_plan()+ " es: " + cant_plan2);
        System.out.println("Cantidad de ventas del plan "+ lista_planes.get(2).getNombre_plan()+ " es: " + cant_plan3);
        System.out.println("TOTAL VENTAS: $ " + total);
    }
   
    private static void Menu_principal() {
        
        boolean repetir = true;
        int opt;
        while (repetir) {
            System.out.println("1.- Ingresar los planes");
            System.out.println("2.- Contratación de planes");
            System.out.println("3.- Cierre del turno ");
            System.out.println("4.- salir");
            opt = teclado.nextInt();
            switch (opt) {
                case 1:
                    Ingresar_Plan();
                    break;
                case 2:
                   if(lista_planes.size() > 0){
                        Venta_Planes();
                   }else{
                        System.out.println("No hay planes creados. Por favor, ingrese los datos en la opción 1 del menú principal.");
                    }
                  
                    break;
                case 3:
                    if (lista_planes.size() > 0) {
                         Cierre_Turno();
                    }else{
                        System.out.println("No hay planes creados. Por favor, ingrese los datos en la opción 1 del menú principal.");
                    }
                  
                    break;
                case 4:
                    repetir = false;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Bienvenido a Nesfli\n");
        Menu_principal();

    }

   
    
}
