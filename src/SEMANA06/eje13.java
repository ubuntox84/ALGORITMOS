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
abstract class equipo{
    int nropersonas;
    String nombre;
    String datos(){
        return this.nombre+this.nropersonas;
    }
    abstract String modoTrabajo();
    //abstract String lugar();
}
class gloria extends equipo{
    String modoTrabajo(){
        return "VIrtual";
    }
    String lugar(){
        return "ONPE";
    }
}
public class eje13 {
    public static void main(String[] args) {
        gloria g1=new gloria();
        System.out.println(g1.modoTrabajo());
    }
}
