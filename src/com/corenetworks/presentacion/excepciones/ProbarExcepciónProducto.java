package com.corenetworks.presentacion.excepciones;

import com.corenetworks.modelo.ejemplo8.Producto;
import com.corenetworks.modelo.ejemplo8.ProductoException;

public class ProbarExcepciónProducto {
    public static void main(String[] args) {
        Producto objProducto1 = new Producto("Portatil", 0, "HP", "500 GB DD");
        Producto objProducto2 = new Producto(4,"Portatil", 0, "HP", "500 GB DD");

        try {
            objProducto1.comprobar();
        } catch (ProductoException e) {
            System.out.println(e.getMessage());
        }
//        objProducto2.comprobar();
    }
}
