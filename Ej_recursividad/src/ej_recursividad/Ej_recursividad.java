/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_recursividad;

/**
 *
 * @author alber
 */
public class Ej_recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodo obj = new Metodo();
        int opc, num, base, exponente;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1 -> {
                    System.out.println("Ingrese numero:");
                    num = obj.entrada.nextInt();
                    System.out.printf("Es igual a %s\n",
                            obj.factorial(num));

                }
                case 2 -> {
                    System.out.println("Ingrese base:");
                    base = obj.entrada.nextInt();
                    System.out.println("Ingrese exponente:");
                    exponente = obj.entrada.nextInt();
                    System.out.printf("Es igual a %s\n",
                            obj.potencia(base, exponente));
                }
                case 3 -> {
                    System.out.println("Ingrese numero:");
                    num = obj.entrada.nextInt();
                    System.out.printf("Es igual a %s\n",
                            obj.fibo(num));
                }
                case 4 -> {
                    System.out.println("Ingrese numero:");
                    num = obj.entrada.nextInt();
                    System.out.printf("Es igual a %s\n",
                            obj.fibonacci(num));
                }
                default -> {
                }
            }
        } while (opc != 0);
    }

}
