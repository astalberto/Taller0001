/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.Cliente;

/**
 *
 * @author utpl
 */
public class TrajeInformal extends Traje {

    private double valorGorra;
    private double valorCamiseta;
    private double valorPantaloneta;

    public TrajeInformal(Cliente c, double valorB, double valorG,
            double valorC, double valorP) {
        super(c, valorB);
        valorGorra = valorG;
        valorCamiseta = valorC;
        valorPantaloneta = valorP;
    }

    @Override
    public void calcularValorFinal() {
        if (obtenerCliente().obtenerEdad() >= 20) {
            valorFinal = (valorGorra * 0.5) + valorCamiseta + valorPantaloneta
                    + obtenerValorBase();
        } else {
            valorFinal = valorGorra + valorCamiseta + valorPantaloneta
                    + obtenerValorBase();
        }
    }

    public void establecerValorGorra(double valorG) {
        valorGorra = valorG;
    }

    public void establecerValorCamiseta(double valorC) {
        valorCamiseta = valorC;
    }

    public void establecerValorPantaloneta(double valorP) {
        valorPantaloneta = valorP;
    }

    public double obtenerValorGorra() {
        return valorGorra;
    }

    public double obtenerValorCamiseta() {
        return valorCamiseta;
    }

    public double obtenerValorPantaloneta() {
        return valorPantaloneta;
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       Traje Actividad Fisica
                                       Cliente:
                                       %s
                                       Valor Base: %s
                                       Valor Gorra: %.2f
                                       Valor Camiseta: %.2f
                                       Valor Pantalones: %.2f
                                       Valor Final: %.2f
                                       """, obtenerCliente(),
                obtenerValorBase(),
                obtenerValorGorra(),
                obtenerValorCamiseta(),
                obtenerValorPantaloneta(),
                obtenerValorFinal());
        return mensaje;
    }
}
