package problema03;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author alber
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Metodos metodos = new Metodos();
        System.out.println("Ingrese la cantidad de clientes a agregar:");
        int cantidadClientes = entrada.nextInt();
        entrada.nextLine();
        for (int i = 0; i < cantidadClientes; i++) {
            System.out.printf("\nIngrese los datos del cliente %d:\n", (i + 1));
            System.out.println("Nombre: ");
            String nombre = entrada.nextLine();
            System.out.println("ID: ");
            int id = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Antigüedad de años en la empresa: ");
            int antiguedad = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Historial crediticio (A/B/C): ");
            String historialCrediticio = entrada.nextLine();
            System.out.println("Monto de compra: ");
            double montoCompra = entrada.nextDouble();
            entrada.nextLine();
            Cliente cliente = new Cliente(nombre, id, antiguedad, historialCrediticio, montoCompra);
            metodos.insertarCliente(cliente);
        }
        metodos.imprimirClientesPorCategoria();
    }
}
