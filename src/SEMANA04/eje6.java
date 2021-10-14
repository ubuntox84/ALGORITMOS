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
 * 
 * Para recorrer un array multidimensional, mostrar el número de pares e impares en total
 */
public class eje6 {
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
    static void paresimpares(int v[][]){
        int par=0, impar=0;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[0].length; j++) {
                if(v[i][j]%2==0)
                    par++;
                else
                    impar++;
                
            }
        }
        System.out.println("N° Pares: "+par);
        System.out.println("N° Impar: "+impar);
    }
    public static void main(String[] args) {
        int v[][]=new int [3][3];
        rellenar(v);
        mostrar(v);
        System.out.println("Calcular pares e impares");
        paresimpares(v);
    }}
