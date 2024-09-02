package com.corenetworks.presentacion;

import com.corenetworks.modelo.ejemplo5.Empleado;
import com.corenetworks.modelo.ejemplo5.Gerente;
import com.corenetworks.modelo.ejemplo5.Operador;
import com.corenetworks.modelo.ejemplo5.Vendedor;

public class ProbarEstructuraEmpleado {
    public static void main(String[] args) {
        System.out.println("---- Empleado ----");
        Empleado e1 = new Empleado("Ramiro", 2400);
        System.out.println("Sueldo ->" + e1.calcularNomina());
        System.out.println(e1.toString());

        System.out.println("----Gerente ---");
        Gerente g1 = new Gerente(5000, "Simon", 5000);
        System.out.println("Sueldo -> " + g1.calcularNomina());
        System.out.println(g1.toString());

        System.out.println("---- Vendedor ----");
        Vendedor v1 = new Vendedor(2000, 0.01, "Raul", 1500);
        System.out.println("Sueldo -> " + v1.calcularNomina());
        System.out.println(v1.toString());

        System.out.println("---- Operador ---");
        Operador o1 = new Operador(50, 1.5, "Gonzalo", 1000);
        System.out.println("Sueldo -> " + o1.calcularNomina());
        System.out.println(o1.toString());

    }
}
