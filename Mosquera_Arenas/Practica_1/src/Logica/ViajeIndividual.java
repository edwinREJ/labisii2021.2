
package Logica;

import java.util.Date;

/**
 *
 * @author mandr
 */
public class ViajeIndividual extends Viaje{

    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }

    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }
    
    
}