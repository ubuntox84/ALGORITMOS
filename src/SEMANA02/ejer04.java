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
//Imprimir la tabla de multiplicar del número N 
public class ejer04 {
    static int darproducto(int v, int p){
        return v*p;
    }
    public static void main(String[] args) {
        long tinicio, tfin, tiempo;
        
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Ingresar N:");
        n=sc.nextInt();
        tinicio=System.currentTimeMillis();
        for (int i = 0; i <= 12; i++) {
            System.out.println(i+"*"+n+" = "+darproducto(n,i));
        }
        tfin=System.currentTimeMillis();
        tiempo=tfin-tinicio;
        System.out.println("Tiempo: "+tiempo);
    }
}
