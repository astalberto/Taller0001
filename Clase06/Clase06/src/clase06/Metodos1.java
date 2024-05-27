/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase06;

import java.util.*;

/**
 *
 * @author StarMedia
 */
public class Metodos1 {

    int[][] arreglo;
    int[][] arregloB;

    public void llenarArreglo(int a) {
        Random rand = new Random();
        this.arregloB = new int[a][a];

        this.arreglo = new int[a][a];
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                arreglo[i][j] = rand.nextInt(20);
            }
        }
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese que valor desea de la serie");
        int n = entrada.nextInt();
        System.out.println("MATRIZ");
        for (int i = 0; i < arregloB.length; i++) {
            for (int j = 0; j < arregloB[i].length; j++) {
                arregloB[i][j] = arreglo[i][j] * fibonacci(n);
                System.out.print(arregloB[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public int fibonacci(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
