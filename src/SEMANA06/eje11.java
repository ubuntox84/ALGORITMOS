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
final class configuracion{
    String user;
    String pass;
    final int estado=100;
    void setestado(int x){
        //this.estado=x;
    }
}
class automotriz{
    String motor;
    String nroruedas;
    int nroasientos;
    String datos(){
        return this.motor+this.nroruedas+this.nroasientos;
    }
    final String saludo(){
        return "Dios te bendiga!!";
    }
}
class auto extends automotriz{
    String color;
    @Override
    String datos(){
        return this.color+this.motor+this.nroruedas+this.nroasientos;
    }
 //   @Override
//    String saludo(){
//        return "Dios te guarde";
//    }
}
public class eje11 {
    public static void main(String[] args) {
        
    }
}
