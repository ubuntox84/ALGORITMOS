/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02;

/**
 *
 * @author chris
 */
public class ejer08 {
    public static void main(String[] args) {
        float arr[]={10,15,5,8,10,7,8,2,7,4,-1};
        float acumulador=0, contador=0, promedio;
        boolean centinela=true;
        int i=0;
        long tinicio, tfin,tiempo;
        tinicio=System.currentTimeMillis();
        do{
            if(arr[i]>=0){
                acumulador+=arr[i];
                contador++;
                i++;
            }else{
                centinela=false;
            }
        }while(centinela);
        promedio=acumulador/contador;
        System.out.println("La cantidad de numeros es: "+contador+" \nEl acumulado es: "+acumulador+
                "\nEL promedio es: "+promedio);
        tfin=System.currentTimeMillis();
        tiempo=tfin-tinicio;
        System.out.println("El tiempo de ejecutar es: "+tiempo);
    }
    
}
