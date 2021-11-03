/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.unicauca.polimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fermt
 */
public class Polimorfismo {
    
    public static List<Viaje> viajes = new ArrayList(); 
    
    public static void main(String[] args) {
        try {
            leerViajes();
            mostrarViajes(); 
        } catch (ParseException ex) {
            Logger.getLogger(Polimorfismo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*
    * Lee viajes en el arreglo polimórfico 
    */ 
    public static void leerViajes() throws ParseException {
        try {
            Viaje viaje1 = new ViajeFamiliar("Popayán", "Bogotá", 1250000, new  SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), new  SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), 5); 
            viajes.add(viaje1);

            Viaje viaje2 = new ViajeIncentivo("Popayán", "Medellin", 2100000, new  SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new  SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel"); 
            viajes.add(viaje2);

            Viaje viaje3 = new ViajeIndividual("Popayán", "San Andres", 4250000,  new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new  SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019")); 
            viajes.add(viaje3);

            Viaje viaje4 = new ViajeTodoIncluido("Popayán", "Cartagena", 7350000,  new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new  SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019")); 
            viajes.add(viaje4);    
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(Polimorfismo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    } 
    
    /*
    * Recorre e imprime datos del arreglo polimófico 
    */ 
    public static void mostrarViajes() { 
        // En este caso vemos que todos los viajes ejecutan el método  "descripcion()" de forma diferente
        // ya que al ser este método abstracto en la clase padre, les forzamos a  las clases hijas a que
        // implementen ese método.
        viajes.stream().map(viaje -> {
            System.out.println("Origen: " + viaje.getOrigen());
            return viaje;
        }).map(viaje -> { 
            System.out.println("Destino: " + viaje.getDestino());
            return viaje;
        }).map(viaje -> {
            System.out.println("Fecha salida: " + viaje.getFechaSalida());
            return viaje;
        }).map(viaje -> {
            System.out.println("Fecha llegada: " + viaje.getFechaLlegada());
            return viaje;
        }).map(viaje -> {
            System.out.println("Costo: " + viaje.getCosto());
            return viaje;
        }).map(viaje -> {
            System.out.println("Descripción: " + viaje.descripcion());
            return viaje;
        }).map(viaje -> {
            System.out.println("Cualquier método: " + viaje.cualquierMetodo());
            return viaje;
        }).map(viaje -> {
            System.out.println("Cualquier método2: " + viaje.cualquierMetodo2());
            return viaje;
        }).forEachOrdered(_item -> {
            System.out.println("");
        });
   } 

}
