/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServicioCircunferencia;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * 
 */
public class ServicioCircunferencia {
    private final Scanner leer=new Scanner (System.in).useDelimiter("\n");
    
 //c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    
    public Circunferencia crearCircunferencia(){
        System.out.println("Introduzca el radio de la circunferencia");
        float rad=leer.nextFloat();
        new Circunferencia().setRadio(rad);
        return new Circunferencia(rad);
    }
    
    
    
     //d) Método area(): para calcular el área de la circunferencia (Área = pi ∗ radio^2).
    public float area(Circunferencia c){
        
        return (float)(Math.PI)*(float)(Math.pow(c.getRadio(), 2));
    }
    
    // e) Método perimetro(): para calcular el perímetro (Perímetro = 2 ∗ pi ∗ radio).
    
    public float perim(Circunferencia c){
        
        return (float)(Math.PI)*2*c.getRadio();
    }
    
    public void mostrar(Circunferencia c){
        System.out.println("Radio: "+c.getRadio());
        System.out.println("Área: "+area(c));
        System.out.println("Perímetro: "+perim(c));
    }
}
