/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana15;


import java.util.Arrays;
import java.util.List;

/**
 *
 * @author chris
 */
public class eje14 {
    public static void main(String[] args) {
        List<Integer> lista= Arrays.asList(1,2,3,4,5,6,7,8,9);
        int suma=lista.stream().reduce(0,(acu,elem)->acu+elem);
        System.out.println("La suma es: "+suma);
    }
}
