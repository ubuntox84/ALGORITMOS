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
public class ejer05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float contadores=0,acumulador=0;
        boolean centinelas=true;
        float numero, promedio;
        long inicio, fin, tiempo;
        inicio=System.currentTimeMillis();
        do{
            System.out.println("Ing. numero: ");
            numero=sc.nextFloat();
            if(numero>=0){
                acumulador+=numero;
                contadores++;
            }else{
                centinelas=false;
            }
        }while(centinelas);
        promedio=acumulador/contadores;
        System.out.println("La cantidad de numeros es: "+contadores+" \nEl acumulado es: "+acumulador+
                "\nEL promedio es: "+promedio);
        fin=System.currentTimeMillis();
        tiempo=fin-inicio;
        System.out.println("El tiempo de ejecutar es: "+tiempo);
        
    }
}
