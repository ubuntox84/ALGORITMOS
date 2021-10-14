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
public class eje10 {
    static void mostrar(int v[]){
        for(Integer r:v)
            System.out.print(r+" ");        
    }
    static void intercambio(int i,int j,int v[]){
        int temp;
        temp=v[i];
        v[i]=v[j];
        v[j]=temp;
    }
    static void Order_burbuja(int v[]){
        int temp;
        for (int i = 0; i < v.length-1; i++) {
            for (int j = i+1; j < v.length; j++) {
                if(v[j]<v[i]){
                    intercambio(i,j,v);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v[]={10,25,1,30,17};
        System.out.println("Vector: ");
        mostrar(v);
        Order_burbuja(v);
        System.out.println("\nVector Ordenado: ");
        mostrar(v);
    }
}
