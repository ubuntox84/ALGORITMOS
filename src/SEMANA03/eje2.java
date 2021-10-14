/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class eje2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar 02 numeros: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        String x=(a==b)?"a es Iguales b su valor es "+
                String.valueOf(a):((a>b)?(a+" es mayor"):(String.valueOf(b)+" es mayor"));
        System.out.println("Respuesta: "+x);
    }
}
