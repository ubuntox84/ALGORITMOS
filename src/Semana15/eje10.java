/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author chris
 */
public class eje10 {
    public static void main(String[] args) {
        List<Integer> lista=Arrays.asList(15,14,7,8,15);
        lista.forEach(x->System.out.print(x+"\t"));
        Stream<Integer> registro=lista.stream();
        System.out.println("");
        //registro.forEach(x->System.out.print(x+"\t"));
        int su=registro.reduce(0, Integer::sum);
        System.out.println("La suma es: "+su);
    }
}
