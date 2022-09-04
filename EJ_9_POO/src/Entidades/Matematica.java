

package Entidades;

/**
 *
 * 
 */
public class Matematica {
    float n1,n2;

    public Matematica() {
    }

    public Matematica(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }
    /*
     m.devolverMayor();
        m.calcularPotencia();
        m.calcularRaiz();
    */
    public void mostrarnum(){
        System.out.println("Numeros randoms: "+n1+" y "+n2);
    }
    public float devolverMayor(){
        if(n1>n2){
            return n1;
        } else{ return n2;}
    }
    public void calcularPotencia(){
        float num= Math.round(devolverMayor());
        if (devolverMayor()==n1){
            System.out.println("La potencia de "+num+" elevado a "+Math.round(n2)+" es: "+((float)(Math.pow(num, Math.round(n2)))));
        }else{System.out.println("La potencia de "+num+" elevado a "+Math.round(n1)+" es: "+((float)(Math.pow(num, Math.round(n1)))));}
        
    }
    public void calcularRaiz(){
      
         if(n1<n2){
             System.out.println("La raíz de "+n1+" (más pequeño) es: "+(float)(Math.sqrt( Math.abs(n1))));
        } else{   System.out.println("La raíz de "+n2+" (más pequeño) es: "+(float)(Math.sqrt( Math.abs(n2))));}       
                
    }
    
    
    
    
}
