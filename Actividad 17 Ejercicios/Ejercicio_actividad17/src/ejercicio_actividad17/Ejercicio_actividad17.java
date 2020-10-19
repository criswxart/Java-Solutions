package ejercicio_actividad17;

import java.util.ArrayList;

/**
 *
 * @author Criswxart
 */
public class Ejercicio_actividad17 {

    public static void main(String[] args) {
       
       
        double mayor_temp, menor_temp;
        Mes aux;
        ArrayList<Mes> lista_temp = new ArrayList<>();
        
        for (int i = 0; i < 31; i++) {
            
            aux = new Mes("Enero", (i+1),(Math.random()*40));
            lista_temp.add(aux);
            
        }
        for (Mes mes : lista_temp) {
            System.out.println(mes.toString());
        }
        
        mayor_temp = lista_temp.get(0).getTemperatura();
        menor_temp = lista_temp.get(0).getTemperatura();
        
        for (Mes mes : lista_temp) {
           
            if ( mes.getTemperatura() > mayor_temp) {
                mayor_temp = mes.getTemperatura();
            }
            if ( mes.getTemperatura() < menor_temp  ) {
                menor_temp = mes.getTemperatura();
            }
            
        }
        
        System.out.println("La mayor temperatura de enero es:" +mayor_temp);
        System.out.println("La menor temperatura de enero es:" +menor_temp);

        
    }
    
}
