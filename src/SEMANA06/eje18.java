/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA06;

/**
 *
 * @author chris
 */
public class eje18 {
    public static void main(String[] args) {
        String cad="Universidad nacional agraria de la selva";
        String cad1=cad.toUpperCase();
        System.out.println(cad1);
        String cad3="mango,fresa,durazno,papaya,uva";
        String cad4[]=cad3.split(",");
        System.out.println(cad4[2]);
    }    
}
