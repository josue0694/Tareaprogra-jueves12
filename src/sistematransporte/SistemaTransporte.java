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
    } // PRUEBA

    public static void main(String[] args) {

        //Reserva taxi = new Taxi("San José", "Heredia", "06/02/2026", "8:00", "LIC123");
        Reserva vehiculo = new Vehiculoprivado("Cartago", "SJ", "06/02/2026", "9:00", "ABC123");
        //Reserva bus = new Autobus("Alajuela", "SJ", "06/02/2026", "10:00", "R45", "TUASA");

        //procesarReserva(taxi);
        procesarReserva(vehiculo);
        //procesarReserva(bus);
    }// PRUEBA
}
