/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.corenetworks.modelo.ejemplo10;
public class EdadInsuficienteException extends EdadIncorrectaException {

    public EdadInsuficienteException() {
        super("La edad no es suficiente, se necesita ser mayor");
    }

}
