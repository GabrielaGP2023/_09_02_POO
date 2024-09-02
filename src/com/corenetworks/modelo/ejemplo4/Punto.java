package com.corenetworks.modelo.ejemplo4;

public class Punto {
    protected int x;
    protected int y;

    //Sobrecarga

    public Punto(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public Punto() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void imprimir() {
        System.out.println("Las cooredenadas son: " +x+","+y);
    }
}
