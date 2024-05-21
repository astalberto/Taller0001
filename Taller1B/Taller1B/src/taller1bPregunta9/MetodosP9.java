/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1bPregunta9;

import java.util.*;

/**
 *
 * @author StarMedia
 */
public class MetodosP9 {

    public void gimnasio() {
        Scanner entrada = new Scanner(System.in);

        String[] asistencia = new String[5];
        String[] clientes = {"Jose", "Pedro", "Daniel", "Arturo", "Richie"};
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes",
            "Sabado"};
        for (int i = 0; i < clientes.length; i++) {
            int contador = 0;
            for (int j = 0; j < dias.length; j++) {
                System.out.printf("%s asistió el dia %s?Si/No\n",
                        clientes[i], dias[j]);
                String aux = entrada.nextLine();
                aux = aux.toLowerCase();
                if (aux.equals("si")) {
                    contador++;
                }
            }
            if (contador >= 3) {
                asistencia[i] = clientes[i];
            }
        }
        for (int i = 0; i < asistencia.length; i++) {
            if (asistencia[i] == null) {
                System.out.println("Sin Descuento");
            }
            System.out.printf("Estimado %s, le informamos que "
                    + "cuenta con un descuento del 20%% en nuestro gimnasio\n",
                    asistencia[i]);
        }
    }
}
