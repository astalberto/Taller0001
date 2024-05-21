/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1bPregunta3;

/**
 *
 * @author StarMedia
 */
public class MetodosPregunta3 {

    public void almacenar() {
        int[] arregloA = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arregloB = new int[arregloA.length];
        for (int i = 0; i < arregloB.length; i++) {
            arregloB[i] = factorial(arregloA[i]);
            System.out.printf("El factorial de %d, es %d\n"
                    ,arregloA[i],arregloB[i]);
        }
    }

    public int factorial(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        // Calcula el factorial recursivamente
        return a * factorial(a - 1);
    }
}
