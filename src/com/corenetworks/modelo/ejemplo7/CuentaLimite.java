package com.corenetworks.modelo.ejemplo7;

public class CuentaLimite extends Cuenta{

	private double limite;

	public CuentaLimite(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}

	public CuentaLimite(double limite) {

		this.limite = limite;
	}
	public CuentaLimite() {
		
	}
	//Extraemos si la cantidad es inferior al límite
	@Override
	public void extraer(double cantidad) {
		if(cantidad<limite) {
			super.extraer(cantidad);
		}
	}
	
	public void ajustarLimite() {

		limite=this.ObtenerSaldo()/2;
	}
	
	
	
}
