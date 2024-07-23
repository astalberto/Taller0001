/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerc2b;

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
                case 1 ->
                    obj.insertar();
                case 2 ->
                    obj.recorrer();
                case 3 ->
                    obj.reporte('f');
                case 4 ->
                    obj.reporte('m');
                case 5 -> {
                    System.out.println("Id a eliminar");
                    num = obj.entrada.nextInt();
                    obj.eliminar(num);
                }
            }
        } while (opc != 0);
    }
}
