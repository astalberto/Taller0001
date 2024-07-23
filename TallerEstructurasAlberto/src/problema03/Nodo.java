/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema03;

/**
 *
 * @author alber
 */
public class Nodo {

    private Cliente cliente;
    private Nodo left;
    private Nodo right;

    public Nodo(Cliente cliente) {
        this.cliente = cliente;
        this.left = null;
        this.right = null;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public void establecerCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Nodo obtenerIzquierda() {
        return left;
    }

    public void establecerIzquierda(Nodo left) {
        this.left = left;
    }

    public Nodo obtenerDerecha() {
        return right;
    }

    public void establecerDerecha(Nodo right) {
        this.right = right;
    }
}
