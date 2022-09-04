package ej_7_poo;

import Entidad.Persona;

public class EJ_7_POO {

    /**
     * @param args the command line arguments
     *
     * Realizar una clase llamada Persona que tenga los siguientes atributos:
     * nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si
     * el alumno desea añadir algún otro atributo, puede hacerlo. Los métodos
     * que se implementarán son: • Un constructor por defecto. • Un constructor
     * con todos los atributos como parámetro. • Métodos getters y setters de
     * cada atributo. • Metodo crearPersona(): el método crear persona, le pide
     * los valores de los atributos al usuario y después se le asignan a sus
     * respectivos atributos para llenar el objeto Persona. Además, comprueba
     * que el sexo introducido sea correcto, es decir, H, M o O. Si no es
     * correcto se deberá mostrar un mensaje • Método calcularIMC(): calculara
     * si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si
     * esta fórmula da por resultado un valor menor que 20, significa que la
     * persona está por debajo de su peso ideal y la función devuelve un -1. Si
     * la fórmula da por resultado un número entre 20 y 25 (incluidos),
     * significa que la persona está en su peso ideal y la función devuelve un
     * 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
     * significa que la persona tiene sobrepeso, y la función devuelve un 1. •
     * Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
     * devuelve un booleano. A continuación, en la clase main hacer lo
     * siguiente: Crear 4 objetos de tipo Persona con distintos valores, a
     * continuación, llamaremos todos los métodos para cada objeto, deberá
     * comprobar si la persona está en su peso ideal, tiene sobrepeso o está por
     * debajo de su peso ideal e indicar para cada objeto si la persona es mayor
     * de edad. Por último, guardaremos los resultados de los métodos
     * calcularIMC y esMayorDeEdad en distintas variables, para después en el
     * main, calcular un porcentaje de esas 4 personas cuantas están por debajo
     * de su peso, cuantas en su peso ideal y cuantos, por encima, y también
     * calcularemos un porcentaje de cuantos son mayores de edad y cuantos
     * menores.
     */
    public static void main(String[] args) {
        Persona[] vector = new Persona[4];
        int c1=0,c2=0,c3=0,c4=0,c5=0;
        // Persona p1=new Persona();
        //p1.crearPersona();
        for (int i = 0; i < 4; i++) {
           Persona p=new Persona();
           System.out.println(" ");
           p.crearPersona();
           System.out.println("\nCalculo de IMC \n");
            switch (p.calcularIMC()) {
                case 0:
                    System.out.println("Persona con peso ideal\n");
                    c1++;
                    break;
                case 1:
                    System.out.println("Persona con sobrepeso\n");
                    c2++;
                    break;
                case -1:
                    System.out.println("Persona debajo de su peso ideal\n");
                    c3++;
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("CALCULO DE EDAD ");
           if(p.esMayorEdad()!=true) {
               System.out.println("La persona es menor de edad\n");
               c4++;
           } else {
               System.out.println("La persona es mayor a 18\n");
               c5++;
            }
           vector[i]=p;
         }
        System.out.println("PORCENTAJES");
        System.out.println("Personas por debajo de su peso ideal: "+((c3*100)/4)+"%");
        System.out.println("Personas con sobrepeso: "+((c2*100)/4)+"%");
        System.out.println("Personas con su peso ideal: "+((c1*100)/4)+"%");
        System.out.println("Personas mayores a 18: "+((c5*100)/4)+"%");
        System.out.println("Personas menores de edad: "+((c4*100)/4)+"%");
    }

}
