package Entidad;

import java.util.Scanner;

/**
 *
 *
 */
public class Persona {

    private String nombre;
    private int edad;
    private char sexo;
    private float peso;
    private float altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void crearPersona() {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESO DE DATOS");
        System.out.println("Ingrese el nombre");
        nombre=leer.nextLine();
        System.out.println("Ingrese su edad");
        edad=leer.nextInt();
        System.out.println("Ingrese su sexo ('M'=mujer, 'H'=hombre, 'O'=otro)");
        sexo=leer.next().charAt(0);
        while(sexo!='M' && sexo!='H' && sexo!='O'){
            System.out.println("El sexo ingresado es incorrecto. Ingrese nuevamente");
            sexo=leer.next().charAt(0);
        }
        
        System.out.println("Ingrese el peso");
        peso=leer.nextFloat();
        System.out.println("Ingrese la altura en mt");
        altura=leer.nextFloat();
    }

    
    public int calcularIMC(){
        //(peso en kg/(altura^2 en mt2)
        if ((peso/(float)(Math.pow(altura,2))) >=20 && (peso/(float)(Math.pow(altura,2))) <=25){
            return 0;
        }else if((peso/(float)(Math.pow(altura,2))) <20){
            return -1;
        } else{ return 1;}
    }
    
    public boolean esMayorEdad(){
        return edad>=18;
    }
}
