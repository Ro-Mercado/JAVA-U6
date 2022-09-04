/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_prueba_u6poo.entidades;

/**
 *
 * 
 */
public class Mascota {
    private String nombre;
    private String apodo;
    private String tipo;
    private String raza;
    private String color;
    private int edad;
    private boolean cola;
    private int energia;
    
    //CONSTRUCTOR
    public Mascota(){
          this.energia=1000; 
   }

    public Mascota(String nombre, String apodo, String tipo, String raza, String color, int edad, boolean cola) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.energia=1000; 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }
    //Restar energia cuando se pasea la mascota
    /**
     * Funcion para pasear simple
     * @param energRestar
     * @return energia
     */
    public int pasear(int energRestar){
        energia-=energRestar;
        return energia;
    }
    //SOBRECARGA DEL MÉTODO CARGA
    /**
     * Funcion destinada a pasear por vueltas
     * @param energRestar
     * @param vueltas
     * @return energia
     */
    public int pasear(int energRestar, int vueltas){
        for (int i = 0; i < vueltas; i++) {
            energia-=energRestar;
        }
        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", raza=" + raza + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", energia=" + energia + '}';
    }

    
   

}
