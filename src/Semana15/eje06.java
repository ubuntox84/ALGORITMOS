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
interface opera{
    float calcularPromedio(float x, float y);
}
public class eje06 {
    public static void main(String[] args) {
        opera p=(float x,float y)->(x+y)/2;
        System.out.println(p.calcularPromedio(5, 9));
    }
}
