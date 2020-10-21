package javaapplication21;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Criswxart
 */
public class Main {
    
    static Scanner teclado = new Scanner(System.in);
    static double precio;
    static int cant_gigante = 0, cant_3d = 0, cant_tradicional = 0, cant_total = 0, cant_salas = 0;
    static Sala sala;
    static ArrayList<Sala> lista_sala = new ArrayList<>();
    
    // Ingresa los precios de cada una de las salas estipuladas
    public static void ingresar_sala() {

        int i = 0;
        boolean rep = false;
        String [] salas = {"Gigante", "3D", "Tradicional"};
        
        while (i < 3) {
            System.out.println("Ingrese el precio de la sala " + salas[i]);
            precio = teclado.nextDouble();

            if (precio <= 2999 && precio > 7000) {
                while (!rep) {
                    System.out.println("Ingrese un precio entre $3000 y $7000");
                    precio = teclado.nextInt();
                    if (precio >= 3000 && precio <= 7000) {
                        rep = true;
                    }
                }
            }
            sala = new Sala(salas[i], precio);
            lista_sala.add(sala);
            i++;
        }
        System.out.println("Ingreso de precios exitoso!");
        System.out.println("");
        System.out.println("*****************************");
    }
    public static void Venta_entradas() {
        boolean rep = false, confirmar_venta = false;
        int opc_principal, opc_venta, opc_confirmar;
        String nombre_sala = " ";
        double precio_sala;
        do {
            System.out.println(" ********* SISTEMA DE VENTAS ********** ");
            System.out.println("1. Realizar venta : ");
            System.out.println("2. Volver al menú principal : ");
            System.out.println("Ingrese una opción del menú : ");
            opc_principal = teclado.nextInt();

            switch (opc_principal) {
                case 1:
                    sala.mostrarOpcionesSalas();
                    opc_venta = teclado.nextInt();
                    switch (opc_venta) {
                        case 1:
                            System.out.println("Venta a sala Gigante");
                            System.out.println("Ingrese la cantidad de entradas a comprar");
                            cant_salas = teclado.nextInt();
                            
                            nombre_sala = lista_sala.get(0).getNombre_sala();
                            precio_sala = lista_sala.get(0).getPrecio();

                            do {

                                sala.voucherCliente(nombre_sala, cant_salas, precio_sala);
                                System.out.println("¿Confirma la venta?");
                                System.out.println("1. Si, ");
                                System.out.println("2. No, ");
                                opc_confirmar = teclado.nextInt();

                                if (opc_confirmar == 1) {
                                    cant_gigante += cant_salas;
                                    cant_total += cant_salas;
                                    confirmar_venta = true;
                                } else if (opc_confirmar == 2) {
                                    break;
                                } else {
                                    System.out.println("Ingrese una opción válida. ");
                                }

                            } while (!confirmar_venta);


                        break;
                        case 2:
                            System.out.println("Venta a sala 3D");
                            System.out.println("Ingrese la cantidad de entradas a comprar");
                            cant_salas = teclado.nextInt();

                            nombre_sala = lista_sala.get(1).getNombre_sala();
                            precio_sala = lista_sala.get(1).getPrecio();

                            do {

                                sala.voucherCliente(nombre_sala, cant_salas, precio_sala);
                                System.out.println("¿Confirma la venta?");
                                System.out.println("1. Si, ");
                                System.out.println("2. No, ");
                                opc_confirmar = teclado.nextInt();

                                if (opc_confirmar == 1) {
                                    cant_3d += cant_salas;
                                    cant_total += cant_salas;
                                    confirmar_venta = true;
                                } else if (opc_confirmar == 2) {
                                    break;
                                } else {
                                    System.out.println("Ingrese una opción válida. ");
                                }

                            } while (!confirmar_venta);

                            break;
                         case 3:
                            System.out.println("Venta a sala 3D");
                            System.out.println("Ingrese la cantidad de entradas a comprar");
                            cant_salas = teclado.nextInt();

                            nombre_sala = lista_sala.get(2).getNombre_sala();
                            precio_sala = lista_sala.get(2).getPrecio();

                            do {

                                sala.voucherCliente(nombre_sala, cant_salas, precio_sala);
                                System.out.println("¿Confirma la venta?");
                                System.out.println("1. Si, ");
                                System.out.println("2. No, ");
                                opc_confirmar = teclado.nextInt();

                                if (opc_confirmar == 1) {
                                    cant_tradicional += cant_salas;
                                    cant_total += cant_salas;
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
    public static void Menu_principal() {

        boolean repetir = true;
        int opt;
        while (repetir) {
            System.out.println("1.- Ingresar los precios de las salas");
            System.out.println("2.- Venta de entradas");
            System.out.println("3.- Cierre de caja");
            System.out.println("4.- salir");
            opt = teclado.nextInt();
            switch (opt) {
                case 1:
                    ingresar_sala();
                    break;
                case 2:
                   if(lista_sala.size() > 0){
                        Venta_entradas();
                   }else{
                        System.out.println("No hay precios creados. Por favor, ingrese los datos en la opción 1 del menú principal.");
                    }
                  
                    break;
                case 3:
                    if (lista_sala.size() > 0) {
                         Cierre_Caja();
                    }else{
                        System.out.println("No hay precios creados. Por favor, ingrese los datos en la opción 1 del menú principal.");
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
    public static void Cierre_Caja(){
        double total;
        total = cant_gigante * lista_sala.get(0).getPrecio() + cant_3d * lista_sala.get(1).getPrecio() + cant_tradicional * lista_sala.get(2).getPrecio();
        System.out.println("********* CIERRE DE CAJA *********");
        System.out.println("Cantidad total de entradas vendidas: " + cant_total);
        System.out.println("Cantidad de ventas 'Sala Gigante' : " + cant_gigante);
        System.out.println("Cantidad de ventas 'Sala 3D' : " + cant_3d);
        System.out.println("Cantidad de ventas 'Tradicional' : " + cant_tradicional);
        System.out.println("TOTAL RECAUDADO: $ " + total);
        
    }

    public static void main(String[] args) {
       
        System.out.println("Bienvenido a Fan's Levi\n");
        Menu_principal();

        
        
    }
    

}