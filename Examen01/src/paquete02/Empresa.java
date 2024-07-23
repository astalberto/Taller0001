/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author utpl
 */
public class Empresa {

    private String nombre;
    private String direccion;
    private Empleado[] listaEmpleados;
    private Edificio[] listaEdificio;
    private double promedioEdadEmpleado;
    private double promedioSueldoEmpleado;
    private double valorTotalEdificios;

    public Empresa(String n, String d, Empleado[] le, Edificio[] led) {
        nombre = n;
        direccion = d;
        listaEmpleados = le;
        listaEdificio = led;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerDireccion(String d) {
        direccion = d;
    }

    public void establecerListaEmpleado(Empleado[] n) {
        listaEmpleados = n;
    }

    public void establecerListaEdificio(Edificio[] n) {
        listaEdificio = n;
    }

    public void calcularPromedioEdadEmpleado() {
        double suma = 0;
        for (Empleado listaEmpleado : listaEmpleados) {
            suma = suma + listaEmpleado.obtenerEdad();
        }
        promedioEdadEmpleado = suma / listaEmpleados.length;

    }

    public void calcularPromedioSueldoEmpleado() {
        double suma = 0;
        for (Empleado listaEmpleado : listaEmpleados) {
            suma = suma + listaEmpleado.obtenerSueldo();
        }
        promedioSueldoEmpleado = suma / listaEmpleados.length;
    }

    public void calcularValorTotalEdificios() {
        double suma = 0;
        for (Edificio listaEdificio1 : listaEdificio) {
            suma = suma + listaEdificio1.obtenerValorEdificio();
        }
        valorTotalEdificios = suma;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public Empleado[] obtenerListaEmpleados() {
        return listaEmpleados;
    }

    public Edificio[] obtenerListaEdificio() {
        return listaEdificio;
    }

    public double obtenerPromedioEdadEmpleado() {
        return promedioEdadEmpleado;
    }

    public double obtenerPromedioSueldoEmpleado() {
        return promedioSueldoEmpleado;
    }

    public double obtenerValorToralEdificios() {
        return valorTotalEdificios;
    }

    @Override
    public String toString() {
        String mensaje = String.format("Empresa '%s'\nDireccion: %s\n",
                obtenerNombre(), obtenerDireccion());
        mensaje = String.format("%sSus empleados son:\n", mensaje);
        for (Empleado obtenerListaEmpleado : obtenerListaEmpleados()) {
            mensaje = String.format("%s- %s - %d años - sueldo $%.0f\n",
                    mensaje,
                    obtenerListaEmpleado.obtenerNombre(),
                    obtenerListaEmpleado.obtenerEdad(),
                    obtenerListaEmpleado.obtenerSueldo());
        }
        mensaje = String.format("%sSus edificios son:\n", mensaje);
        for (Edificio obtenerListaEdificio : obtenerListaEdificio()) {
            mensaje = String.format("%s- Nombre: %s - %s - valor $%.0f\n",
                    mensaje,
                    obtenerListaEdificio.obtenerNombre(),
                    obtenerListaEdificio.obtenerProvincia(),
                    obtenerListaEdificio.obtenerValorEdificio());
        }
        mensaje = String.format("%s\nPromedio de edad de empleados: %.2f",
                mensaje,
                obtenerPromedioEdadEmpleado());
        mensaje = String.format("%s\nPromedio de sueldos de empleados: $%.1f",
                mensaje,
                obtenerPromedioSueldoEmpleado());
        mensaje = String.format("%s\nValor de edificios: %.0f",
                mensaje,
                obtenerValorToralEdificios());

        return mensaje;
    }

}
