/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1bPregunta2;

import java.io.*;
import java.util.*;

/**
 *
 * @author StarMedia
 */
public class MetodosPregunta2 {

    Scanner entrada;
    File archivo;

    public MetodosPregunta2() {

        this.entrada = new Scanner(System.in);
        this.archivo = new File("Pacientes.txt");
    }

    public void datos() {
        FileWriter escribir;
        PrintWriter linea;
        String nombres = "", apellidos = "", cedula = "", fecha = "", altura = "";
        String peso = "", alergias = "", aux = "";
        int num;
        System.out.println("Ingrese la cantidad de pacientes.");
        num = entrada.nextInt();
        if (archivo.exists()) {

            try {

                archivo.createNewFile();

            } catch (Exception e) {
            }

        }
        try {
            entrada.nextLine();
            for (int i = 1; i <= num; i++) {
                System.out.println("Ingrese el numero de cedula");
                cedula = entrada.nextLine();
                System.out.println("Ingrese los nombres completos");
                nombres = entrada.nextLine();
                System.out.println("Ingrese los apellidos completos");
                apellidos = entrada.nextLine();
                System.out.println("Ingrese su fecha de nacimiento en este "
                        + "formato DD/MM/AA");
                fecha = entrada.nextLine();
                System.out.println("Ingrese la estatura del paciente (En "
                        + "centimetros)");
                altura = entrada.nextLine();
                System.out.println("Ingrese el peso del paciente"
                        + "(En kilogramos)");
                peso = entrada.nextLine();
                System.out.println("¿El paciente tiene alguna alergia?");
                aux = entrada.nextLine();
                aux = aux.toLowerCase();
                if (aux.equals("si")) {
                    System.out.println("¿Qué alergia posee?");
                    alergias = entrada.nextLine();
                } else {
                    alergias = "Ninguna";
                }
                String nombreTotal = nombres + " " + apellidos;
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.printf("Paciente %d\nNombre completo: %s\nCedula:%s\n"
                        + "Fecha de nacimiento: %s\n"
                        + "Estatura: %s cm\nPeso: %s kg\nAlergias: %s\n",
                        i, nombreTotal,
                        cedula, fecha, altura, peso,
                        alergias);
                linea.close();

            }
        } catch (Exception e) {
        }

    }

}
