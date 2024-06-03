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
        System.out.println("Salir    [0]");
        System.out.println("Ingresar [1]");
        System.out.println("Recorrer [2]");
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
        while (true) {
            Nodo aux = head;
            System.out.println(aux);
            aux = aux.sig;
        }
    }

}
