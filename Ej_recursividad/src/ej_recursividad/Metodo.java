/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_recursividad;

import java.util.Scanner;

/**
 *
 * @author alber
 */
public class Metodo {

    Scanner entrada;

    public Metodo() {
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("---------------------------------");
        System.out.println("Factorial de un numero      [1]");
        System.out.println("Potencia de un numero       [2]");
        System.out.println("Posicion fibonacci          [3]");
        System.out.println("Salir                       [0]");
        System.out.println("---------------------------------");
        return entrada.nextInt();
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public int potencia(int base, int exponente) {
        if (exponente <= 0) {
            return 1;
        } else if (exponente == 1) {
            return base;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n-1)+fibo(n-2);
        }
    }
}
