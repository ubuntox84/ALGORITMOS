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
class persona{
    String nombre;
    String apellido;
    String apellido2;
    String DNI;

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
}
class estudian extends persona{
    String codigo;
    String facultad;
}
public class eje08 {
    public static void main(String[] args) {
        estudian e1=new estudian();
        e1.getDNI();
    }
}
