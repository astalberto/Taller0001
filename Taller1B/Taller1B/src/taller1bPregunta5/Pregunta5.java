/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1bPregunta5;

import java.util.*;

/**
 *
 * @author StarMedia
 */
public class Pregunta5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Ingrese el tamaño del arreglo");
        num = entrada.nextInt();
        MetodosPregunta5 obj = new MetodosPregunta5();
        obj.primos(num);
    }
}
