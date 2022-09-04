/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServicioOperacion;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * 
 */
public class ServicioOperacion {
    Scanner leer=new Scanner(System.in);
    
    public Operacion CrearOperacion(){
    
    Operacion op = new Operacion();
        System.out.println(" Ingrese dos numeros ");
        op.setNum1(leer.nextInt());
        op.setNum2(leer.nextInt());
        return op;
    }


public int Sumar(Operacion op){
   
    
    return op.getNum1()+op.getNum2();
            
}

   public  void restar(Operacion op){
   
    
       System.out.println("La resta es: "+(op.getNum1()-op.getNum2())); 
            
}
 
   public int Multiplicar (Operacion op){
       if (op.getNum1()==0||op.getNum2()==0){
           System.out.println(" Alguno de los numeros ingresados es 0");
           return 0;
       }
       else {
       return op.getNum1()*op.getNum2();
       }   
   }
    public int Division (Operacion op){
       if (op.getNum1()==0||op.getNum2()==0){
           System.out.println(" Alguno de los numeros ingresados es 0");
           return 0;
       }
       else {
       return op.getNum1()/op.getNum2();
       }   
  
}

}
