/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA06;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author chris
 */
public class eje15 {
    public static void main(String[] args) {
        ArrayList<Integer> lista=new ArrayList<>();
        lista.add(15);
        lista.add(8);
        lista.add(4);
        lista.add(9);
        lista.add(2);
        lista.add(13);
        lista.add(5);
        Iterator x=lista.listIterator();
        while(x.hasNext()){
            System.out.print(x.next()+" ");
        }
    }
}
