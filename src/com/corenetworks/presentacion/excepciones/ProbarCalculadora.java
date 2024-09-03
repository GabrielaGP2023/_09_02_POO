package com.corenetworks.presentacion.excepciones;

import com.corenetworks.modelo.ejemplo9.Calculadora;

public class ProbarCalculadora {

    public static void main(String[] args) {

        Calculadora objCalculadora = new Calculadora();

        System.out.println(objCalculadora.sumar(5, 3));
        System.out.println(objCalculadora.restar(5, 3));
        System.out.println(objCalculadora.multiplicar(5, 3));
        try {
            System.out.println(objCalculadora.dividir(5, 3));
            System.out.println(objCalculadora.dividir(5, 0));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
