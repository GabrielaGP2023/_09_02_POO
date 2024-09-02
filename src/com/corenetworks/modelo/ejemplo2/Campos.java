package com.corenetworks.modelo.ejemplo2;

public class Campos {
    private int numero;

    public Campos(int numero) {
        this.numero = numero;
    }
    public String muestra(){
        return "El número es " + numero;
    }
    public void Incrementa()
    {
        numero++;
    }
}
