/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA08;

import java.util.ArrayList;

/**
 *
 * @author chris
 */
class frutas{
    String name;
    public frutas(String n){
        this.name=n;
    }
    String getname(){
        return name;
    }
}
class lista{
    ArrayList<frutas> numeros;
    public lista(){
        numeros=new ArrayList<frutas>();
    }
    void agregar(String x){
        numeros.add(new frutas(x));
    }
    String mostrar(){
        String cad="";
        for(frutas x:numeros){
            cad+=x.getname();
        }
        return cad;
    }
}
public class eje03 {
    public static void main(String[] args) {
        lista canasta=new lista();
        canasta.agregar("Manzana");
        canasta.agregar("platano");
        canasta.agregar("uva");
        canasta.agregar("mango");
    }
}
