

package ej_12correccion_poo;

import Entidades.Persona;
import PersonaService.ServPerso;
import java.util.Scanner;


public class EJ_12Correccion_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServPerso perserv=new ServPerso();
        Persona pers1=perserv.crearPersona();
        System.out.println("La edad de "+pers1.getNombre()+" es de "+perserv.calcularEdad(pers1));
        System.out.println("Ingrese la edad de otra persona a comparar");
        int edad=leer.nextInt();
        System.out.println("¿"+pers1.getNombre()+" es menor que ésta última persona? "+perserv.menorQue(pers1, edad));
        perserv.motrarPersona(pers1);
    }

}
