package myaula;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author UTPL
 */
public class Alumno extends Persona {

    float[] calificaciones;

    public Alumno(int _id, String _nombre, char _sexo, float[] _notas) {
        super(_id, _nombre, _sexo);
        this.calificaciones = _notas;
    }

    @Override
    public String toString() {
        return String.format("""
                             -------------------------
                             ID: %s
                             Nombre: %s
                             Sexo: %s
                             Notas
                             Nota 1: %.2f
                             Nota 2: %.2f
                             Nota 3: %.2f
                             -------------------------""", 
                id, nombre, sexo, 
                calificaciones[0], calificaciones[1], calificaciones[2]);
    }

}
