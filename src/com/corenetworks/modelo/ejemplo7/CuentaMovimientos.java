package com.corenetworks.modelo.ejemplo7;

import java.time.LocalDateTime;
import java.util.ArrayList;



public class CuentaMovimientos extends CuentaLimite{

	
	    private ArrayList<Movimientos> movimientos=new ArrayList<Movimientos>();
	    
	    public CuentaMovimientos(double saldo, double limite) {
	    	super(saldo,limite);
	    }

	   
	    public ArrayList<Movimientos> obtenerMovimientos() {
	        //Devuelve la lista de movimientos
	        return movimientos;
	    }
        
	    
		@Override
		public void extraer(double cantidad) {
			//Cuando se crea el objeto de movimiento de una extracción
			Movimientos m=new Movimientos(cantidad,LocalDateTime.now(),"Extracción"); 
			 //Agregamos objeto de movimiento creado a la lista de movimientos
	        movimientos.add(m);
	        //Llamamos al método extraer de la clase padre con el parámetro cantidad
	        super.extraer(cantidad);
		}

		@Override
		public void ingresar(double cantidad) {
			//Cuando se crea el objeto de movimiento de un ingreso
			Movimientos m=new Movimientos(cantidad,LocalDateTime.now(),"Ingreso");
			//Agregamos objeto de movimiento creado a la lista de movimientos
			movimientos.add(m);
			//Llamamos al método extraer de la clase padre con el parámetro cantidad
			super.ingresar(cantidad);
		}
		
	    
	}



