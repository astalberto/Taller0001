/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1bPregunta7;

/**
 *
 * @author StarMedia
 */
public class MetodosP7 {
    public void calcular(){
        int[] lista = {7,3,5,1,2,6,8,4};
        int sumaP = 0;
        int sumaI = 0;
        for (int i = 0; i<lista.length;i++){
            if(lista[i]%2==0){
                sumaP = sumaP + lista[i];
            } else{
                if(lista[i]%2==1){
                    sumaI =  sumaI + lista[i];
                }
            }
        }
        System.out.printf("Suma de Pares: %d\nSuma de Impares: %d\n"
                ,sumaP,sumaI);
    }
}
