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
                case 1 -> {
                    System.out.println("Elemento a insertar");
                    num = obj.entrada.nextInt();
                    obj.insertar(num);
                }
                case 2 ->
                    obj.recorrer();
                case 3 -> {
                    System.out.println("Elemento a insertar");
                    num = obj.entrada.nextInt();
                    obj.insertarInicio(num);
                }
                case 4 -> {
                    System.out.println("Elemento a insertar");
                    num = obj.entrada.nextInt();
                    obj.ordenado(num);
                }
                case 5 -> {
                    System.out.println("Elemento a Eliminar");
                    num = obj.entrada.nextInt();
                    obj.eliminar(num);
                }
            }
        } while (opc != 0);
    }

}
