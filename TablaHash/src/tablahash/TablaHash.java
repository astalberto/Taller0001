/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablahash;

/**
 *
 * @author UTPL
 */
public class TablaHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
        Metodos obj = new Metodos(16);
        do {
            opc = obj.menu();
            switch (opc) {
                case 1 -> obj.insertar();
                case 2 -> obj.listar();
            }
        } while (opc != 0);
    }

}
