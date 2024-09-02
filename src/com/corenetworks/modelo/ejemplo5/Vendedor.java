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
public class Vendedor extends Empleado{
    //Atributos
    private double ventas;
    private double comision;
    
    //Métodos

    @Override
    public double calcularNomina() {
        return super.calcularNomina() + (ventas*comision*PORCENTAJE); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Vendedor{" + "ventas=" + ventas + ", comision=" + comision + '}' + super.toString();
    }
    
    //Constructores

    public Vendedor() {
    }

    public Vendedor(double ventas, double comision, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.ventas = ventas;
        this.comision = comision;
    }
    
    // Setters y Getters

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    
    
    
    
}
