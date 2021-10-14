/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA04;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chris
 * 
 * 3-	Crear dos matrices de nxn y sumar sus valores, 
 * los resultados se deben almacenar en otra matriz. Los valores y la longitud, 
 * seran insertados por el usuario. 
 * Mostrar las matrices originales y el resultado.
 */
public class eje3 {
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
    static void sumar(int m1[][],int m2[][],int m3[][]){
        for (int f = 0; f < m1.length; f++) {
            for (int c = 0; c < m1[0].length; c++) {
                m3[f][c]=m1[f][c]+m2[f][c];
            }
        }
    }
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingresar N:");
        int n=teclado.nextInt();
        int m1[][]=new int [n][n];
        int m2[][]=new int [n][n];
        int m3[][]=new int [n][n];
        rellenar(m1);
        rellenar(m2);
        System.out.println("Matriz 1: ");
        mostrar(m1);
        System.out.println("Matriz 2: ");
        mostrar(m2);
        sumar(m1,m2,m3);
        System.out.println("La sumatoria es: ");
        mostrar(m3);
    }
}
