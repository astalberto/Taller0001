/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo10estructuras;

/**
 *
 * @author utpl
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodo obj = new Metodo(20,4);
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1 -> obj.reservarA();
                case 2 -> obj.liberarA();
                case 3 -> obj.presentarA();
                default -> {
                }
            }
        } while (opc != 0);
    }
}
