/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_prueba_u6poo.servicios;

import ej_prueba_u6poo.entidades.Mascota;
import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class ServicioMascota {
    private final Scanner leer=new Scanner (System.in).useDelimiter("\n");
     
    public Mascota crearMascota(){
        System.out.println("Intorducir nombre");
        String nombre=leer.next();
        
         System.out.println("Intorducir apodo");
        String apodo=leer.next();
        
         System.out.println("Intorducir tipo de mascota");
        String tipo=leer.next();
        
         System.out.println("Intorducir raza de "+tipo);
        String raza=leer.next();
        
         System.out.println("Intorducir color");
        String color=leer.next();
        
         System.out.println("Intorducir  edad");
        int edad=leer.nextInt();
        
         System.out.println("Intorducir true si tiene cola, sino false");
        boolean cola=leer.nextBoolean();
        
       return new Mascota(nombre, apodo, tipo, raza, color, edad, cola); 
    }
}
