

package Entidad;

import java.util.Scanner;

/**
 *
 * 
 */
public class NIF {
    private long dni;
    private String letra;
    private String[] A={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

    public NIF() {
    }

    public NIF(long dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    public String otorgarLetra(long dni){  
       
        return A[(int) (dni%23)];
    }
    public void crearNif(){
      
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese su número de dni (SIN ESPACIOS NI PUNTOS):");
        dni=leer.nextLong();
        letra=otorgarLetra(dni);
        
    }
    public void mostrar(){
        System.out.println("NIF: "+dni+"-"+letra);
    }
}
