/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasenlazadas;

/**
 *
 * @author utpl
 */
public class Main {

    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int opc, num;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1 -> {
                    System.out.println("Ingrese elemento: ");
                    num = obj.entrada.nextInt();
                    obj.PushFila(num);
                }
                // case 2 ->obj.popPila();
            }
        } while (opc != 0);
    }
}
