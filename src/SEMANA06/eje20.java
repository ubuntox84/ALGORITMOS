/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA06;

import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 *
 * @author chris
 */
public class eje20 {
    public static void main(String[] args) {
        LinkedList <String> lista=new LinkedList<>();
        String cad="mango-fresa-durazno-melon-pera-papaya-uva";
        StringTokenizer st=new StringTokenizer(cad,"-");
        while(st.hasMoreTokens()){
            lista.add(st.nextToken());
        }
        System.out.println("Ingresa la fruta buscar: ");
        String cad1="mangossss";
        int x=lista.indexOf(cad1);
        System.out.println(x);
    }
}
