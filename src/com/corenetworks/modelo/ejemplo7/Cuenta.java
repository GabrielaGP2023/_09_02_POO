package com.corenetworks.modelo.ejemplo7;

public class Cuenta {

	
	private double saldo;

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}
	public Cuenta() {

	}
	public void extraer(double cantidad) {
		if(cantidad>=saldo){
			this.saldo-=cantidad;
		}

	}
	public void ingresar(double cantidad) {
		this.saldo+=cantidad;
	}
	public double ObtenerSaldo() {
		return saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
