/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;

/**
 *
 * @author alber
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Metodos arbolB = new Metodos();
        Nodo head = null;
        // Creacion de la matriz
        System.out.println("Ingrese el tamaño para la matriz: ");
        int n = entrada.nextInt();
        int[][] matriz = new int[n][n];
        // Dar datos a la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    System.out.printf("Ingrese el número en la posición (%d,%d) ", i, j);
                    matriz[i][j] = entrada.nextInt();
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        // Dar datos al arbol
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != 0) {
                    head = arbolB.insertarRecursivo(head, matriz[i][j]);
                }
            }
        }
        // Recorrer el arbol
        arbolB.recorrerRecursivo(head);
    }
}
