/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03;

import java.util.Random;

/**
 *
 * @author chris
 */
public class eje6 {
        
    static void llenar(int [] array){
        Random rd=new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=rd.nextInt(11);
        }
    }
    static void mostrar(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }    
    public static void main(String[] args) {
        int vect[]=new int[7];
        llenar(vect);
        mostrar(vect);
    }
}
