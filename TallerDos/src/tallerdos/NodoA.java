/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdos;

/**
 *
 * @author utpl
 */
public class NodoA extends Persona {

    float prom;
    NodoA izq;
    NodoA der;

    public NodoA(int _id, String _nombre, char _sexo, float _prom) {
        super(_id, _nombre, _sexo);
        this.prom = _prom;
        this.izq = null;
        this.der = null;
    }
}
