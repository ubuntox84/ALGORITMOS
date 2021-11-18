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
interface inter{
    int resp(int x, int y);
}
class number{
    static int cuadrado(int x, int y){
        return x*y;
    }
    int suma(int x){
        return x+x;
    }
    int resta(int x){
        return x-x;
    }
}
public class eje08 {
    static int calcular(inter p,int r, int x){
        return p.resp(r,x);
    }
    public static void main(String[] args) {
      System.out.println(calcular(number::cuadrado, 5, 4));
    }
}
