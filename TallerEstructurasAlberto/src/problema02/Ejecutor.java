/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

import java.util.*;

/**
 *
 * @author alber
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");
        int n = entrada.nextInt();

        Arbol catA = new Arbol();
        Arbol catB = new Arbol();
        Arbol catC = new Arbol();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmpleado " + (i + 1));

            System.out.println("Ingrese el nombre: ");
            String nombre = entrada.next();

            System.out.println("Ingrese el ID: ");
            int id = entrada.nextInt();

            System.out.println("Ingrese la categoría (A, B, o C): ");
            String cat = entrada.next().toUpperCase();

            System.out.println("Ingrese la antigüedad: ");
            int antiguedad = entrada.nextInt();

            Empleado empleado = new Empleado(nombre, id, cat, antiguedad);
            empleado.calcularSalarioBase();
            empleado.calcularBonificaciones();
            empleado.calcularDescuentoImpuestos();
            empleado.calcularSalarioTotal();

            switch (cat) {
                case "A" ->
                    Metodos.insertar(catA, empleado);
                case "B" ->
                    Metodos.insertar(catB, empleado);
                case "C" ->
                    Metodos.insertar(catC, empleado);
                default ->
                    System.out.println("Categoría ingresada es Erronea");
            }
        }

        System.out.println("\nEmpleados por Categoría:");
        System.out.println("------Categoria A------");
        Metodos.recorrer(catA.obtenerRaiz());
        System.out.println("------Categoria B------");
        Metodos.recorrer(catB.obtenerRaiz());
        System.out.println("------Categoria C------");
        Metodos.recorrer(catC.obtenerRaiz());
    }

}
