package actividad19_ejercicio1;

import java.time.LocalDate;

/**
 * @author Cristian Godoy
 * @version 1.0
 */
public class Distribuidora {
    
    private String NombreDistri;
    private LocalDate anoFundacion;

    public Distribuidora(String NombreDistri, LocalDate anoFundacion) {
        this.NombreDistri = NombreDistri;
        this.anoFundacion = anoFundacion;
    }

    public String getNombreDistri() {
        return NombreDistri;
    }

    public void setNombreDistri(String NombreDistri) {
        this.NombreDistri = NombreDistri;
    }

    public LocalDate getAnoFundacion() {
        return anoFundacion;
    }

    public void setAnoFundacion(LocalDate anoFundacion) {
        this.anoFundacion = anoFundacion;
    }

    @Override
    public String toString() {
        return "Distribuidora{" + "NombreDistri=" + NombreDistri + ", anoFundacion=" + anoFundacion + '}';
    }
    
    
    
}
