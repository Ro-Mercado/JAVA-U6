

package PersonaService;

import Entidades.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * 
 */
public class ServPerso {
 Persona pers=new Persona();
    
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        Persona pers1=new Persona();
        System.out.println("Ingresar nombre de la persona");
        pers1.setNombre(leer.next());
        System.out.println("Ingresar fecha de nacimiento de "+pers1.getNombre()+ " (separando dia, mes y año con un espacio)");
        int dia=leer.nextInt();
        int mes=leer.nextInt();
        int anio=leer.nextInt();
        LocalDate fecha=LocalDate.of(anio, mes, dia);
        pers1.setNacimiento(fecha);
        return pers1;
    }
    
    public int calcularEdad(Persona pers){
        LocalDate fechaActual=LocalDate.now();
        LocalDate fecha=pers.getNacimiento();
        Period edad;
        edad = Period.between(fecha, fechaActual);
        return edad.getYears();
    }
    
    public boolean menorQue(Persona pers, int edad){
        boolean bandera=false;
        if (calcularEdad(pers)<edad) {
            bandera=true;
        }
        return bandera;
    }
    
    public void motrarPersona(Persona pers){
        System.out.println(pers);
    }
}
