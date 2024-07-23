/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdos;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Metodos {

    Scanner entrada;
    NodoL head;
    NodoL tail;
    NodoA raizM;
    NodoA raizH;

    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.head = null;
        this.tail = null;
        this.raizM = null;
        this.raizH = null;
    }

    public int menu() {
        System.out.println("----Menu----[0]");
        System.out.println("Salir       [0]");
        System.out.println("Ingresar    [1]");
        System.out.println("Reporte H   [2]");
        System.out.println("Reporte M   [3]");
        return entrada.nextInt();
    }

    public void llenarLista() {
        int op;
        do {
            System.out.println("[1]Insertar datos?");
            System.out.println("[0]Salir          ");
            op = entrada.nextInt();
            entrada.nextLine();
            if (op == 1) {
                insertarL();
            }
        } while (op != 0);
        recorrer();
    }

    private void insertarL() {
        NodoL nuevo = leerDatos();
        if (head == null) {
            head = nuevo;
            tail = nuevo;
        } else {
            tail.sig = nuevo;
            tail = nuevo;
        }
    }

    public void recorrer() {
        NodoL actual = head;
        while (actual != null) {
            System.out.println(actual.nombre + " :: ");
            if (actual.sexo == 'm') {
                raizM = insertarA(actual, raizM);
            } else {
                raizH = insertarA(actual, raizH);
            }
            actual = actual.sig;

        }
    }

    public NodoL leerDatos() {
        int _id;
        String nom;
        char sex;
        float[] notas = new float[3];
        NodoL nuevo;
        System.out.println("Ingrese ID: ");
        _id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese nombre: ");
        nom = entrada.nextLine();
        System.out.println("Ingrese su sexo: ");
        sex = entrada.nextLine().charAt(0);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese calificacion " + (i + 1));
            notas[i] = entrada.nextFloat();
        }
        nuevo = new NodoL(_id, nom, sex, notas);
        return nuevo;
    }

    private NodoA insertarA(NodoL info, NodoA actual) {
        if (actual == null) {
            NodoA nuevo = new NodoA(info.id, info.nombre, info.sexo, info.getPromedio());
        } else {
            if (info.id > actual.id) {
                actual.izq = insertarA(info, actual.izq);
            } else {
                if (info.id < actual.id) {
                    actual.der = insertarA(info, actual.der);
                }
            }
        }
        return actual;
    }

    public void reporte(NodoA actual) {
        if (actual != null) {
            reporte(actual.izq);
            if (actual.prom >= 7) {
                System.out.println(actual.nombre + " esta Aprobado/a con: " + actual.prom);
            }
            reporte(actual.der);
        }
    }
}
