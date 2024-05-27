
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author alber
 */
public class Metodo {

    /**
     * @param args the command line arguments
     */
    int[] a1 = new int[5];
    int[] a2 = new int[5];
    int[] ar = new int[5];

    Scanner entrada = new Scanner(System.in);

    public void llenado() {
        System.out.println("Llenado de el arreglo");
        for (int i = 0; i < a1.length; i++) {
            System.out.println("Ingrese un numero");
            int aux = entrada.nextInt();
            a1[i] = aux;
        }
        repetido(a1);
        System.out.println("Llenado de el arreglo");
        for (int i = 0; i < a2.length; i++) {
            System.out.println("Ingrese un numero");
            int aux = entrada.nextInt();
            a2[i] = aux;   
        }
        repetido(a2);
    }
    public void repetido(int[] x){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (x[i]==x[j]) {
                    System.out.println("Existen valores repetidos");
                }
            }
        }
    }
    
    public void x() {
        System.out.println("Resta del arreglo resultante");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = a1[i] - a2[i];
        }
        System.out.println("Presentacion del arreglo resultante");
        for (int i = 0; i < 10; i++) {
            System.out.println(ar[i]);
        }
    }
}
