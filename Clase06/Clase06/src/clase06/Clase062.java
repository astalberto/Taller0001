/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase06;

/**
 *
 * @author StarMedia
 */
public class Clase062 {

    public static void main(String[] args) {
        // TODO code application logic here
        Metodos2 obj = new Metodos2();
        obj.llenado();
        if(obj.repetido() == true){
            System.out.println("Hay numeros repetidos, porfavor intente de nuevo");
        }else{
            obj.x();
        }
    }
}
