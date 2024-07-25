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
public class TrajeFormalSecundaria extends Traje {

    private double porcentajeDescuento;
    private double valorDescuento;
    private double valorSueter;
    private double valorPantalon;
    private double valorCamisa;
    private double valorCorbata;
    private double total;

    public TrajeFormalSecundaria(Cliente c, double valorB, double pD,
            double valorS, double valorP, double valorCa, double valorCo) {
        super(c, valorB);
        porcentajeDescuento = pD;
        valorSueter = valorS;
        valorPantalon = valorP;
        valorCamisa = valorCa;
        valorCorbata = valorCo;
    }

    @Override
    public void calcularValorFinal() {
        calcularTotal();
        calcularValorDescuento();
        valorFinal = obtenerTotal() - obtenerValorDescuento();
    }

    public void establecerPorcentajeDescuento(double porcentajeD) {
        porcentajeDescuento = porcentajeD;
    }

    public void calcularValorDescuento() {
        valorDescuento = obtenerTotal() * (obtenerPorcentajeDescuento() / 100);
    }

    public void establecerValorSueter(double valorS) {
        valorSueter = valorS;
    }

    public void establecerValorPantalon(double valorP) {
        valorPantalon = valorP;
    }

    public void establecerValorCamisa(double valorCa) {
        valorCamisa = valorCa;
    }

    public void establecerValorCorbata(double valorC) {
        valorCorbata = valorC;
    }

    public void calcularTotal() {
        total = obtenerValorSueter() + obtenerValorCamisa() + obtenerValorCorbata() + obtenerValorPantalon();;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public double obtenerValorDescuento() {
        return valorDescuento;
    }

    public double obtenerValorSueter() {
        return valorSueter;
    }

    public double obtenerValorPantalon() {
        return valorPantalon;
    }

    public double obtenerValorCamisa() {
        return valorCamisa;
    }

    public double obtenerValorCorbata() {
        return valorCorbata;
    }

    public double obtenerTotal() {
        return total;
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       Traje Formal Secundaria
                                       Cliente: %s
                                       Valor Base: %s
                                       Porcentaje Descuento: %.2f
                                       Valor Descuento: %.2f
                                       Valor Sueter: %.2f
                                       Valor Pantalon: %.2f
                                       Valor Camisa: %.2f
                                       Valor Corbata: %.2f
                                       Valor Total: %.2f
                                       Valor Final: %.2f
                                       """,
                obtenerCliente(),
                obtenerValorBase(),
                obtenerPorcentajeDescuento(),
                obtenerValorDescuento(),
                obtenerValorSueter(),
                obtenerValorPantalon(),
                obtenerValorCamisa(),
                obtenerValorCorbata(),
                obtenerTotal(),
                obtenerValorFinal());
        return mensaje;
    }
}
