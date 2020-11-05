package actividad29_evaluaciongrupal;
/**
 *
 * @author Criswxart
 */
public class Vehiculo {
    
    
    private String patente;
    private boolean estadoRevisionTecnica;
    private int kilometraje;
    private int anio;
    private Dueno dueno;

    public Vehiculo(String patente, boolean estadoRevisionTecnica, int kilometraje, int anio, Dueno dueno) {
        this.patente = patente;
        this.estadoRevisionTecnica = estadoRevisionTecnica;
        this.kilometraje = kilometraje;
        this.anio = anio;
        this.dueno = dueno;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public boolean isEstadoRevisionTecnica() {
        return estadoRevisionTecnica;
    }

    public void setEstadoRevisionTecnica(boolean estadoRevisionTecnica) {
        this.estadoRevisionTecnica = estadoRevisionTecnica;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", estadoRevisionTecnica=" + estadoRevisionTecnica + ", kilometraje=" + kilometraje + ", anio=" + anio + ", dueno=" + dueno + '}';
    }
    
    
    
}
