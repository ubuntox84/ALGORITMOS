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
interface saludo{
    void saludo();
    void darsaludoa(String x);
}
public class eje24 {
    public static void main(String[] args) {
        saludo Español=new saludo() {
            @Override
            public void saludo() {
                System.out.println("HOLA"); 
            }

            @Override
            public void darsaludoa(String x) {
                System.out.println("HOLA "+x); 
            }
        };
        Español.saludo();
        Español.darsaludoa("Clases!!");
    }
}
