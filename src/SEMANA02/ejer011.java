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
public class ejer011 {
    
    //4!= 4*3*2*1
    static double factorial(double x){
        double fact=1;
        for (int i = 1; i <= x; i++) {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n;
        double temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ing. n:");
        n=sc.nextInt();
        double acumulador=0;
        for (int i = 1; i <= n; i++) {
            temp=1/factorial(i);
            System.out.print(temp+" + ");
            acumulador+=temp;
        }
        System.out.println("\nEl acumulado es: "+acumulador);
    }
}
