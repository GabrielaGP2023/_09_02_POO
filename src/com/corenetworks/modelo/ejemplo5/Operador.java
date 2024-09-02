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
public class Operador extends Empleado{
    //Atributos
    private int piezas;
    private double incentivo;
    
    //Métodos
    //Sobreescritura

    @Override
    public double calcularNomina() {
        return super.calcularNomina() + (piezas*incentivo*PORCENTAJE); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Operador{" + "piezas=" + piezas + ", incentivo=" + incentivo + '}' + super.toString();
    }
    
    //Constructores

    public Operador() {
    }
    
    

    public Operador(int piezas, double incentivo, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.piezas = piezas;
        this.incentivo = incentivo;
    }
    
    //Setters y Getters

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
    
    
}
