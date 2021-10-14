/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA10;

/**
 *
 * @author chris
 */
public class eje07 {
    public static void main(String[] args) {
        double n=3;
        double resp=expo(n);
        System.out.println("Respuesta es: "+resp);
    }
    static double expo(double n){
        double x=4;
        double resp;
        if(n==1){
            return 4;
        }else{
            resp=Math.pow(4,n)*expo(n-1);
        }
        return resp;
    }
}
