/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema03;

/**
 *
 * @author alber
 */
public class ArbolBinario {

    private Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(Cliente cliente) {
        Nodo nuevoNodo = new Nodo(cliente);
        if (raiz == null) {
            raiz = nuevoNodo;
            return;
        }

        Nodo padreActual = raiz;
        while (true) {
            if (cliente.obtenerCostoCompra() < padreActual.obtenerCliente()
                    .obtenerCostoCompra()) {
                if (padreActual.obtenerIzquierda() == null) {
                    padreActual.establecerIzquierda(nuevoNodo);
                    return;
                }
                padreActual = padreActual.obtenerIzquierda();
            } else {
                if (padreActual.obtenerDerecha() == null) {
                    padreActual.establecerDerecha(nuevoNodo);
                    return;
                }
                padreActual = padreActual.obtenerDerecha();
            }
        }
    }

    public Nodo buscar(int idCliente) {
        Nodo nodoActual = raiz;
        while (nodoActual != null) {
            if (nodoActual.obtenerCliente().obtenerId() == idCliente) {
                return nodoActual;
            } else if (idCliente < nodoActual.obtenerCliente().obtenerId()) {
                nodoActual = nodoActual.obtenerIzquierda();
            } else {
                nodoActual = nodoActual.obtenerDerecha();
            }
        }
        return null;
    }

    public void recorrerPreorden(Nodo nodo) {
        if (nodo != null) {
            System.out.println("Id: " + nodo.obtenerCliente().obtenerId()
                    + ", Nombre: " + nodo.obtenerCliente().obtenerNombre()
                    + ", Descuento: " + nodo.obtenerCliente().obtenerDescuento());
            recorrerPreorden(nodo.obtenerIzquierda());
            recorrerPreorden(nodo.obtenerDerecha());
        }
    }

    public void recorrerInorden(Nodo nodo) {
        if (nodo != null) {
            recorrerInorden(nodo.obtenerIzquierda());
            System.out.println("Id: " + nodo.obtenerCliente().obtenerId()
                    + ", Nombre: " + nodo.obtenerCliente().obtenerNombre()
                    + ", Descuento: " + nodo.obtenerCliente().obtenerDescuento());
            recorrerInorden(nodo.obtenerDerecha());
        }
    }

    public void recorrerPostorden(Nodo nodo) {
        if (nodo != null) {
            recorrerPostorden(nodo.obtenerIzquierda());
            recorrerPostorden(nodo.obtenerDerecha());
            System.out.println("Id: " + nodo.obtenerCliente().obtenerId()
                    + ", Nombre: " + nodo.obtenerCliente().obtenerNombre()
                    + ", Descuento: " + nodo.obtenerCliente().obtenerDescuento());
        }
    }

    public Nodo obtenerRaiz() {
        return raiz;
    }
}
