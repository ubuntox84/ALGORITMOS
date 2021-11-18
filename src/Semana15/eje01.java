/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author chris
 */
public class eje01 {
    public static void main(String[] args) {
        Random rd=new Random();
        int bus;
        TreeSet<Integer>lista=new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            lista.add(rd.nextInt(21));
        }
        bus=6;
        mostrar(lista);        
        String cad=buscarBinario(lista,bus)>0?" Existe ":" No existe ";
        System.out.println("\nEl valor "+bus+ cad+"dentro de la cadena");
        
    }

    private static void mostrar(TreeSet<Integer> lista) {
        for(Integer x:lista){
            System.out.print(x+" ");
        }
    }

    private static int buscarBinario(TreeSet<Integer> lista, int bus) {
        List<Integer> vector=new ArrayList<>();
        vector.addAll(lista);
        return Collections.binarySearch(vector, bus);
    }
}
