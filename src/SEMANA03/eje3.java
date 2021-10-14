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
public class eje3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int acumulado=0;
        boolean bandera=true;
        do{
            System.out.println("Ingresar un numero: ");
            n=sc.nextInt();
            for (int i = 1; i <= n; i++) {
                acumulado+=i;
            }
            System.out.println("La sumatoria es: "+acumulado);
            System.out.println("Desea continuar? S/N");
            bandera=(sc.next().equalsIgnoreCase("N")?false:true);
            //bandera=(!sc.next().equalsIgnoreCase("N"));
        }while(bandera);    
    }
}
