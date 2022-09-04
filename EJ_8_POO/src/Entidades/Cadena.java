

package Entidades;

/**
 *
 * 
 */
public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public void mostrarVocales(){
        int c=0;
        for (int i = 0; i < longitud; i++) {
           
            if(frase.substring(i, i+1).equalsIgnoreCase("A") || frase.substring(i, i+1).equalsIgnoreCase("e") || frase.substring(i, i+1).equalsIgnoreCase("i") || frase.substring(i, i+1).equalsIgnoreCase("o") || frase.substring(i, i+1).equalsIgnoreCase("u") ){
                c++;
            }
        }
        
    }
    
    public void invertirFrase(){
        for (int i = longitud-1; i ==0  ; i--) {
            System.out.println(frase.substring(i, i+1));
        }
    }
    
    public void vecesRepetido(String letra){
        int c=0;
        for (int i = 0; i < longitud; i++) {
            if(frase.substring(i, i+1).equals(letra)){
                c++;
            }
            
        }
        System.out.println("La cantidad de veces que se repite la letra es: "+c);
    }
    
    public void compararLongitud(String frase2){
        if (longitud==frase2.length()) {
            System.out.println("La longitud de la nueva frase ingresada es igual a la frase");
        }else{System.out.println("La longitud de la nueva frase no coincide con la de la frase anterior");}
    }
    
    public void unirFrases(String frase2){
        System.out.println("La unión de las dos frases: "+frase.concat(" "+frase2)) ;
    }
    
    public void reemplazar(String caracter){
        String cadena;
        //for (int i = 0; i < longitud; i++) {
        //    if(frase.substring(i, i+1).equalsIgnoreCase("a")){
                cadena = frase.replace("a", caracter);
        //    }
        System.out.println("La frase original es: "+frase+", y la frase resultante es: "+cadena);
        }
    
    public boolean contiene(String letra2){
        for (int i = 0; i < longitud; i++) {
            if(frase.substring(i, i+1).equals(letra2)){
                return true;
            }
            
        }
        return false;
    }
    
    
    }

