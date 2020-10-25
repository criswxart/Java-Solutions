package actividad19_ejercicio1;
/**
 * @author Cristian Godoy
 * @version 1.0
 */
public class PeliculaOSerie {
    
    private String titulo;
    private int duracionMinutos;
    private String resena;
    private Director director;
    private Distribuidora distribuidora;

    public PeliculaOSerie(String titulo, int duracionMinutos, String resena, Director director, Distribuidora distribuidora) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.resena = resena;
        this.director = director;
        this.distribuidora = distribuidora;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getResena() {
        return resena;
    }

    public void setResena(String resena) {
        this.resena = resena;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Distribuidora getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(Distribuidora distribuidora) {
        this.distribuidora = distribuidora;
    }

    @Override
    public String toString() {
        return "Pelicula o Serie: \n" 
             + "Título: " + titulo + "\n"
             + "Duración: " + duracionMinutos + " min. \n"
             + "Reseña: " + resena + "\n"
             + "Director: " + director.getNombreDirector() + "\n"
             + " * Oscar: " + director.isOscar() + "\n"
             + " * Nacionalidad: " + director.getNacionalidad() + "\n"
             + "Distribuidora: " + distribuidora.getNombreDistri() + "\n"
             + " * Fecha de creación: " + distribuidora.getAnoFundacion(); 
    }
    
    
}
