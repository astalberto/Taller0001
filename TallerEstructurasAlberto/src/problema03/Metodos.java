/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema03;

/**
 *
 * @author alber
 */
public class Metodos {

    private ArbolBinario arbolA;
    private ArbolBinario arbolB;
    private ArbolBinario arbolC;

    public Metodos() {
        this.arbolA = new ArbolBinario();
        this.arbolB = new ArbolBinario();
        this.arbolC = new ArbolBinario();
    }

    public void insertarCliente(Cliente cliente) {
        cliente.calcularCategoria();
        switch (cliente.obtenerCategoria()) {
            case 'A' ->
                arbolA.insertar(cliente);
            case 'B' ->
                arbolB.insertar(cliente);
            case 'C' ->
                arbolC.insertar(cliente);
            default ->
                System.out.println("Categoría no válida");
        }
    }

    public void imprimirClientesPorCategoria() {
        System.out.println("Clientes categoría A:");
        imprimirClientes(arbolA.obtenerRaiz());

        System.out.println("\nClientes categoría B:");
        imprimirClientes(arbolB.obtenerRaiz());

        System.out.println("\nClientes categoría C:");
        imprimirClientes(arbolC.obtenerRaiz());
    }

    private void imprimirClientes(Nodo nodo) {
        if (nodo != null) {
            Cliente cliente = nodo.obtenerCliente();
            cliente.calcularDescuento();
            System.out.println(cliente);
            imprimirClientes(nodo.obtenerIzquierda());
            imprimirClientes(nodo.obtenerDerecha());
        }
    }
}
