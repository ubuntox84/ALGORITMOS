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
public class eje1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // 0 Parar, 2 amarillo, 1 verde
        int dato;
        boolean bandera=true;
        do{
            System.out.println("Ingrese una accion");
            dato=sc.nextInt();
            String cad=(dato==0)?("Parar"):((dato==1)?("Avanzar"):("Atención"));
            System.out.println(cad);
            System.out.println("Desea continuar? S/N");
            String res=sc.next();
            bandera=(res.equalsIgnoreCase("S"))?true:false;
        }while(bandera);
        
    }
}
