/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.corenetworks.modelo.ejemplo10;
public class EdadNegativaException extends EdadIncorrectaException {

    public EdadNegativaException() {
        super("La edad no puede ser negativa");
    }

}
