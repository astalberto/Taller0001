/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int n = entrada.nextInt();
        System.out.println("El termino " + n + " de la secuencia de Fibonacci es: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
