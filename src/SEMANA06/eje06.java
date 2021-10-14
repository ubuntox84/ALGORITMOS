/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA06;

/**
 *
 * @author chris
 */
class laptop{
    String nombre;
    int precio;
    String marca;
    String mostrar(){
        return this.nombre;
    }
    String mostrar(String n){
        return n+this.nombre;
    }
    String mostrar(String n, String m){
        return m+n+this.nombre;
    }
    String mostrar(String n, String m, String r){
        return r+m+n+this.nombre;
    }
}
public class eje06 {
    public static void main(String[] args) {
        laptop l1=new laptop ();
        l1.mostrar("Toshiba", "Lenovo");
    }
}
