/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerdos;

/**
 *
 * @author utpl
 */
public class TallerDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Metodos obj = new Metodos();
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1 -> {
                    obj.llenarLista();
                }
                case 2 ->
                    obj.reporte(obj.raizH);

                case 3 ->
                    obj.reporte(obj.raizM);
            }
        } while (opc != 0);
    }
}
