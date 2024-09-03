package com.corenetworks.presentacion.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProbarExcepcion1 {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
    }

    private static void ejercicio2() {
        Scanner s1 = new Scanner(System.in);
        int numero = 0;
        System.out.println("Escriba un número ->");
        try {
            numero = s1.nextInt();
        }
        catch (InputMismatchException e1){
            e1.getStackTrace();
            System.out.println(e1.getMessage());
            System.out.println(e1.toString());
        }


    }

    private static void ejercicio1() {
        int[] enteros = {1,2,3,4,5};
        int posicion = -1;
        try {
            System.out.println(enteros[posicion]);
        }catch (ArrayIndexOutOfBoundsException e1){
            e1.getStackTrace();
            System.out.println(e1.toString());
            System.out.println(e1.getMessage());
        }
        System.out.println("sigue el programa");
    }
}
