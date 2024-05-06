/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivoD;

import java.util.Scanner;
import java.io.*;
import java.util.Locale;

/**
 *
 * @author alber
 */
public class Metodos {

    Scanner entrada;
    File archivo;

    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.archivo = new File("miArchivo.txt");
        entrada.useLocale(Locale.US);

    }

    public int menu() {
        System.out.println("-----------------------");
        System.out.println("Escribir datos      [1]");
        System.out.println("Escribir Leer datos [2]");
        System.out.println("Salir               [0]");
        System.out.println("-----------------------");

        return entrada.nextInt();
    }

    public void escribir() {
        FileWriter escribir;
        PrintWriter linea;
        String nombre = "", correo = "", dir = "";
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (Exception e) {
            }
        }
        entrada.nextLine();
        System.out.println("Ingrese su nombre:    ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su correo:    ");
        correo = entrada.nextLine();
        System.out.println("Ingrese su dirección: ");
        dir = entrada.nextLine();
        try {
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            linea.println(nombre + "\n" + correo + "\n" + dir);
            linea.close();
            try {

            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
    }

    public void traer() {
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena = "", nombre = "", correo = "", dir = "";
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            while (cadena != null) {

                cadena = almacenamiento.readLine();
                nombre = cadena;
                cadena = almacenamiento.readLine();
                correo = cadena;
                cadena = almacenamiento.readLine();
                dir = cadena;
                if (cadena != null) {
                    System.out.println("------------------------");
                    System.out.printf("Nombre: %s\nCorreo: "
                            + "%s\nDireccion: %s\n",
                            nombre, correo, dir);
                    System.out.println("------------------------");
                }
            }
            almacenamiento.close();
            leer.close();
        } catch (Exception e) {
        }
    }
}
