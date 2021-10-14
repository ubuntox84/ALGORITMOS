/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA04;

/**
 *
 * @author chris
 */
public class eje1 {
    static void mostrar(int v[][]){
        for (int f = 0; f < v.length; f++) {
            for (int c = 0; c < v[0].length; c++) {
                System.out.print(v[f][c]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int [][] vect=new int [4][2];
        int [][] vect3=new int [5][3];
        int [][] vect2={{2,3,5},{5,4,7},{7,8,9},{8,8,8}};
        mostrar(vect2);
    }
}
