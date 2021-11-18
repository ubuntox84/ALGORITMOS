/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana15;

import java.util.ArrayList;

/**
 *
 * @author chris
 */
class factura{
    private String name;
    private float importe;

    public float getImporte() {
        return importe;
    }

    public String getName() {
        return name;
    }

    public factura(String name, float importe) {
        this.name = name;
        this.importe = importe;
    }
    
}
public class eje11 {
    public static void main(String[] args) {
        ArrayList<factura> lista=new ArrayList<>();
        lista.add(new factura("movil",1500));
        lista.add(new factura("Ordenador",1000));
        lista.add(new factura("Impresora",200));
        lista.add(new factura("imac",300));
        
        factura fact=lista.stream()
                .filter(elem->elem.getImporte()>300)
                .findFirst()
                .get();
        System.out.println(fact.getName()+" "+fact.getImporte());
    }
} 
