/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author utpl
 */
public class Empleado {

    private String nombre;
    private int edad;
    private double sueldo;

    public Empleado(String n, int e, double s) {
        nombre = n;
        edad = e;
        sueldo = s;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerEdad(int e) {
        edad = e;
    }

    public void establecerSueldo(double s) {
        sueldo = s;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

    public double obtenerSueldo() {
        return sueldo;
    }
}
