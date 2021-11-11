/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana14;

/**
 *
 * @author chris
 */
public class eje02 {
    public static void main(String[] args) {
        int vect[]={7,9,4,8,10,5,6,1};
        int v=10;
        ordenamiento(vect);
        mostrar(vect);
        System.out.println("\nValor a buscar: "+v);
        System.out.println(busquedaBinaria(vect,v)?"VALOR ENCONTRADO":"NO SE ENCONTRO!");
    }

    private static void ordenamiento(int[] vect) {
        int temp;
        for (int i = 0; i < vect.length-1; i++) {
            for (int j = i+1; j < vect.length; j++) {
                if(vect[i]>vect[j]){
                    temp=vect[i];
                    vect[i]=vect[j];
                    vect[j]=temp;
                }
            }
        }
        
    }

    private static void mostrar(int[] vect) {
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i]+"\t");
        }
    }

    private static boolean busquedaBinaria(int[] vect, int v) {
        int i,j,m;
        i=0;
        j=vect.length-1;
        while(i<=j){
            m=(i+j)/2;
            if(vect[m]==v){
                return true;
            }else if(vect[m]<v){
                i=m+1;
            }else{
                j=m-1;
            }
        }
        return false;
    }

   
    
}
