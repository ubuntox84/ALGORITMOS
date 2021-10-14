/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class ejer01 {
    public static void main(String[] args) {
        int a,b;
        Scanner es=new Scanner(System.in);
        System.out.println("Ingresar A:");
        a=es.nextInt();
        System.out.println("Ingresa B:");
        b=es.nextInt();
        if(a==b){
            System.out.println(a+" es igual "+b);
        }else{
            if(a>b){
                System.out.println(a+" es mayor que "+b);
            }else{
                System.out.println(b+" es mayor que "+a);
            }
        }
    }    
}
