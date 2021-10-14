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
interface valor{
    default void suspendido(){
        
    }
}
class computo implements valor{

    String marca;
    float precio;

    void prender() {

    }

    void apagar() {

    }
    
}

public class eje25 {

    public static void main(String[] args) {
        computo c1 = new computo() {
            @Override
            public void suspendido(){
                System.out.println("SUSPENDER");
            }
            @Override
            void prender() {
                System.out.println("PRENDIDO");
            }

            @Override
            void apagar() {
                System.out.println("APAGADO");
            }
            
        };
        c1.apagar();
        c1.suspendido();
    }
}
