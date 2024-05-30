/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author utpl
 */
public class Edificio {

    private String nombre;
    private String provincia;
    private double valorEdificio;

    public Edificio(String n, String p, double v) {
        nombre = n;
        provincia = p;
        valorEdificio = v;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerProvincia(String p) {
        provincia = p;
    }

    public void establecerValorEdificio(double v) {
        valorEdificio = v;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerProvincia() {
        return provincia;
    }

    public double obtenerValorEdificio() {
        return valorEdificio;
    }
}
