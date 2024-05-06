/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;
import java.util.Scanner;

public class Recursividad_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numero = entrada.nextInt();
        int resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es " + resultado);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
