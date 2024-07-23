/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author alber
 */
public class Metodos {

    public static void insertar(Arbol arbol, Empleado empleado1) {
        arbol.establecerRaiz(insertarRecursivo(arbol.obtenerRaiz(),
                 empleado1));
    }

    public static Nodo insertarRecursivo(Nodo raiz, Empleado empleado1) {
        if (raiz == null) {
            return new Nodo(empleado1);
        }

        if (empleado1.obtenerId() < raiz.obtenerDato().obtenerId()) {
            raiz.establecerIzquierdo(insertarRecursivo
        (raiz.obtenerIzquierdo(), empleado1));
        } else if (empleado1.obtenerId() > raiz.obtenerDato().obtenerId()) {
            raiz.establecerDerecho(insertarRecursivo
        (raiz.obtenerDerecho(), empleado1));
        }

        return raiz;
    }

    public static void recorrer(Nodo raiz) {
        if (raiz != null) {
            recorrer(raiz.obtenerIzquierdo());
            System.out.println(raiz.obtenerDato());
            recorrer(raiz.obtenerDerecho());
        }
    }
}
