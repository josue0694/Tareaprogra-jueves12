/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistematransporte;

/**
 *
 * @author Josue
 */
public class Autobus extends Reserva {
    private String ruta;
    private String empresa;

    public Autobus(String origen, String destino, String fecha, String hora, String ruta, String empresa) {
        super(origen, destino, fecha, hora);
        this.ruta = ruta;
        this.empresa = empresa;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public boolean validar() {
        return ruta != null && !ruta.isEmpty()
            && empresa != null && !empresa.isEmpty();
    }

    @Override
    public void procesar() {
        System.out.println("Procesando reserva de Autobús...");
        if (validar()) {
            System.out.println("Reserva de Autobús (Ruta " + ruta + 
                               ") enviada a revisión manual por " + empresa);
        } else {
            System.out.println("Error: Datos del autobús incompletos.");
        }
    }
}

    
    


    
    
   
    

