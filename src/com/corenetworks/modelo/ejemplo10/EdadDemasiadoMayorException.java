/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.corenetworks.modelo.ejemplo10;
public class EdadDemasiadoMayorException extends EdadIncorrectaException {

    public EdadDemasiadoMayorException() {
        super("La edad es demasiado grande, necesita ser menor");
    }

}
