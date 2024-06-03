/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enlazada;

/**
 *
 * @author utpl
 */
public class Enlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int opc, num;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    System.out.println("Elemento a insertar");
                    num = obj.entrada.nextInt();
                    obj.insertar(num);
                    break;
                case 2:
                    obj.recorrer();
                default:
                    throw new AssertionError();
            }
        } while (opc != 0);
    }

}
