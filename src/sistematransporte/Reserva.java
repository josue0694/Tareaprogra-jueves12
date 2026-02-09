/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematransporte;

/**
 *
 * @author Josue
 */
public abstract class Reserva {

    private String origen;
    private String destino;
    private String fecha;
    private String hora;

    public Reserva() {
        this.origen = "";
    }

    public Reserva(String origen, String destino, String fecha, String hora) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
    }

    public abstract boolean validar();

    public abstract void procesar();

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Reserva"
                + "\nOrigen:" + origen
                + "\nDestino:" + destino
                + "\nFecha=" + fecha
                + "\nHora=" + hora;
    }

}
