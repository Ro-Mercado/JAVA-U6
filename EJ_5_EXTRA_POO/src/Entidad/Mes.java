

package Entidad;

import java.util.Scanner;

/**
 *
 * 
 */
public class Mes {
   private String[] Array= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","nomviembre","diciembre"};
   private String mesSecreto=Array[9];

    public Mes() {
    }

    public Mes(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getArray() {
        return Array;
    }

    public void setArray(String[] Array) {
        this.Array = Array;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
  /*  public  void rellenar(){
        Array[0]="enero";
        Array[1]="febrero";
        Array[2]="marzo";
        Array[3]="abril";
        Array[4]="mayo";
        Array[5]="junio";
        Array[6]="julio";
        Array[7]="agosto";
        Array[8]="septiembre";
        Array[9]="octubre";
        Array[10]="noviembreo";
        Array[11]="diciembre";
        
        mesSecreto=Array[5];
    }*/
   public void adivinar(){
       Scanner leer=new Scanner (System.in);
       System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
       String mes=leer.nextLine();
       while(!mes.equals(mesSecreto)){
           System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes:");
           mes=leer.nextLine();
       }
       System.out.println("¡Ha acertado!");
   }
   
}
