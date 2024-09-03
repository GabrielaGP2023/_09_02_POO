/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corenetworks.presentacion;

import com.corenetworks.modelo.ejemplo10.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MontanaRusa {

    public static void main(String[] args) {
        int edad = 0;
        for (String s : args) {
            try {
                edad = Integer.parseInt(s);
                verificaEdad(edad);
                System.out.println("Usted puede monatr la edad es la correcta");
            } catch (NumberFormatException ex) {
                try {
                    throw new MalFormatoEdadException();
                } catch (MalFormatoEdadException ex1) {
                    System.out.println(ex1.getMessage());
                }
            } catch (EdadIncorrectaException ex3) {
                System.out.println(ex3.getMessage());
            } catch (Exception ex2) {
                System.out.println("Se ha producido un error inesperado "
                        + ex2.getMessage());
            }

        }
    }


    private static void verificaEdad(int edad) throws EdadIncorrectaException {
        if (edad > 100 || edad < -100) {
            throw new EdadIncorrectaException();
        } else if (edad > 75) {
            throw new EdadDemasiadoMayorException();
        } else if (edad <= 5 && edad >= 0) {
            throw new EdadInsuficienteException();
        } else if (edad < 0) {
            throw new EdadNegativaException();
        }
    }
}
