

package ServicioMates;

import Entidad.Matematica;

/**
 *
 * 
 */
public class ServiMates {
    public Matematica crearMates(){
        Matematica m1=new Matematica();
        m1.setN1((float)(Math.random()*10));
        m1.setN2((float)(Math.random()*10));
        
       return m1;    
    }
    public void mostrarnum(Matematica m){
        System.out.println("Numeros randoms: "+m.getN1()+" y "+m.getN2());
    }
    public float devolverMayor(Matematica m){
        if(m.getN1()>m.getN2()){
            return m.getN1();
        } else{ return m.getN2();}
    }
    public void calcularPotencia(Matematica m){
        float num= Math.round(devolverMayor(m));
        if (devolverMayor(m)==m.getN1()){
            System.out.println("La potencia de "+num+" elevado a "+Math.round(m.getN2())+" es: "+((float)(Math.pow(num, Math.round(m.getN2())))));
        }else{System.out.println("La potencia de "+num+" elevado a "+Math.round(m.getN1())+" es: "+((float)(Math.pow(num, Math.round(m.getN1())))));}
        
    }
    public static void calcularRaiz(Matematica m){
      
         if(m.getN1()<m.getN2()){
             System.out.println("La raíz de "+m.getN1()+" (más pequeño) es: "+(float)(Math.sqrt( Math.abs(m.getN1()))));
        } else{   System.out.println("La raíz de "+m.getN2()+" (más pequeño) es: "+(float)(Math.sqrt( Math.abs(m.getN2()))));}      
        
                
    }
    
    
    
}
