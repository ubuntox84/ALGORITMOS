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
public class eje06 {
    public static void main(String[] args) {
        int resp=func(8);
        System.out.println(resp);
    }
    static int func(int n){
        int resp=1;
        resp=n*func(n-1);
        return resp;
    }
}
