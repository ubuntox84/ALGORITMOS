/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana15;

/**
 *
 * @author chris
 */
interface texto{
    void cadena(String c);
}
public class eje09 {
    public static void main(String[] args) {
        texto t=new texto() {
            @Override
            public void cadena(String c) {
                System.out.println("Buenos dias "+c);
            }
        };
        t.cadena("Christian Garcia");
    }
}
