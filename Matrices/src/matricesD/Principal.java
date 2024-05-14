/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricesD;

/**
 *
 * @author utpl
 */
public class Principal {

    public static void main(String[] args) {
        Metodos obj = new Metodos(3);
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    obj.leerMatriz(obj.myMatriz);
                    break;
                case 2:
                    obj.leerMatriz(obj.myMatriz2);
                    break;
                case 3:
                    obj.presentarMatriz(obj.myMatriz);
                    break;
                case 4:
                    obj.presentarMatriz(obj.myMatriz2);
                    break;

                case 5:
                    obj.transposicionMatrices();
                    break;

                case 6:
                    obj.diagonalSecundariaTransposicion();
                case 7:
                    obj.multMatriz();
                    break;
                default:
            }
        } while (opc != 0);
    }

}
