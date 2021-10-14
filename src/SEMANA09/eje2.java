/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA09;

/**
 *
 * @author chris
 */
public class eje2 {
    public static void main(String[] args) {
        try{
            int x;
            String cad="uno";
            x=Integer.parseInt(cad);
        }catch(java.lang.NumberFormatException r){
            System.out.println("Error de conversion");
        }
        
    }
}
