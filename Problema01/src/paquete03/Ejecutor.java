/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.util.ArrayList;
import paquete01.Cliente;
import paquete01.Vendedor;
import paquete01.Venta;
import paquete02.Traje;
import paquete02.TrajeActividadFisica;
import paquete02.TrajeFormalSecundaria;
import paquete02.TrajeInformal;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("Santiago", "Pintado");
        
        Cliente c1 = new Cliente("Pablo Espinoza", 25, "loja");
        Cliente c2 = new Cliente("Francisco Mendoza", 17, "guayaquill");
        Cliente c3 = new Cliente("Maria Montoya", 35, "quito");
        
        TrajeActividadFisica af1 = new TrajeActividadFisica(c1, 15, 25, 10);
        TrajeActividadFisica af2 = new TrajeActividadFisica(c2, 15, 20, 5);
        
        TrajeFormalSecundaria fs1 = new TrajeFormalSecundaria(c3, 20, 15, 35, 30, 35, 10);
        TrajeFormalSecundaria fs2 = new TrajeFormalSecundaria(c1, 20, 12, 34, 34, 35, 8);
        
        TrajeInformal i1 = new TrajeInformal(c2, 15, 10, 25, 10);
        TrajeInformal i2 = new TrajeInformal(c3, 15, 10, 25, 10);
        
        ArrayList<Traje> listaT = new ArrayList<>();
        
        listaT.add(af1);
        listaT.add(af2);
        
        listaT.add(fs1);
        listaT.add(fs2);
        
        listaT.add(i1);
        listaT.add(i2);
        
        for (int i = 0; i < listaT.size(); i++) {
            listaT.get(i).calcularValorFinal();
        }
        
        Venta venta1 = new Venta(vendedor1, listaT);
        
        venta1.calcularFacturaPagar();
        
        System.out.println(venta1);
    }
}
