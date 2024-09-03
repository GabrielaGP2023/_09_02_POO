/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.corenetworks.modelo.ejemplo10;
public class EdadIncorrectaException extends EdadException {

    public EdadIncorrectaException() {
        super("Edad Incorrecta fuera de rango");
    }

    public EdadIncorrectaException(String message) {
        super(message);
    }
    

}
