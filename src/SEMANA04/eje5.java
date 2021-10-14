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
public class eje5 {
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
    static void transpuesta(int m[][], int mt[][]){
        for (int c = 0; c < m[0].length;c++) {
            for (int f = 0; f < m.length; f++) {
                mt[c][f]=m[f][c];
            }
        }
    }
    public static void main(String[] args) {
        int m[][]=new int [5][2];
        int mt[][]=new int [2][5];
        rellenar(m);
        mostrar(m);
        transpuesta(m,mt);
        System.out.println("Transpuetsa: ");
        mostrar(mt);

    }
}
