/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1bPregunta5;

/**
 *
 * @author StarMedia
 */
public class MetodosPregunta5 {

    public void primos(int a) {
        int[] numP = new int[a];

        for (int i = 0; i < a; i++) {
            if (esPrimo(i + 1) == true) {
                numP[i] = i + 1;
                System.out.println(numP[i]);
            }

        }
    }

    public boolean esPrimo(int num) {
        if (num < 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
