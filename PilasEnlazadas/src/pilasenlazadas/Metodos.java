/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasenlazadas;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Metodos {

    Scanner entrada;
    Nodo miPila;
    Nodo tope;
    Nodo previo;

    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.miPila = null;
        this.tope = null;
        this.previo = null;
    }

    public void PushFila(int n) {
        Nodo nuevo = new Nodo(n);
        if (pilaVacia()) {
            miPila = tope = nuevo;
        } else {
            previo = tope;
            tope.sig = nuevo;
            tope = nuevo;
        }
    }

  /*  public void popPila() {
        actual = head;
        while (actual.sig != tope) {
            actual = actual.sig;
        }
        System.out.println(tope.valor);
        actual.sig = actual.sig.sig;
    }
*/
    
    public int menu() {
        System.out.println("[1] Push\n[2] Pop\n[0] Saliste");
        return entrada.nextInt();
    }

    public boolean pilaVacia() {
        return miPila == null;
    }

}
