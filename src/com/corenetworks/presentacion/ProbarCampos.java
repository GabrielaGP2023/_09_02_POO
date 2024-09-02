package com.corenetworks.presentacion;

import com.corenetworks.modelo.ejemplo2.Campos;

public class ProbarCampos {
    public static void main(String[] args) {
        Campos objetoCampos = new Campos(5);
        objetoCampos.Incrementa();
        System.out.println(objetoCampos.muestra());
    }
}
