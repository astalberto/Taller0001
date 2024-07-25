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
public class TrajeActividadFisica extends Traje {

    private double valorCalentador;
    private double valorMedias;

    public TrajeActividadFisica(Cliente c, double valorB, double valorCal,
            double valorMed) {
        super(c, valorB);
        valorCalentador = valorCal;
        valorMedias = valorMed;
    }

    @Override
    public void calcularValorFinal() {
        if (obtenerCliente().obtenerCiudad().toLowerCase().equals("loja")
                || obtenerCliente().obtenerCiudad().toLowerCase().equals("quito")) {
            valorFinal = (obtenerValorMedias() * 0.4) + obtenerValorBase() + obtenerValorCalentador();
        } else {
            valorFinal = obtenerValorMedias() + obtenerValorBase() + obtenerValorCalentador();
        }
    }

    public void establecerValorCalentador(double valorCal) {
        valorCalentador = valorCal;
    }

    public void establecerValorMedias(double valorMed) {
        valorMedias = valorMed;
    }

    public double obtenerValorCalentador() {
        return valorCalentador;
    }

    public double obtenerValorMedias() {
        return valorMedias;
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       Traje Actividad Fisica
                                       Cliente:
                                       %s
                                       Valor Base: %s
                                       Valor Calentador: %.2f
                                       Valor Medias: %.2f
                                       Valor Final: %.2f
                                       """,
                obtenerCliente(),
                obtenerValorBase(),
                obtenerValorCalentador(),
                obtenerValorMedias(),
                obtenerValorFinal());
        return mensaje;
    }

}
