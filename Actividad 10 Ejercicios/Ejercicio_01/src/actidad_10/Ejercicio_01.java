package actidad_10;
/**
 *
 * @author Criswxart
 */
public class Ejercicio_01 {

    //Método para sumar pares
    public static void suma_pares(){
        //Declaración de varibles principales
        int num_par, suma, i;
        
        //Inicialización de varibles
        i = 0;
        suma = 0;
        num_par = 2;
        
        //Solución
        System.out.println("Los primeros 10 números pares son: ");
        
        while (i < 10) {
            if (num_par % 2 == 0) {
                System.out.print(num_par + "|");
                suma = suma + num_par;
                i++;
            }
            num_par++;
        }
        System.out.println("");
        System.out.print("La suma de los 10 primeros números pares es: " + suma);
        System.out.println("");
        
    }
    public static void main(String[] args) {
      
        //Llamar a la función
        suma_pares();
        
    }
    
}
