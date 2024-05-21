/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasycolas;

/**
 *
 * @author utpl
 */
public class Principal {

    public static void main(String[] args) {

        Metodos obj = new Metodos();
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1 -> obj.ingresar(); // push
                case 2 -> obj.atender();  //pop
                case 3 -> obj.retirar();
                case 4 -> obj.estadoCola();
                case 5 -> obj.presentar();
                default -> {
                }
            }
        } while (opc != 0);
    }
}
