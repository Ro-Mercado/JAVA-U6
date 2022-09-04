

package Entidad;

import java.util.Scanner;

/**
 *
 * 
 */
public class Ahorcado {
       Scanner leer=new Scanner(System.in);
    private String[] palabra;
    private int find,jugadasmax;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int jugadasmax) {
        this.palabra = palabra;
        this.jugadasmax = jugadasmax;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getJugadasmax() {
        return jugadasmax;
    }

    public void setJugadasmax(int jugadasmax) {
        this.jugadasmax = jugadasmax;
    }

    public void crearJuego(){
     
        System.out.print("Ingrese la palabra a adivinar: ");
        String p=leer.nextLine();
        palabra=new String[p.length()];
        System.out.print("Ingrese la cantidad de jugadas máximas: ");
        jugadasmax=leer.nextInt();
        find=0;
        for (int i = 0; i < palabra.length; i++) {
            palabra[i]=p.substring(i, i+1); 
        }
        System.out.println(" ");
       /* 
        }*/
    }
    public void longitud(){
        System.out.println("Longitud de la palabra: "+palabra.length);
    }
    public void buscar(String letra){
        int i=0;
        boolean r=false;
        while(i<=(palabra.length-1) && !letra.equals(palabra[i]) ){
            i++;   
        }
        if(i<=(palabra.length-1)){
            System.out.println("La letra pertenece a la palabra");
            find+=1;
        }else{
            System.out.println("La letra ingresada no pertenece a la palabra");
        }
    }
    
    public void encontradas(){
        System.out.println("Número de letras (encontradas, faltantes): ("+find+" , "+(palabra.length-find)+")" );
    }
    
    public void intentos(){
        jugadasmax-=1;
        if (jugadasmax>0) {
            System.out.println("Intentos restantes: "+jugadasmax);
        }
        else{
            System.out.println("Lo sentimos, no hay más intentos");
        }
       
    }
    
    public void juego(){
        String l;
        while(jugadasmax>0 && find!=palabra.length){
           System.out.println("Ingrese una letra");
           l=leer.next();
           while(l.length()!=1){
               System.out.println("Por favor ingrese solo una letra");
               l=leer.next();
           }
           longitud();
           buscar(l);
           encontradas();
           intentos();
           System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        
        }
        if(find==palabra.length){
            System.out.println("¡FELICITACIONES!\nADIVINÓ LA PALABRA");
             System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        }else{
            System.out.println("La palabra no fue adivinada :(");
             System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        }
    }
    public void muestra(){
        System.out.println("\nPALABRA DEL AHORCADO: ");
        for (String elem : palabra) {
            System.out.print(elem);
         }
        System.out.println("");
    }        
}
