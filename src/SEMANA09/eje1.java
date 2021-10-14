/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA09;

import java.io.IOException;

/**
 *
 * @author chris
 */
public class eje1 {
    public static void main(String[] args) {
        try {
            int a[]=new int[5];
            int b[]={5,8,7,9};
            System.out.println(b[1]);
            System.out.println(b[5]);
            
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Fuera de rango el vector");
        }
        catch (java.lang.NumberFormatException e) {
            System.out.println("Fuera de rango el vector");
        }
        
    }
}
