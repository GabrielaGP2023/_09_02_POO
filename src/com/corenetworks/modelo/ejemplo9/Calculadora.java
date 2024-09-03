package com.corenetworks.modelo.ejemplo9;

public class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) throws Exception {
        double resultado = 0;
            if (b == 0) {throw new Exception();}
            resultado = a / b;
        return resultado;
    }
}
