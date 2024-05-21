/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1bPregunta4;

import java.util.*;

/**
 *
 * @author StarMedia
 */
public class Pregunta4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Ingrese la cantidad de valores "
                + "que desea que se presenten");
        num = entrada.nextInt();
        MetodosPregunta4 obj = new MetodosPregunta4();
        obj.secuenciaF(num);
    }
}
