/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricesD;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Metodos {

    Scanner entrada;
    int[][] myMatriz;
    int[][] myMatriz2;
    int[][] myMatrizR;

    public Metodos(int n) {
        myMatriz = new int[n][n];
        this.entrada = new Scanner(System.in);
        myMatriz2 = new int[n][n];
        myMatrizR = new int[myMatriz.length][myMatriz2[0].length];
    }

    public int menu() {
        System.out.println("-----------------------");
        System.out.println("Leer matriz A       [1]");
        System.out.println("Leer matriz B       [2]");
        System.out.println("Presentar   A       [3]");
        System.out.println("Presentar   B       [4]");
        System.out.println("Transposicion       [5]");
        System.out.println("Multiplicacion AyB  [6]");
        System.out.println("Salir               [7]");
        System.out.println("-----------------------");
        return entrada.nextInt();
    }

    public void leerMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Inserte dato [%d][%d]  :", i, j);
                matriz[i][j] = entrada.nextInt();
            }
        }
    }

    public void presentarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d\t", matriz[i][j]);
            }
            System.out.println("");
        }
    }

    public void transposicionMatrices() {
        int ax;                                            // Mas efectivo
        for (int i = 0; i < myMatriz.length; i++) {        // (int i = 0; i < myMatriz.length-1; i++)
            for (int j = 0; j < myMatriz[i].length; j++) { // (int j = i+1; j < myMatriz[i].length; j++)
                if (j > i) {
                    ax = myMatriz[i][j];
                    myMatriz[i][j] = myMatriz[j][i];
                    myMatriz[j][i] = ax;
                }
            }
        }
        presentarMatriz(myMatriz);
    }

    public void diagonalSecundariaTransposicion() {
        int ax, k, l = myMatriz.length - 1;

        for (int i = 0; i < myMatriz.length - 1; i++) {
            k = myMatriz.length - 1;
            for (int j = 0; j < myMatriz[i].length - 1 - i; j++) {
                ax = myMatriz[i][j];
                myMatriz[i][j] = myMatriz[k][l];
                myMatriz[k][l] = ax;
                k--;
            }
            l--;
        }
    }

    public void multMatriz() {
        int suma=0;
        for (int i = 0; i < myMatriz.length; i++) {
            for (int k = 0; k < myMatriz2[i].length; k++) {
                for (int j = 0; j < myMatriz.length; j++) {
                   suma+=myMatriz[i][j]*myMatriz2[j][k]; 
                }
                myMatrizR[i][k]=suma;
                suma=0; 
            }
        }
        presentarMatriz(myMatrizR);
    }
}
