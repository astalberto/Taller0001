/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication38;

/**
 *
 * @author alber
 */
public class JavaApplication38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] arregloGeneral;
        int numEst;
        Metodos obj = new Metodos();
        numEst = obj.numEst();
        for (int i = 0; i < numEst; i++) {
            obj.escribir();
        }
        // Arreglos
        obj.traer(numEst);
        
    }
    
}
