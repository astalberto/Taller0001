/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author alber
 */
public class Empleado {

    private String nombre;
    private int id;
    private String categoria;
    private int antiguedad;
    private double salarioBase;
    private double bonificacionesCoordinacion;
    private double bonificacionesResponsabilidad;
    private double bonificacionesAntiguedad;
    private double descuentoImpuestos;
    private double salarioTotal;

    public Empleado(String nombre, int id, String categoria, int antiguedad) {
        this.nombre = nombre;
        this.id = id;
        this.categoria = categoria;
        this.antiguedad = antiguedad;

    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerId(int id) {
        this.id = id;
    }

    public void establecerCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void establecerAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int obtenerId() {
        return id;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCategoria() {
        return categoria;
    }

    public int obtenerAntiguedad() {
        return antiguedad;
    }

    public double obtenerSalarioBase() {
        return salarioBase;
    }

    public double obtenerBonificacionesCoordinacion() {
        return bonificacionesCoordinacion;
    }

    public double obtenerBonificacionesResponsabilidad() {
        return bonificacionesResponsabilidad;
    }

    public double obtenerBonificacionesAntiguedad() {
        return bonificacionesAntiguedad;
    }

    public double obtenerDescuentoImpuestos() {
        return descuentoImpuestos;
    }

    public double obtenerSalarioTotal() {
        return salarioTotal;
    }

    public void calcularSalarioBase() {
        salarioBase = 450;
    }

    public void calcularBonificaciones() {
        switch (categoria) {
            case "A" -> {
                bonificacionesCoordinacion = 800;
                bonificacionesResponsabilidad = 500;
                bonificacionesAntiguedad = (antiguedad - 5) * 30;
            }
            case "B" -> {
                bonificacionesCoordinacion = 400;
                bonificacionesResponsabilidad = 300;
                bonificacionesAntiguedad = (antiguedad - 5) * 30;
            }
            case "C" -> {
                bonificacionesCoordinacion = 0;
                bonificacionesResponsabilidad = 300;
                bonificacionesAntiguedad = (antiguedad - 5) * 25;
            }
            default ->
                System.out.println("Categoría no válida: " + categoria);
        }
    }

    public void calcularDescuentoImpuestos() {
        double salarioBruto = salarioBase + bonificacionesCoordinacion
                + bonificacionesResponsabilidad + bonificacionesAntiguedad;
        if (salarioBruto > 2100) {
            descuentoImpuestos = salarioBruto * 0.08;
        } else {
            descuentoImpuestos = salarioBruto * 0.05;
        }
    }

    public void calcularSalarioTotal() {
        salarioTotal = salarioBase + bonificacionesCoordinacion
                + bonificacionesResponsabilidad + bonificacionesAntiguedad
                - descuentoImpuestos;
    }

    @Override
    public String toString() {
        String mensaje = String.format("Empleado: %s\n"
                + "id: %s\n"
                + "categoria: %s\n"
                + "antiguedad: %s\n"
                + "salarioBase: %.2f\n"
                + "bonificacionesCoordinacion: %.2f\n"
                + "bonificacionesResponsabilidad: %.2f\n"
                + "bonificacionesAntiguedad: %.2f\n"
                + "descuentoImpuestos: %.2f\n"
                + "salarioTotal: %.2f\n",
                nombre,
                id,
                categoria,
                antiguedad,
                salarioBase,
                bonificacionesCoordinacion,
                bonificacionesResponsabilidad,
                bonificacionesAntiguedad,
                descuentoImpuestos,
                salarioTotal);
        return mensaje;
    }

}
