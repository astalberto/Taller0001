/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos01;

import java.util.Scanner;

/**
 *
 * @author alber
 */
public class Metodos {

    Scanner entrada;
    int[] myArray;
    int ev;

    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.myArray = new int[5];
        this.ev = 0;
    }

    public int menu() {
        System.out.println("-----------------------");
        System.out.println("LLenar arreglo      [1]");
        System.out.println("Leer siguiente      [2]");
        System.out.println("Presentar           [3]");
        System.out.println("Secuencial          [4]");
        System.out.println("Eliminar            [5]");
        System.out.println("insertar inicio     [6]");
        System.out.println("insertar Ordenado   [7]");        
        System.out.println("Salir               [0]");
        System.out.println("-----------------------");

        return entrada.nextInt();
    }

    public void leerFull() {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Ingrese datos " + i + ": ");
            myArray[i] = entrada.nextInt();
        }
        ev = myArray.length;
    }

    public void LeerSig() {
        if (ev < myArray.length) {

            System.out.println("Ingrese datos " + ev + ": ");
            myArray[ev] = entrada.nextInt();
            ev++;
        } else {
            System.out.println("Arreglo lleno");
        }

    }

    public void presentar() {
        for (int i = 0; i < ev; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("");
    }

    public int secuencial(int num) {
        for (int i = 0; i < ev; i++) {
            if (num == myArray[i]) {
                return i;
            }
        }
        return -1;
    }

    public void eliminar(int num) {
        int pos = secuencial(num);
        if (pos != -1) {
            desplazarIzq(pos);
            ev--;
        } else {
            System.out.println("No existe....");
        }
    }

    public void desplazarIzq(int pos) {
        for (int i = pos; i < ev - 1; i++) {
            myArray[i] = myArray[i + 1];
        }
    }

    public void insInicio(int num) {
        if (ev < myArray.length) {
            desplazaDer(0);
            myArray[0] = num;
            ev++;
        }
    }

    public void desplazaDer(int pos) {
        for (int i = ev; i > pos; i--) {
            myArray[i] = myArray[i - 1];
        }
    }

    public void ordenado(int num) {
        int pos = 0;
        if (ev < myArray.length) {

            while ((pos < ev) && (num > myArray[pos])) {
                pos++;
            }
            desplazaDer(pos);
            myArray[pos]=num;
            ev++;
        }else{
            System.out.println("Arreglo Lleno");
        }

    }
}
