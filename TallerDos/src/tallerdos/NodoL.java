/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdos;

/**
 *
 * @author utpl
 */
public class NodoL extends Persona {

    float[] notas;
    NodoL sig;

    public NodoL(int _id, String _nombre, char _sexo, float[] _notas) {
        super(_id, _nombre, _sexo);
        this.notas = _notas;
        this.sig = null;
    }

    public float getPromedio() {
        float _prom = 0;
        for (int i = 0; i < notas.length; i++) {
            _prom = notas[i];
        }
        return _prom / notas.length;
    }
}
