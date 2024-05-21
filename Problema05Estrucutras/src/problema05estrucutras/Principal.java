/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05estrucutras;

/**
 *
 * @author utpl
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = new int[9];
        int con = 0;
        int num = 0, d;
        while (con < arreglo.length) {
            num++;
            d = 2;
            while (d <= (num / 2)) {
                if (num % d == 0) {
                    num++;
                    d = 2;
                }
                d++;
            }
            arreglo[con] = num;
            con++;
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
