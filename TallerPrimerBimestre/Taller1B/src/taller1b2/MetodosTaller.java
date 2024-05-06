/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1b2;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author alber
 */
public class MetodosTaller {

    File archivo;
    Scanner entrada;

    public MetodosTaller() {
        this.archivo = new File("Pacientes.txt");
        this.entrada = new Scanner(System.in);
    }

    public void iteraciones() {
        int n = 0;
        System.out.println("Cuantos pacientes desea ingresar:");
        n = entrada.nextInt();
        for (int i = 1; i <= n; i++) {
            escribir(i);
        }
    }

    public void escribir(int n) {
        FileWriter escribir;
        PrintWriter linea;
        String cedula = "", apellidosC = "", nombresC = "", fechaN = "", alergias = "";
        double estatura = 0, peso = 0;
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (Exception e) {
            }
        }
        System.out.println("Paciente" + n);
        entrada.nextLine();
        System.out.println("Ingrese su cedula:    ");
        cedula = entrada.nextLine();
        System.out.println("Ingrese sus Apellidos Completos:    ");
        apellidosC = entrada.nextLine();
        System.out.println("Ingrese sus Nombres Completos:    ");
        nombresC = entrada.nextLine();
        System.out.println("Ingrese su fecha de nacimiento: ");
        fechaN = entrada.nextLine();
        System.out.println("Ingrese su estatura: ");
        estatura = entrada.nextDouble();
        System.out.println("Ingrese su peso: ");
        peso = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese su/s alergias: ");
        alergias = entrada.nextLine();
        try {
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            linea.println("Paciente " + n);
            linea.printf("Cedula: %s\nNombres Completos: %s %s\nFecha de nacimento: %s\n"
                    + "Estatura :%.2f\nPeso: %.2f\nAlergias: %s\n",
                    cedula,
                    nombresC,
                    apellidosC,
                    fechaN,
                    estatura,
                    peso,
                    alergias);
            linea.println("--------------------------------");
            linea.close();
        } catch (Exception e) {
        }
    }
}
