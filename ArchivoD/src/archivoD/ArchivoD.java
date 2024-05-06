/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivoD;

/**
 *
 * @author alber
 */
public class ArchivoD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1 -> obj.escribir();
                case 2 -> obj.traer();
                default -> {
                }
            }
        } while (opc != 0);
    }

}
