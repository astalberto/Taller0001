/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 0;
        System.out.println("Ingrese el tamaño de la matriz");
        n = entrada.nextInt();
        Metodo obj = new Metodo(n);
        obj.ejecutor();
    }

}
