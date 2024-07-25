/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;
import paquete02.Traje;

/**
 *
 * @author utpl
 */
public class Venta {

    private ArrayList<Traje> lista;
    private Vendedor v1;
    private double facturaPagar;

    public Venta(Vendedor v, ArrayList<Traje> listaT) {
        lista = listaT;
        v1 = v;
    }

    public void calcularFacturaPagar() {
        for (int i = 0; i < obtenerLista().size(); i++) {
            facturaPagar = (obtenerFacturaPagar() + obtenerLista().get(i).obtenerValorFinal());
        }
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       Venta
                                       %s
                                       """, obtenerV1());
        for (int i = 0; i < obtenerLista().size(); i++) {
            mensaje = String.format("%s%s\n", mensaje, obtenerLista().get(i));
        }
        mensaje = String.format("%sValor a Facturar %.2f", mensaje, obtenerFacturaPagar());
        return mensaje;
    }

    public void establecerLista(ArrayList<Traje> listaT) {
        lista = listaT;
    }

    public void establecerV1(Vendedor v) {
        v1 = v;
    }


    public ArrayList<Traje> obtenerLista() {
        return lista;
    }


    public Vendedor obtenerV1() {
        return v1;
    }


    public double obtenerFacturaPagar() {
        return facturaPagar;
    }


}
