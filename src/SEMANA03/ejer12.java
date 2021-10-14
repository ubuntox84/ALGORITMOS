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
public class ejer12 {
    
    static void mostrar(int x[]){
        for(Integer r:x){
            System.out.print(r+" ");
        }
    }
    static void burbuja(int x[]){
        boolean band=true;
        int temp;
        while(band){
            band=false;
            for (int i = 0; i < x.length-1; i++) {
                if(x[i]>x[i+1]){
                    temp=x[i];
                    x[i]=x[i+1];
                    x[i+1]=temp;
                    band=true;
                }
            }
            if(!band)break;
        }
    }
    public static void main(String[] args) {
        int v[]={10,25,1,30,17, 18,1, 11};
        System.out.println("Vector: \n");
        mostrar(v);
        burbuja(v);
        System.out.println("\nVector ordenado: \n");
        mostrar(v);
    }
}
