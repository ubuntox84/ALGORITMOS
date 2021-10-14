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
public class eje08 {
    public static void main(String[] args) {
        int tam=6;
        int resp=0;
        for (int i = 0; i < tam; i++) {
            resp+=fibo(i);
            System.out.print(fibo(i)+"\t");
        }
        System.out.println("La suma es: "+resp);
    }
    static int fibo(int n){
        if(n==0||n==1){
            return 1;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
}


// 1  1  2   3    5   8   13 