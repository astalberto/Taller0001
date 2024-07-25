/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author utpl
 */
public class Vendedor {

    private String nombre;
    private String apellido;

    public Vendedor(String nom, String ape) {
        nombre = nom;
        apellido = ape;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerApellido(String ape) {
        apellido = ape;
    }
        @Override
    public String toString() {
        String mensaje = String.format("""
                                       Vendedor: %s %s
                                       """,obtenerNombre(),obtenerApellido());
        return mensaje;
    }
}
