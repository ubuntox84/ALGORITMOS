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
public class eje4 {
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
                v[f][c]=rd.nextInt(5)+1;
            }
        }
    }
    static void mostrardiagonal(int v[][]){
        if(v.length!=v[0].length){
            System.out.println("La matriz no es cuadratica");
        }else{
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i][i]+" ");
            }
        }
    }
    static void mostrarinversa(int v[][]){
       if(v.length!=v[0].length){
            System.out.println("La matriz no es cuadratica");
        }else{
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i][(v.length-1)-i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int v[][]=new int [5][5];
        rellenar(v);
        mostrar(v);
        System.out.println("Diagonal principal");
        mostrardiagonal(v);
        System.out.println("\nDiagonal inversa");
        mostrarinversa(v);
    }
}
