/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerc2b;

/**
 *
 * @author utpl
 */
public class Alumno extends Persona {

    private float[] notas;

    public Alumno(int _id, String _nombre, char _sexo, float[] _notas) {
        super(_id, _nombre, _sexo);
        notas = _notas;
    }

    public float getPromedio() {
        float sum = 0;
        for (float nota : getNotas()) {
            sum += nota;
        }
        return sum / 3;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        String mensaje = String.format("ID: %s\nNombre: %s\nSexo: %s\n", super.getId(), super.getNombre(), super.getSexo());
        mensaje = String.format("%sNotas\n", mensaje);
        for (int i = 0; i < 3; i++) {
            mensaje = String.format("%s%.2f\n", mensaje, notas[i]);
        }
        mensaje = String.format("%sPromedio Notas: %.2f\n", mensaje, getPromedio());

        return mensaje;
    }

}
