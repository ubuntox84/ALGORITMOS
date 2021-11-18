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
interface operacion{
    float calcular(float x, float y);
}
public class eje05 {
    public static void main(String[] args) {
        //float n1,n2;
        operacion promedio=new operacion() {
            @Override
            public float calcular(float x, float y) {
                return (x+y)/2;
            }
        };
        System.out.println(promedio.calcular(8, 9));
    }
}
