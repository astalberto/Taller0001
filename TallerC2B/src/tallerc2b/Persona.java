/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerc2b;

/**
 *
 * @author utpl
 */
public class Persona {

    private int id;
    private String nombre;
    private char sexo;

    public Persona(int _id, String _nombre, char _sexo) {
        this.id = _id;
        this.nombre = _nombre;
        this.sexo = _sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
