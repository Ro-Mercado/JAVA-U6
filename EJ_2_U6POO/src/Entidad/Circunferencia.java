/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

/**
 *
 * 
 */
public class Circunferencia {

    private float radio;

    public Circunferencia() {
        
    }
     
    
//  a) Método constructor que inicialice el radio pasado como parámetro.
    public Circunferencia(float radio) {
      
        this.radio=radio;
    }
    
   
   //  b) Métodos get y set para el atributo radio de la clase Circunferencia.

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    
}
