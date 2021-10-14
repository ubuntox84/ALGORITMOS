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
public class ejer010 {
    public static void main(String[] args) {
        float prestamo=7200, deuda, devolver=360;
        deuda=prestamo;
        float i=0.1f;
        boolean centinela=true;
        int mes=1;
        float cantidaInteres=0, interes;
        float totalPagar=0;
        
        while(centinela){
            interes=devolver*i;            
            totalPagar=devolver+interes;
            deuda-=devolver;
            System.out.println("Mes: "+mes+" Devolver: "+devolver+" El interes es: "+interes+" interes acumulado: "+cantidaInteres+" Tiene una deuda: "+deuda);   
            cantidaInteres+=interes;
            mes++;
            if(deuda==0) centinela=false;
        }
    }
}
