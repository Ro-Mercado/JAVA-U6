/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_prueba_2_u6poo;

import Entidades.Persona;
import PersonaService.PersonaServicio;
import java.util.Scanner;

/**
 *
 * 
 */
public class EJ_Prueba_2_U6POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner (System.in).useDelimiter("\n");
        //Instanciación utilizando el constructor vacío
        Persona primPersona= new Persona();
        
        //Instaciación utilizasndo el constructor por parámetro
        Persona segPersona= new Persona();
        
        System.out.println("Ingrese su nombre");
        primPersona.setNombre(leer.next());
        
        System.out.println("Ingrese el DNI de la segunda persona (SIN PUNTOS)");
        segPersona.setDni(leer.nextInt());
        
        System.out.println("Nombre persona 1: "+primPersona.getNombre()); 
        System.out.println("DNI (sin inicializar)" +primPersona.getDni());
        
        System.out.println("Nombre persona 2: "+segPersona.getNombre());
        System.out.println("DNI: "+segPersona.getDni());
        ///////////////////////////////////////////////////////////
        ////////////////USANDO EL SERVICIO////////////////////////
        System.out.println("////////////////////////////////////////////////\n");
        
        PersonaServicio serv=new PersonaServicio();
        
        Persona tercerPersona= serv.crearPersona();
        
        serv.mostrarDatos(tercerPersona);
        
        
        
        
        
    }
    
}
