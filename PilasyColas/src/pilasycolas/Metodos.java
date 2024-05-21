/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasycolas;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Metodos {

    Scanner entrada;
    int[] myCola;
    int ev;
    String mensaje;

    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.myCola = new int[10];
        this.ev = 0;
        this.mensaje = "Personas Atendidas\n";
    }

    public int menu() {
        System.out.println("-----------------------");
        System.out.println("Ingresar            [1]");
        System.out.println("Atender             [2]");
        System.out.println("Retirar             [3]");
        System.out.println("Presentar Cola      [4]");
        System.out.println("Presentar Atendidos [5]");
        System.out.println("Salir               [0]");
        System.out.println("-----------------------");
        return entrada.nextInt();
    }

    public void ingresar() {
        if (!colaLlena()) {
            System.out.println("Ingrese cedula");
            myCola[ev] = entrada.nextInt();
            ev++;
            entrada.nextLine();
        } else {
            System.out.println("Cola llena");
        }
    }

    public void atender() {
        if (!colaVacia()) {
            mensaje = String.format("%s\n%s", mensaje, myCola[0]);
            recorrerIzq(0);
            ev--;
        } else {
            System.out.println("No hay clientes por atender");
        }
    }

    public int secuencial(int num) {
        for (int i = 0; i < ev; i++) {
            if (num == myCola[i]) {
                return 1;
            }
        }
        return -1;
    }

    public void retirar() {
        int num;
        System.out.println("Numero a retirar");
        num = entrada.nextInt();
        entrada.nextLine();
        int pos = secuencial(num);
        if (pos != -1) {
            recorrerIzq(pos);
            ev--;
            System.out.println("Cliente retirado exitosamente");
        } else {
            System.out.println("Cliente no existe");
        }
    }

    public void presentar() {
        System.out.println(mensaje);
    }
    public void estadoCola(){
        for (int i = 0; i < ev; i++) {
            System.out.print(myCola[i]+" | ");
        }
        System.out.println("");
    }
    public boolean colaLlena() {
        return (ev == myCola.length);
    }

    public boolean colaVacia() {
        return (ev == 0);
    }

    public void recorrerIzq(int pos) {
        for (int i = pos; i < ev - 1; i++) {
            myCola[i] = myCola[i + 1];
        }
    }
}
