/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01;

import java.util.Scanner;






/**
 *
 * @author chris
 */

// videos relacionados al tema
//silabo
//ABP

//hallar la distancia, se tiene como datos la velocidad y el tiempo--> D=V*T
public class ejer05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //variables
        int velocidad, tiempo; //variables de entrada
        int distancia;  //variable salida
        //proceso
        System.out.println("Ingresar velocidad");
        velocidad=sc.nextInt();
        System.out.println("Ingresar tiempo");
        tiempo=sc.nextInt();
        distancia=velocidad*tiempo;
        //respuesta
        System.out.println("La distancia es: "+distancia);
    }
    
}//Hallar el area y perimetro de un cuadrado
