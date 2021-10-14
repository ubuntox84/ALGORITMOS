/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA04;

import java.util.Random;

/**
 *
 * @author chris
 */
public class eje2 {
    static void mostrar(int v[][]){
        for (int f = 0; f < v.length; f++) {
            for (int c = 0; c < v[0].length; c++) {
                System.out.print(v[f][c]+" ");
            }
            System.out.println("");
        }
    }
    static void rellenar(int v[][]){
        Random rd=new Random();
        for (int f = 0; f < v.length; f++) {
            for (int c = 0; c < v[0].length; c++) {
                v[f][c]=rd.nextInt(10)+1;
            }
        }
    }
    public static void main(String[] args) {
        int vect[][]=new int [5][3];
        rellenar(vect);
        mostrar(vect);
        
    }
}
