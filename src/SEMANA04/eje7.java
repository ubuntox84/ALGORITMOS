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
 * Para recorrer un array multidimensional, buscar el mayor y menor número de una matriz 4*4

 */
public class eje7 {
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
                v[f][c]=rd.nextInt(100);
            }
        }
    }
    static void menor_mayor(int v[][]){
        int may=v[0][0],men=v[0][0];
        for (int f = 0; f < v.length; f++) {
            for (int c = 0; c < v[0].length; c++) {
                if(may<v[f][c]){
                    may=v[f][c];
                }
                if(men>v[f][c]){
                    men=v[f][c];
                }
            }
        }
        System.out.println("El mayor es: "+may);
        System.out.println("El menor es: "+men);
    }
    public static void main(String[] args) {
        int m[][]=new int [4][4];
        rellenar(m);
        mostrar(m);
        menor_mayor(m);
    }
}
