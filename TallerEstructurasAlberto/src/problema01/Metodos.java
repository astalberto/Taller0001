/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author alber
 */
public class Metodos {

    private Nodo raiz;

    public Nodo insertarRecursivo(Nodo raiz, int num) {
        if (raiz == null) {
            return new Nodo(num);
        }

        if (num < raiz.obtenerDato()) {
            raiz.establecerIzquierdo(insertarRecursivo(raiz.obtenerIzquierdo(), num));
        } else if (num > raiz.obtenerDato()) {
            raiz.establecerDerecho(insertarRecursivo(raiz.obtenerDerecho(), num));
        } else {
            raiz.establecerConteo(raiz.obtenerConteo() + 1);
        }

        return raiz;
    }

    // Inorder
    public void recorrerRecursivo(Nodo raiz) {
        if (raiz != null) {
            recorrerRecursivo(raiz.obtenerIzquierdo());
            System.out.println("El numero: " + raiz.obtenerDato() + " se repite: " + raiz.obtenerConteo() + " veces");
            recorrerRecursivo(raiz.obtenerDerecho());
        }
    }
}
