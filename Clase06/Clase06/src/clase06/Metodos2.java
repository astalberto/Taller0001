/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase06;

import java.util.Scanner;

/**
 *
 * @author StarMedia
 */
public class Metodos2 {

    int[] a1 = new int[5];
    int[] a2 = new int[5];
    int[] ar = new int[5];

    Scanner entrada = new Scanner(System.in);

    public void llenado() {
        System.out.println("Llenado de el arreglo");
        for (int i = 0; i < a1.length; i++) {
            System.out.println("Ingrese un numero para el arreglo 1");
            int aux = entrada.nextInt();
            a1[i] = aux;
        }
        System.out.println("Llenado de el arreglo");
        for (int i = 0; i < a1.length; i++) {
            System.out.println("Ingrese un numero para el arreglo 2");
            int aux = entrada.nextInt();
            a2[i] = aux;
        }
    }

    public boolean repetido() {
        for (int i = 0; i < a1.length - 1; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                if (a1[i] == a1[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public void x() {
        System.out.println("Resta del arreglo resultante");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = a1[i] - a2[i];
        }
        System.out.println("Presentacion del arreglo resultante");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
