

package ej_8_poo;

import Entidades.Cadena;
import java.util.Scanner;


public class EJ_8_POO {

    /**
     * @param args the command line arguments
     * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
    y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
    que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
    través de los métodos set, se guardará la frase y la longitud de manera automática según
    la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
    ingresada.
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
    contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    compone la clase con otra nueva frase ingresada por el usuario.
    f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
    una nueva frase ingresada por el usuario y mostrar la frase resultante.
    g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
    frase resultante.
    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cadena c=new Cadena();
        System.out.println("Ingrese una frase");
        c.setFrase(leer.nextLine());
        c.setLongitud(c.getFrase().length());
        c.mostrarVocales();
        c.invertirFrase();
        System.out.println("Ingrese una letra ");
        String letra=leer.nextLine();
        c.vecesRepetido(letra);
        System.out.println("Ingrese una nueva frase");
        String frase2=leer.nextLine();
        c.compararLongitud(frase2);
        c.unirFrases(frase2);
        System.out.println("Ingrese un caracter para reemplazar la letra a");
        String caracter=leer.nextLine();
        c.reemplazar(caracter);
        System.out.println("Ingrese otra letra a buscar");
        String letra2=leer.nextLine();
        if(c.contiene(letra2)==true){
            System.out.println("La letra se encontró en la frase");
        }else{System.out.println("La letra no se encontró en la frase");}
    }

}
