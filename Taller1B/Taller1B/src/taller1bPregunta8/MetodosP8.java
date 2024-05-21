/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1bPregunta8;

import java.util.*;

/**
 *
 * @author StarMedia
 */
public class MetodosP8 {

    public void arreglos() {
        Random rand = new Random();
        double[] fisica = new double[20];
        double[] quimica = new double[20];
        double[] matematica = new double[20];
        double[] biologia = new double[20];
        double prom = 0;
        for (int i = 0; i < fisica.length; i++) {
            fisica[i] = rand.nextDouble(10);
            quimica[i] = rand.nextDouble(10);
            matematica[i] = rand.nextDouble(10);
            biologia[i] = rand.nextDouble(10);
            prom = calcularMediaA(fisica[i], quimica[i],
                    matematica[i], biologia[i]);
            System.out.printf("El promedio del estudiante %d es: %.2f\n",
                    i + 1, prom);
        }
        calcularMediaM(fisica, quimica, matematica, biologia);
        calcularMediaSalon(fisica, quimica, matematica, biologia);

    }

    public double calcularMediaA(double a, double b, double c, double d) {
        double prom = a + b + c + d;
        prom = prom / 4;
        return prom;
    }

    public void calcularMediaM(double[] f, double[] q, double[] m, double[] b) {
        double promM = 0;
        System.out.println("PROMEDIOS POR MATERIA");
        for (int i = 0; i < f.length; i++) {
            promM = promM + f[i];
        }
        promM = promM / f.length;
        System.out.printf("El promedio de Física es: %.2f\n", promM);
        promM = 0;
        for (int i = 0; i < f.length; i++) {
            promM = promM + q[i];
        }
        promM = promM / f.length;
        System.out.printf("El promedio de Quimica es: %.2f\n", promM);
        promM = 0;
        for (int i = 0; i < f.length; i++) {
            promM = promM + m[i];
        }
        promM = promM / f.length;
        System.out.printf("El promedio de Matemática es: %.2f\n", promM);
        promM = 0;
        for (int i = 0; i < f.length; i++) {
            promM = promM + b[i];
        }
        promM = promM / f.length;
        System.out.printf("El promedio de Biología es: %.2f\n", promM);
    }

    public void calcularMediaSalon(double[] f, double[] q, double[] m, double[] b) {
        double promM1 = 0;
        double promM2 = 0;
        double promM3 = 0;
        double promM4 = 0;
        System.out.println("PROMEDIO DEL SALÓN");
        for (int i = 0; i < f.length; i++) {
            promM1 = promM1 + f[i];
        }
        promM1 = promM1 / f.length;
        for (int i = 0; i < f.length; i++) {
            promM2 = promM2 + q[i];
        }
        promM2 = promM2 / f.length;
        for (int i = 0; i < f.length; i++) {
            promM3 = promM3 + m[i];
        }
        promM3 = promM3 / f.length;
        for (int i = 0; i < f.length; i++) {
            promM4 = promM4 + b[i];
        }
        promM4 = promM4 / f.length;
        promM4 = promM1 + promM2+promM3+promM4;
        promM4 = promM4/4;
        System.out.printf("El promedio del salón es: %.2f\n",promM4);
    }
}
