/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Metodo {

    int[] myMatriz = new int[5];
    int[] myMatriz2 = new int[5];
    int[] myMatrizR = new int[10];
    int ev = 0;
    Scanner entrada = new Scanner(System.in);

    public void ejecutor() {
        llenado();
        myMatriz = repetido(myMatriz);
        myMatriz2 = repetido(myMatriz2);
        myMatrizR = interseccion();
        presentacion();
    }

    public void llenado() {
        System.out.println("Ingrese numeros para el arreglo 1");
        for (int i = 0; i < myMatriz.length; i++) {
            int aux = entrada.nextInt();
            myMatriz[i] = aux;
        }
        System.out.println("Ingrese numeros para el arreglo 2");
        for (int i = 0; i < myMatriz2.length; i++) {
            int aux = entrada.nextInt();
            myMatriz2[i] = aux;
        }
    }

    public int[] repetido(int[] a) {
        while (repetidoExiste(a)) {
            System.out.println("Error numero repetido");
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        System.out.println("Ingrese numero distinto a " + a[j]);
                        a[i] = entrada.nextInt();
                    }
                }
            }
        }

        return a;
    }

    public boolean repetidoExiste(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public int[] interseccion() {
        for (int i = 0; i < myMatriz.length; i++) {
            for (int j = 0; j < myMatriz2.length; j++) {
                if (myMatriz[i] == myMatriz2[j]) {
                    myMatrizR[ev] = myMatriz[i];
                    ev++;
                }
            }
        }
        return myMatrizR;
    }

    public void presentacion() {
        System.out.println("Matriz A");
        for (int i = 0; i < myMatriz.length; i++) {
            System.out.printf("%d \t", myMatriz[i]);
        }
        System.out.println("\nMatriz B");
        for (int i = 0; i < myMatriz2.length; i++) {
            System.out.printf("%d \t", myMatriz2[i]);
        }
        System.out.println("\nMatriz C");
        for (int i = 0; i < ev; i++) {
            System.out.printf("%d \t", myMatrizR[i]);
        }
        System.out.println("");
    }
}
