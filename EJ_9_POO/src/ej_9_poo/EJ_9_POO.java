

package ej_9_poo;

import Entidades.Matematica;


public class EJ_9_POO {

    /**
     * @param args the command line arguments
     * Realizar una clase llamada Matemática que tenga como atributos dos números reales con
    los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
    constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
    Math.random para generar los dos números y se guardaran en el objeto con su
    respectivos set. Deberá además implementar los siguientes métodos:
    a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
    al menor número. Previamente se deben redondear ambos valores.
    c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
     */
    public static void main(String[] args) {
        Matematica m=new Matematica();
        m.setN1((float)(Math.random()*10));
        m.setN2((float)(Math.random()*10));
        m.mostrarnum();
        System.out.println("El mayor de los números es: "+m.devolverMayor()); 
        m.calcularPotencia();
        m.calcularRaiz();
    }

}
