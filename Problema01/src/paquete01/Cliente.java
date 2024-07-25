/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author utpl
 */
public class Cliente {

    private String nombre;
    private int edad;
    private String ciudad;

    public Cliente(String nom, int e, String ciu) {
        nombre = nom;
        edad = e;
        ciudad = ciu;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public int obtenerEdad() {
        return edad;
    }

    public void establecerEdad(int e) {
        edad = e;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(String ciu) {
        ciudad = ciu;
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       Nombre %s
                                       Edad %d
                                       Ciudad %s""", obtenerNombre(), obtenerEdad(), obtenerCiudad());
        return mensaje;
    }
}
