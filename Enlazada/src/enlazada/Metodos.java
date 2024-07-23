/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enlazada;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Metodos {

    Scanner entrada;
    Nodo head;
    Nodo tail;

    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.head = null;
        this.tail = null;
    }

    public int menu() {
        System.out.println("Salir     [0]");
        System.out.println("Ingresar  [1]");
        System.out.println("Recorrer  [2]");
        System.out.println("InsertatI [3]");
        System.out.println("Ordenado  [4]");
        System.out.println("Eliminar  [5]");
        return entrada.nextInt();
    }

    public void insertar(int n) {
        Nodo nuevo = new Nodo(n);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            tail.sig = nuevo;
            tail = nuevo;
        }
    }

    public boolean listaVacia() {
        return (head == null);
    }

    public void recorrer() {
        Nodo aux = head;
        String mensaje = "";
        System.out.println("-------------------------");
        while (aux != null) {
            System.out.println(aux.valor);
            mensaje = String.format("%s%s", aux.valor, mensaje);
            aux = aux.sig;
        }
        System.out.println(mensaje);
        System.out.println("-------------------------");
    }

    public void insertarInicio(int n) {
        Nodo nuevo = new Nodo(n);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            nuevo.sig = head;
            head = nuevo;
            recorrer();
        }
    }

    public void ordenado(int n) {
        Nodo nuevo = new Nodo(n);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            if (n < head.valor) {
                nuevo.sig = head;
                head = nuevo;
            } else {
                Nodo act = head;
                while ((act.sig != null) && (n > act.sig.valor)) {
                    act = act.sig;
                }
                nuevo.sig = act.sig;
                act.sig = nuevo;
                if (nuevo.sig == null) {
                    tail = nuevo;
                }
            }
            recorrer();
            String mensaje = "";
        }

    }

    public void eliminar(int num) {
        if (listaVacia()) {
            System.out.println("No existe lista");
        } else {
            if (num == head.valor) {
                head = head.sig;
                if (head == null) {
                    tail = null;
                }
            } else {
                Nodo actual = head;
                while ((actual.sig != null) && (num != actual.sig.valor)) {
                    actual = actual.sig;
                    if (actual.sig == null) {
                        System.out.println("Elemento no existe");
                    } else {
                        actual.sig = actual.sig.sig;
                        if (actual.sig == null) {
                            tail = actual;
                        }
                    }
                }
            }
        }
    }

}
