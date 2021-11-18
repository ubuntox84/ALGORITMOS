/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author chris
 */
public class eje02 {
    public static void main(String[] args) {
        ArrayList<Integer> lista=new ArrayList<>();
        Random rd=new Random();
        for (int i = 0; i < 10; i++) {
            lista.add(rd.nextInt(21));
        }
        lista.forEach(x->System.out.print(x.intValue()+" "));
        Collections.sort(lista);
        System.out.println("");
        lista.forEach(x->System.out.print(x.intValue()+" "));
        Collections.sort(lista,Collections.reverseOrder());
        System.out.println("");
        lista.forEach(x->System.out.print(x.intValue()+" "));
        
    }
}
