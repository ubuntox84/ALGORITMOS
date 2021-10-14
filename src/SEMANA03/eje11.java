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
public class eje11 {
    static void mostrar(int x[]){
        for(Integer r:x){
            System.out.print(r+" ");
        }
    }
    static void seleccion(int v[]){
        int i,j, temp;
        for (i = 0; i < v.length-1; i++) {
            j=i;
            for (int k = i+1; k < v.length; k++) {
                if(v[k]<v[j]){
                    j=k;
                }
            }
            if(i!=j){
                temp=v[i];
                v[i]=v[j];
                v[j]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int v[]={10,25,1,30,17,18,4,11};
        System.out.println("Vector:");
        mostrar(v);
        seleccion(v);
        System.out.println("\nVector Ordenado: ");
        mostrar(v);
    }
}
