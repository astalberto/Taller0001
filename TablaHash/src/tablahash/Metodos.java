/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablahash;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Metodos {

    Scanner entrada;
    Nodo[] claves;
    int tamanio;

    public Metodos(int lim) {
        this.entrada = new Scanner(System.in);
        this.tamanio = lim;
        this.claves = new Nodo[tamanio];
        for (int i = 0; i < tamanio; i++) {
            claves[i] = null;
        }
    }

    public int menu() {
        System.out.println("Menu");
        System.out.println("Insertar [1]");
        System.out.println("Listar [2]");
        System.out.println("Salir [0]");
        return entrada.nextInt();
    }

    public boolean nodoVacio(Nodo actual) {
        return actual == null;
    }

    public int getHash(String clave) {
        int sum = 0;
        for (int i = 0; i < clave.length(); i++) {
            sum += (int) clave.charAt(i);
        }
        return sum % tamanio;
    }

    public void insertar() {
        int _Id, key;
        String _Nombre;
        System.out.println("Digite el id:  ");
        _Id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite el nombre");
        _Nombre = entrada.nextLine();
        key = getHash(_Nombre);
        insertarHash(key, _Id, _Nombre);
    }

    public void listar() {
        for (int i = 0; i < tamanio; i++) {
            if (!nodoVacio(claves[i])) {
                Nodo actual = claves[i];
                System.out.println("Key: " + i);
                while (!nodoVacio(actual)) {
                    System.out.println("Id: " + actual.Id + "\nNombre: " + actual.nombre);
                    actual = actual.sig;
                }
            } else {
                System.out.println("null");

            }
        }
    }

    private void insertarHash(int key, int _Id, String _Nombre) {
        Nodo nuevo = new Nodo(_Id, _Nombre);
        if (nodoVacio(claves[key])) {
            claves[key] = nuevo;
        } else {
            Nodo actual = claves[key];
            while (!nodoVacio(actual.sig)) {
                actual = actual.sig;
            }
            actual.sig = nuevo;
        }
    }

}
