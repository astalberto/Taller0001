/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase06;

import java.util.*;
/**
 *
 * @author StarMedia
 */
public class Clase06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo");
        int num = entrada.nextInt();
        Metodos1 obj = new Metodos1();
        obj.llenarArreglo(num);
    }
    
}
