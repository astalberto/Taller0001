/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema03;

/**
 *
 * @author alber
 */
public class Cliente {

    private String nombre;
    private int id;
    private int antiguedad;
    private String historialCredito;
    private double costoCompra;
    private char categoria;
    private double descuento;

    public Cliente(String nombre, int id, int antiguedad, String historialCredito, double costoCompra) {
        this.nombre = nombre;
        this.id = id;
        this.antiguedad = antiguedad;
        this.historialCredito = historialCredito;
        this.costoCompra = costoCompra;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void calcularCategoria() {
        int puntosCategoria = 0;

        if (antiguedad < 2) {
            puntosCategoria = puntosCategoria + 1;
        } else if (antiguedad <= 5 && antiguedad >= 2) {
            puntosCategoria = puntosCategoria + 2;
        } else if (antiguedad > 5) {
            puntosCategoria = puntosCategoria + 3;
        }
        if (historialCredito.equals("A")) {
            puntosCategoria = puntosCategoria + 3;
        } else if (historialCredito.equals("B")) {
            puntosCategoria = puntosCategoria + 2;
        } else if (historialCredito.equals("C")) {
            puntosCategoria = puntosCategoria + 1;
        }

        if (costoCompra >= 1000) {
            puntosCategoria = puntosCategoria + 3;
        } else if (costoCompra >= 500 && costoCompra < 1000) {
            puntosCategoria = puntosCategoria + 2;
        }

        if (puntosCategoria >= 7) {
            categoria = 'A';
        } else if (puntosCategoria >= 3) {
            categoria = 'B';
        } else {
            categoria = 'C';
        }
    }

    public void calcularDescuento() {
        descuento = switch (categoria) {
            case 'A' -> 0.1;
            case 'B' -> 0.06;
            case 'C' -> 0.02;
            default -> 0;
        };
    }

    public double obtenerDescuento() {
        return descuento;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public int obtenerId() {
        return id;
    }

    public char obtenerCategoria() {
        return categoria;
    }

    public void establecerId(int id) {
        this.id = id;
    }

    public int obtenerAntiguiedad() {
        return antiguedad;
    }

    public void establecerAntiguiedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String obtenerHistorialCredito() {
        return historialCredito;
    }

    public void establecerHistorialCredito(String historialCredito) {
        this.historialCredito = historialCredito;
    }

    public double obtenerCostoCompra() {
        return costoCompra;
    }

    public void establecerCostoCompra(double costoCompra) {
        this.costoCompra = costoCompra;
    }

    @Override
    public String toString() {
        return String.format("Cliente:\n"
                + "Nombre: '%s'\n"
                + "ID: %d\n"
                + "Antiguedad: %d\n"
                + "Historial crediticio: '%s'\n"
                + "Monto de compra: %.2f\n"
                + "Categoria: %c\n"
                + "Descuento: %.2f\n",
                nombre,
                id,
                antiguedad,
                historialCredito.toUpperCase(),
                costoCompra,
                categoria,
                descuento);
    }
}
