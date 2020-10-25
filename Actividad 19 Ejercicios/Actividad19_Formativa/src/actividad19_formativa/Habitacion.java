/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad19_formativa;

import java.time.LocalDate;

/**
 *
 * @author Criswxart
 */
public class Habitacion {
    private Paciente p;
    private int numero;
    private char tipo;
    private LocalDate fechaIngreso;
    private int dias;

    public Habitacion(Paciente p, int numero, char tipo, LocalDate fechaIngreso, int dias) {
        this.p = p;
        this.numero = numero;
        this.tipo = tipo;
        this.fechaIngreso = fechaIngreso;
        this.dias = dias;
    }

    public Paciente getP() {
        return p;
    }

    public void setP(Paciente p) {
        this.p = p;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "p=" + p + ", numero=" + numero + ", tipo=" + tipo + ", fechaIngreso=" + fechaIngreso + ", dias=" + dias + '}';
    }
    
    public String imprimirDatos(){
        String salida ="";
        String alta ="";
        if(p.isAlta())
            alta = "ALTA MÉDICA";
        else
            alta = "NO TIENE ALTA MÉDICA.";
        
        
        salida = salida + "____________________________________________\n";
        salida = salida + "            CLÍNICA SANITA                  \n";
        salida = salida + " ____________________________________________\n";
        salida = salida +  numero + "    " + p.getRut() + "  " + p.getNombre() + " " + p.getApellido() + " " + p.getPeso() + " " + alta;

        return salida;
    }
  
    public int calcularDescuento(){
        int descuento = 0;
        if(tipo=='A' && dias>5 && p.isAlta())
            descuento = 15;
        
        return descuento;
    }
    
    public boolean fechadeIngresoHoy(LocalDate fechaHoy){
        
        if(fechaIngreso == fechaHoy){
            return true;
        }else{
            return false;
        }
           
    }
    
}
