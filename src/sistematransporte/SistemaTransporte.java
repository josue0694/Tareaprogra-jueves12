/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistematransporte;

/**
 *
 * @author Josue
 */
public class SistemaTransporte {

    public static void procesarReserva(Reserva r) {
        System.out.println(r);
        r.procesar();
    } 

    public static void main(String[] args) {

        Reserva taxi = new Taxi("SAN JOSE", "HEREDIA", "06/02/2026", "8:00", "TAX912");
        Reserva vehiculo = new Vehiculoprivado("CARTAGO", "SAN JOSE", "06/02/2026", "9:00", "AWX453");
        Reserva bus = new Autobus("ALAJUELA", "PUNTARENAS", "09/02/2026", "10:00", "R45", "PUERTO");

        procesarReserva(taxi);
        procesarReserva(vehiculo);
        procesarReserva(bus);
    }
}
