/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaService;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * 
 */
public class PersonaServicio {
     Scanner leer=new Scanner (System.in).useDelimiter("\n");
     
     public Persona crearPersona(){
         Persona pers=new Persona();
         
         System.out.println("Ingrese el nombre");
         pers.setNombre(leer.next());
         
         System.out.println("Ingrese su apellido");
         pers.setApellido(leer.next());
         
         System.out.println("Ingrese su DNI, sin espacios ni puntos");
         pers.setDni(leer.nextInt());
         
         System.out.println("Ingrese su fecha de nacimiento");
         System.out.println("Ingrese el día");
         int dia=leer.nextInt();
         System.out.println("Ingrese el mes");
         int mes=leer.nextInt();
         System.out.println("Ingrese su año de nacimiento");
         int anio=leer.nextInt();
         Date Fecha=new Date(anio-1900,mes-1,dia);
         pers.setNacimiento(Fecha);
         
         return pers;
     }
     
     
     
     public void mostrarDatos(Persona p){
         System.out.println("Nombre y Apellido: "+ p.getNombre()+" "+p.getApellido());
         System.out.println("DNI: "+p.getDni());
         System.out.println("Fecha de nacimiento: "+ p.getNacimiento());
     }
     
}
