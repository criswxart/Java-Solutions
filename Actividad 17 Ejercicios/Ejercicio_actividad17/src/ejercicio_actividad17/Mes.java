package ejercicio_actividad17;

/**
 *
 * @author Criswxart
 */
public class Mes {
    
    
    private String Nombre;
    private int dia;
    private double temperatura;
    
    
    public Mes(String Nombre, int dia, double temperatura) {
        this.Nombre = Nombre;
        this.dia = dia;
        this.temperatura = temperatura;
    }

  
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Mes{" + "Nombre=" + Nombre + ", dia=" + dia + ", temperatura=" + temperatura + '}';
    }
    
    
    
}
