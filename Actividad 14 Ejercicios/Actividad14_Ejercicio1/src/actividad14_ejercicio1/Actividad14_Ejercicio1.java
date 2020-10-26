package actividad14_ejercicio1;

import java.util.Scanner;
/**
 *
 * @author Cristian
 * @version 1.0
 */
public class Actividad14_Ejercicio1 {

    public static void mostrarMenu(int num) {
        
        System.out.println("********* RAPIDIX EXPRESS *********");
        System.out.println("¿Cual es su comida favorito? cliente " + num );
        System.out.println("1. Hamburguesa");
        System.out.println("2. Churrasco");
        System.out.println("3. Lomito");
        System.out.println("4. Completo");
        System.out.println("");
    }

    public static void main(String[] args) {
        int cantidad, opt, hamb = 0, churr = 0, lom = 0, comp = 0;
        String preferido = "";
        boolean flag = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de clientes");

        cantidad = scan.nextInt();
        //validacion
        if (cantidad < 0) {
            while (!flag) {
                System.out.println("Ingrese una cantidad válida");
                cantidad = scan.nextInt();
                if (cantidad >= 0) flag = true;
            }
        }

        for (int i = 0; i < cantidad; i++) {
            mostrarMenu(i + 1);
            opt = scan.nextInt();

            if (opt < 1 || opt > 4) {
                //validacion
                flag = false;
                while (!flag) {
                    System.out.println("Ingrese una opción válida");
                    opt = scan.nextInt();
                    if (opt >= 1 && opt <= 4) flag = true;
                }

            } else {
                switch (opt) {
                    case 1:
                        hamb++;
                        break;
                    case 2:
                        churr++;
                        break;
                    case 3:
                        lom++;
                        break;
                    case 4:
                        comp++;
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            }
        }

        if (hamb > churr && hamb > lom && hamb > comp) {
            preferido = "hamburguesa";
        } else if (churr > hamb && churr > lom && churr > comp) {
            preferido = "Churrasco";
        } else if (lom > hamb && lom > churr && lom > comp) {
            preferido = "Lomito";
        } else if (comp > churr && comp > lom && comp > hamb) {
            preferido = "Completo";
        } else {
            preferido = "No hay un sándwich preferido";
        }

        System.out.println("El sándwich preferido es: " + preferido);
    }
    
}
