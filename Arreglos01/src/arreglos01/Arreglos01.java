/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos01;

/**
 *
 * @author alber
 */
public class Arreglos01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int opc, num, ans;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1 ->
                    obj.leerFull();
                case 2 ->
                    obj.LeerSig();
                case 3 ->
                    obj.presentar();
                case 4 -> {
                    System.out.print("Numero a buscar:\t");
                    num = obj.entrada.nextInt();
                    ans = obj.secuencial(num);
                    if (ans != -1) {
                        System.out.println("Esta en la posicion" + ans);
                    } else {
                        System.out.println("No esta");
                    }
                }
                case 5 -> {
                    System.out.print("Numero a eliminar:\t");
                    num = obj.entrada.nextInt();
                    obj.eliminar(num);
                }
                case 6 -> {
                    System.out.print("Numero a insertar:\t");
                    num = obj.entrada.nextInt();
                    obj.insInicio(num);
                }
                case 7 -> {
                    System.out.print("Numero a insertar:\t");
                    num = obj.entrada.nextInt();
                    obj.ordenado(num);
                }
                default -> {
                }
            }
        } while (opc != 0);
    }

}
