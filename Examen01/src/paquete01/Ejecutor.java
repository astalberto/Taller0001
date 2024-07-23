/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import paquete02.Edificio;
import paquete02.Empleado;
import paquete02.Empresa;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    public static void main(String[] args) {

        String nom = "Desarrollo de SW Asociados";
        String dir = "Plaza de la Puerta del Sol-Madrid/España/Europa";

        Empleado e1 = new Empleado("Luis Velez", 30, 1000);
        Empleado e2 = new Empleado("Julio Malla", 20, 1100);
        Empleado e3 = new Empleado("Monica Narvaez", 25, 1200);
        Empleado e4 = new Empleado("Ana Larenas", 40, 1400);

        Edificio ef1 = new Edificio("Sucursal 1", "Loja", 220000);
        Edificio ef2 = new Edificio("Sucursal 2", "El Oro", 120000);
        Edificio ef3 = new Edificio("Sucursal 3", "Guayas", 120000);

        Empleado[] listaE = {e1, e2, e3, e4};
        Edificio[] listaEd = {ef1, ef2, ef3};

        Empresa empresa1 = new Empresa(nom, dir, listaE, listaEd);
        empresa1.calcularPromedioEdadEmpleado();
        empresa1.calcularPromedioSueldoEmpleado();
        empresa1.calcularValorTotalEdificios();

        System.out.println(empresa1);
    }
}
