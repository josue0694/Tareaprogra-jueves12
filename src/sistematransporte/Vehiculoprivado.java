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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean validar() {
        return "ABC123".equals(this.matricula);
    }

    public String enviarConfirmacion() {
        return ("Viaje confirmado, por favor espere en el punto");
    }

    public void procesar() {
        try {
            if (validar()) {
                System.out.println("Matricula resgistrada " + "\n" + enviarConfirmacion());
            } else {
                throw new Exception("Error,Matricula no resgistrada en el sistema");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de vehiculo-->Vehiculoprivado" + "\n Matricula: " + matricula;
    }

}
