/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.corenetworks.modelo.ejemplo10;
public class EdadException extends Exception{

    public EdadException() {
        super("Ha ocurrido una excepción en la edad");
    }

    public EdadException(String message) {
        super(message);
    }
    
}
