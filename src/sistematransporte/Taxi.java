/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematransporte;

/**
 *
 * @author Josue
 */
public class Taxi extends Reserva implements Confirmable{
    private String Conductor;
   
    public Taxi(String origen, String destino, String fecha, String hora, String Conductor) {
        super(origen, destino, fecha, hora);
        this.Conductor = Conductor;
    }

    public String getConductor() {
        return Conductor;
    }

    public void setConductor(String Conductor) {
        this.Conductor = Conductor;
    }
    @Override
    public boolean validar() {
        return Conductor != null && !Conductor.isEmpty();
    }

    @Override
    public void enviarConfirmacion() {
        System.out.println("Enviando SMS: Su taxi ha sido confirmado.");
    }

   
    public void procesar() {
        System.out.println("Procesando reserva de Taxi...");
        if (validar()) {
            enviarConfirmacion();
        } else {
            System.out.println("Error: Su taxi no ha sido confirmado.");
        }
    }
}

