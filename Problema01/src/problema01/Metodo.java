/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Metodo {

    Scanner entrada;
    int[][] myMatriz;
    int[][] myMatrizR;

    public Metodo(int n) {
        myMatriz = new int[n][n];
        this.entrada = new Scanner(System.in);
        myMatrizR = new int[myMatriz.length][myMatriz[0].length];
    }

    public void ejecutor() {
        matriz();
        int aux = determinante();
        mult(aux);
        System.out.println("Matriz");
        presentacion(myMatriz);
        System.out.println("Matriz x Determinante: " + aux);
        presentacion(myMatrizR);
    }

    public void matriz() {
        for (int i = 0; i < myMatriz.length; i++) {
            for (int j = 0; j < myMatriz.length; j++) {
                System.out.println("Ingrese numero en la posicion" + (i + 1) + " " + (j + 1));
                myMatriz[i][j] = entrada.nextInt();
            }
        }
    }

    public int determinante() {
        int sumaf = 0, restaf = 0;
        int suma;
        int resta;
        int rta;
        for (int i = 0; i < myMatriz.length; i++) {
            int k = i;
            int l = myMatriz.length - 1 - i;
            suma = 1;
            resta = 1;
            for (int j = 0; j < myMatriz.length; j++) {
                suma *= myMatriz[j][k];
                resta *= myMatriz[j][l];
                if (k < myMatriz.length - 1) {
                    k++;
                    l--;
                } else {
                    k = 0;
                    l = myMatriz.length - 1;
                }
            }
            sumaf += suma;
            restaf += resta;
        }
        rta = sumaf - restaf;
        return rta;
    }

    public void mult(int d) {
        for (int i = 0; i < myMatriz.length; i++) {
            for (int j = 0; j < myMatriz.length; j++) {
                myMatrizR[i][j] = myMatriz[i][j] * d;
            }
        }
    }

    public void presentacion(int[][] p) {
        for (int i = 0; i < myMatriz.length; i++) {
            for (int j = 0; j < myMatriz.length; j++) {
                System.out.printf("%d \t", p[i][j]);
            }
            System.out.println("");
        }
    }
}
