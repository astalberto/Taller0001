/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo10estructuras;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Metodo {

    Scanner entrada;
    int[][] avion;

    public Metodo(int i, int j) {
        this.entrada = new Scanner(System.in);
        this.avion = new int[i][j];
    }

    public int menu() {
        System.out.println("-----------------------");
        System.out.println("Reservar asiento    [1]");
        System.out.println("Liberar asiento     [2]");
        System.out.println("Estado asientos     [3]");
        System.out.println("Salir               [0]");
        System.out.println("-----------------------");
        return entrada.nextInt();
    }

    public void reservarA() {
        int f, c;
        System.out.println("ingrese la fila [20]");
        f = entrada.nextInt()-1;
        System.out.println("ingrese la columna[4]");
        c = entrada.nextInt()-1;
        if (avion[f][c] == 0) {
            avion[f][c] = 1;
            System.out.println("Asiento reservado correctamente");
        } else {
            System.out.println("Asiento no disponible");
        }
    }

    public void liberarA() {
        int f, c;
        System.out.println("ingrese la fila [20]");
        f = entrada.nextInt()-1;
        System.out.println("ingrese la columna [4]");
        c = entrada.nextInt()-1;
        if (avion[f][c] == 1) {
            avion[f][c] = 0;
            System.out.println("Asiento liberado correctamente");
        } else {
            System.out.println("Asiento disponible");
        }
    }

    public void presentarA() {
        String mensaje="Asientos del vuelo Loja-Quito\n";
        for (int i = 0; i < avion.length; i++) {
            for (int j = 0; j < avion[i].length; j++) {
                mensaje=String.format("%s%d\t",mensaje, avion[i][j]);
            }
            mensaje=String.format("%s\n",mensaje);
        }
        System.out.println(mensaje);
    }
}
