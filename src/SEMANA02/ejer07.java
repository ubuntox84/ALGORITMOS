/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02;

/**
 *
 * @author chris
 */
public class ejer07 {
    static int contador=0;
    static void intercambio(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        contador++;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            intercambio(i,i+1);
        }
        System.out.println("El numero de intercambio: "+contador);
    }
}
