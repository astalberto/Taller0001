/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1bPregunta4;

/**
 *
 * @author StarMedia
 */
public class MetodosPregunta4 {

    public void secuenciaF(int a) {
        int[] arreglo = new int[a];
        for (int i = 0; i < a; i++) {
            arreglo[i] = fibonacci(i+1);
            System.out.println(arreglo[i]);
        }
    }

    // Método recursivo para calcular el n-ésimo número de Fibonacci
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
