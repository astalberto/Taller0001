/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1b;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author alber
 */
public class MetodosTaller {

    File archivo;
    File archivo2;

    public MetodosTaller() {
        this.archivo = new File("Deudas.txt");
        this.archivo2 = new File("Liberados.txt");
    }

    public void liberar(String cadena) {
        String nueva;
        FileWriter escribir;
        PrintWriter linea;
        if (!archivo2.exists()) {
            try {
                archivo2.createNewFile();
            } catch (Exception e) {
            }
        }
        try {
            nueva = cadena.replaceAll("Central de Riesgo",
                    "Liberado");
            escribir = new FileWriter(archivo2, true);
            linea = new PrintWriter(escribir);
            linea.println(nueva);
            linea.close();
        } catch (Exception e) {

        }
    }

    public void generar() {
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena = "";
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            while (cadena != null) {
                cadena = almacenamiento.readLine();
                liberar(cadena);
            }
            almacenamiento.close();
            leer.close();
        } catch (Exception e) {

        }
    }
}

