/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author alber
 */
public class Nodo {

    private int num;
    private int conteo;
    private Nodo izquierdo;
    private Nodo derecho;

    public Nodo(int num) {
        this.num = num;
        this.conteo = 1;
        this.izquierdo = null;
        this.derecho = null;
    }

    public int obtenerDato() {
        return num;
    }

    public void establecerDato(int num) {
        this.num = num;
    }

    public int obtenerConteo() {
        return conteo;
    }

    public void establecerConteo(int conteo) {
        this.conteo = conteo;
    }

    public Nodo obtenerIzquierdo() {
        return izquierdo;
    }

    public void establecerIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo obtenerDerecho() {
        return derecho;
    }

    public void establecerDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
}
