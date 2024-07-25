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
public abstract class Traje {

    private Cliente cliente;
    private double valorBase;
    public double valorFinal;

    public Traje(Cliente c, double valorB) {
        cliente = c;
        valorBase = valorB;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public double obtenerValorBase() {
        return valorBase;
    }

    public double obtenerValorFinal() {
        return valorFinal;
    }

    public abstract void calcularValorFinal();

    public void establecerCliente(Cliente cl) {
        cliente = cl;
    }

    public void establecerValorBase(double valorB) {
        valorBase = valorB;
    }

    public void establecerValorFinal(double valorF) {
        valorFinal = valorF;
    }

}
