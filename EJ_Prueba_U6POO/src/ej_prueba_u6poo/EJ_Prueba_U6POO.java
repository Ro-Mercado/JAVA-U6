/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_prueba_u6poo;

import ej_prueba_u6poo.entidades.Mascota;
import ej_prueba_u6poo.servicios.ServicioMascota;

/**
 *
 *
 */
public class EJ_Prueba_U6POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        /////////////////////Para leer la raza se pone leer.next()
       // Mascota m1 = new Mascota("Fernando Chiquito", "Chiquito", "Perro", "Beagle", "Tricolor", 14, true);
        
       ServicioMascota sm=new ServicioMascota();
       Mascota m1 =sm.crearMascota();
        
        m1.setNombre("Pepe Chiquito");
        
        System.out.println("MASCOTA AL INICIO\n"+m1);
        m1.pasear(150);
        System.out.println("Mascota con cambio de energía 1:\n"+m1.toString());
        m1.pasear(100, 5);
        System.out.println("Mascota con cambio de energía 2:\n"+m1.toString());
        
    }

}
