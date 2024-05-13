/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myaula;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Metodos {

    Scanner entrada;
    Alumno[] myAula;
    int ev;

    public Metodos(int lim) {
        this.entrada = new Scanner(System.in);
        this.myAula = new Alumno[lim];
        this.ev = 0;
    }

    public int menu() {
        System.out.println("-----------------------");
        System.out.println("Insertar            [1]");
        System.out.println("Presentar           [2]");
        System.out.println("Salir               [0]");
        System.out.println("-----------------------");

        return entrada.nextInt();
    }

    public boolean aulaLlena() {
        return (ev == myAula.length);
    }

    public boolean aulaVacia() {
        return (ev == 0);
    }

    public Alumno leeDatos() {
        int _id;
        String _nombre;
        char _sexo;
        float[] notas = new float[3];
        System.out.println("Ingrese Id");
        _id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese nombre");
        _nombre = entrada.nextLine();
        System.out.println("Ingrese sexo");
        _sexo = entrada.next().charAt(0);
        for (int i = 0; i < 3; i++) {
            System.err.println("Ingrese nota" + (i + 1));
            notas[i] = entrada.nextFloat();
        }
        Alumno nuevo = new Alumno(_id, _nombre, _sexo, notas);
        return nuevo;
    }

    public void insertar() {
        if (!aulaLlena()) {
            myAula[ev] = leeDatos();
            ev++;
        } else {
            System.out.println("Aula llena");
        }
    }

    public void presentar() {
        if (!aulaVacia()) {
            for (int i = 0; i < ev; i++) {
                System.out.println(myAula[i]);
            }
        }else{
            System.out.println("Aula Vacia...");
        }
    }
}
