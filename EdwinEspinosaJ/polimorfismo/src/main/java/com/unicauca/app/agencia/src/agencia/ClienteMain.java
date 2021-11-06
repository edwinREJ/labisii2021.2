package agencia;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import modelo.*;
public class ClienteMain {

	public static List<Viaje> viajes = new ArrayList();
	
	public static void main(String[] args) {
	
		leerViajes();
		mostrarViajes();

	}
	public static void leerViajes() {
		try {
				Viaje viaje1 = new ViajeFamiliar("Popayán", "Bogotá", 1250000, new
				SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), new
				SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), 5);
				viajes.add(viaje1);
				Viaje viaje2 = new ViajeIncentivo("Popayán", "Medellin", 2100000, new
				SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new
				SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel");
				viajes.add(viaje2);
				Viaje viaje3 = new ViajeIndividual("Popayán", "San Andres", 4250000,
				new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new
				SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
				viajes.add(viaje3);
				Viaje viaje4 = new ViajeTodoIncluido("Popayán", "Cartagena", 7350000,
				new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new
				SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
				viajes.add(viaje4);
		} catch (ParseException ex) {
			//No se porque no me funciono el catch si importe todo lo que pedia 
			//Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null,ex);
			System.out.println("Error");
		}
	}
	public static void mostrarViajes() {
		
		for (Viaje viaje : viajes) {
				System.out.println("Origen: " + viaje.getOrigen());
				System.out.println("Destino: " + viaje.getDestino());
				System.out.println("Fecha salida: " + viaje.getFechaSalida());
				System.out.println("Fecha llegada: " + viaje.getFechaLlegada());
				System.out.println("Costo: " + viaje.getCosto());
				System.out.println("Descripción: " + viaje.descripcion());
				System.out.println("Cualquier método: " + viaje.cualquierMetodo());
				System.out.println("Cualquier método2: " + viaje.cualquierMetodo2());
				System.out.println("");
		}
	}

}
