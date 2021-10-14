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
public class ejer02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int sumatoria=0;
        boolean op=true;
        String op2="";
        while(op){
            System.out.println("Ingresar num:");
            num=sc.nextInt();
            sumatoria=sumatoria+num;
            System.out.println("Deseas continuar? S/N");
            op2=sc.next();
            if(op2.equalsIgnoreCase("S"))
                op=true;
            else
                op=false;
        }
        System.out.println("La sumatoria es: "+sumatoria);
    }
}
