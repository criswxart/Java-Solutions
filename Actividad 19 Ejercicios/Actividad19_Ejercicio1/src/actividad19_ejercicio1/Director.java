package actividad19_ejercicio1;
/**
 * @author Cristian Godoy
 * @version 1.0
 */
public class Director {
    
   private String nombreDirector;
   private String nacionalidad;
   private boolean oscar;

    public Director(String nombreDirector, String nacionalidad, boolean oscar) {
        this.nombreDirector = nombreDirector;
        this.nacionalidad = nacionalidad;
        this.oscar = oscar;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean isOscar() {
        return oscar;
    }

    public void setOscar(boolean oscar) {
        this.oscar = oscar;
    }

    @Override
    public String toString() {
        return "Director{" + "nombreDirector=" + nombreDirector + ", nacionalidad=" + nacionalidad + ", oscar=" + oscar + '}';
    }

   
    
    
    
}
