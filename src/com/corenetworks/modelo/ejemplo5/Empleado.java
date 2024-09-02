/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corenetworks.modelo.ejemplo5;

/**
 *
 * @author Programacion
 */
public class Empleado {
    //Atributos
    protected final double PORCENTAJE = 0.75;
    protected String nombre;
    protected double sueldo;
    
    //Métodos
    public double calcularNomina(){
        return sueldo * PORCENTAJE;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
    //Constructores

    public Empleado() {
    }

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    //Setters y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
