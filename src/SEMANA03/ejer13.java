/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03;

/**
 *
 * @author chris
 */
public class ejer13 {
    static void mostrar(int x[]){
        for(Integer r:x){
            System.out.print(r+" ");
        }
    }
    static void insercion(int x[]){
        int aux,j;
        for (int i = 0; i < x.length; i++) {
            j=i;
            aux=x[i];
            while((j>0)&&(aux<x[j-1])){
                x[j]=x[j-1];
                j--;
            }
            x[j]=aux;            
        }
    }
    public static void main(String[] args) {
        int v[]={10,25,1,30,17, 18,1, 11};
        System.out.println("Vector: \n");
        mostrar(v);
        insercion(v);
        System.out.println("\nVector ordenado: \n");
        mostrar(v);
    }
}
