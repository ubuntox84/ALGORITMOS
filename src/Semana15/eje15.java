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
public class eje15 {
    public static void main(String[] args) {
        List<String> lista=Arrays.asList("A","B","C","D","F","G");
        String cad=lista.stream().reduce("",(acu, ele)->{
            if(ele!="A"){
                return acu+ele; 
            }
            return acu;
        });
        System.out.println(cad);
    }
}
