/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematransporte;

/**
 *
 * @author Josue
 */
public class Vehiculoprivado extends Reserva implements Confirmable {

    private String matricula;

    public Vehiculoprivado(String origen, String destino, String fecha, String hora, String matricula) {
        super(origen, destino, fecha, hora);
        this.matricula = matricula;
    }

    @Override
    public boolean validar() {
        return matricula != null && !matricula.equals("");
    }

    @Override
    public void procesar() {
        if (validar()) {
            System.out.println("Matricula registrada ");
            enviarConfirmacion();
        } else {
            System.out.println("Error,Matricula no resgistrada en el sistema");
        }
    }

    @Override
    public void enviarConfirmacion() {
        System.out.println("Viaje confirmado");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de vehiculo: Vehiculo Privado" + "\nMatricula: " + matricula;
    }
}
