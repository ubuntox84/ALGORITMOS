/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA12;

/**
 *
 * @author chris
 */
class casa{
    String name;
    public casa(String n){
        this.name=n;
    }
    void mostrarNombre(){
        System.out.println(this.name); 
    }
}
public class eje07 {
    public static void main(String[] args) {
        casa r1=new casa("Juan");
        r1.mostrarNombre();
        modificarNombre(r1);
        r1.mostrarNombre();
        
    }

    private static void modificarNombre(casa r1) {
        r1.name="Manuel";
    }
}
