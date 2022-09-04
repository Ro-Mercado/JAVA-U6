

package ServicioRectangulos;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * 
 */
public class ServRectangulo {
 Scanner leer=new Scanner(System.in);
 
 public Rectangulo crearRectangulo(){
     System.out.println("Ingrese la base del rectángulo");
     float base=leer.nextFloat();
     new Rectangulo().setBase(base);
     System.out.println("Ingrese la altura del rectángulo");
     float alt=leer.nextFloat();
     new Rectangulo().setBase(alt);
     return new Rectangulo(base,alt);
 }
 
 public void superficie(Rectangulo rec){
     System.out.println("SUPERFICIE: "+(rec.getBase()*rec.getAlt()));
 }
 
 public void perimetro(Rectangulo rec){
     System.out.println("PERÍMETRO: "+((rec.getBase()+rec.getAlt())*2));
 }    
 
public void mostrar(Rectangulo rec){
    for (int i = 0; i < rec.getAlt(); i++) {
        for (int j = 0; j < rec.getBase(); j++) {
            if (i==0 || j==0 || i==rec.getBase()-1 || j==rec.getAlt()-1){
                System.out.print("*");
            }else{System.out.print(" ");}
            
        }
        System.out.println(" ");
    }
}
 
}
