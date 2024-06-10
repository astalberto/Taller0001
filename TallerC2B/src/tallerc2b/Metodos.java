/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerc2b;

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
        System.out.println("[1] Insertar estudiante");
        System.out.println("[2] Recorrer lista estudiante");
        System.out.println("[3] Reporte chicas");
        System.out.println("[4] Reporte varones");
        System.out.println("[5] Eliminar Estudiante");
        System.out.println("[0] Saliste");
        return entrada.nextInt();
    }

    public boolean listaVacia() {
        return head == null;
    }

    public Nodo leerPersona() {
        int _id;
        String _nombre;
        char _sexo;
        float[] notas = new float[3];
        Nodo nuevo;
        Alumno est;
        System.out.println("Ingrese Id");
        _id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese Nombre");
        _nombre = entrada.nextLine();
        System.out.println("Ingrese sexo");
        _sexo = entrada.nextLine().charAt(0);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese calificacion" + (i + 1) + ": ");
            notas[i] = entrada.nextFloat();
        }
        est = new Alumno(_id, _nombre, _sexo, notas);
        nuevo = new Nodo(est);
        return nuevo;
    }

    public void insertar() {
        Nodo nuevo = leerPersona();
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            tail.sig = nuevo;
            tail = nuevo;
        }
    }

    public void recorrer() {
        Nodo actual = head;
        while (actual != null) {
            System.out.println(actual.estudiante);
            actual = actual.sig;
        }
    }

    public void reporteM() {
        Nodo actual = head;
        while (actual != null) {
            if (actual.estudiante.getSexo() == 'f') {
                System.out.println(actual.estudiante);
            }
            actual = actual.sig;
        }
    }

    public void reporteV() {
        Nodo actual = head;
        while (actual != null) {
            if (actual.estudiante.getSexo() == 'm') {
                System.out.println(actual.estudiante);
            }
            actual = actual.sig;
        }
    }

    public void eliminar(int n) {
        if (listaVacia()) {
            System.out.println("No hay elementos en la lista");
        } else {
            if (n == head.estudiante.getId()) {
                head = head.sig;
                if (head == null) {
                    tail = null;
                }
            } else {
                Nodo actual = head;
                while ((actual.sig != null) && (n != actual.sig.estudiante.getId())) {
                    actual = actual.sig;
                }
                if (actual.sig == null) {
                    System.out.println("El elemento no existe");
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
