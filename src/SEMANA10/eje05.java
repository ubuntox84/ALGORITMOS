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
public class eje05 {
    public static void main(String[] args) {
        float N=5;
        float resp=factor(N);
        System.out.println("Factorial de :"+N+" es: "+resp);
    }
    static float factor(float x){
        float resp=1;
        if(x==0){
            return 1;
        }else{
            resp=x*factor(x-1);
        }
        return resp;
    }
}
