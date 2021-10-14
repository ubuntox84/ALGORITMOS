/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class eje19 {
    public static void main(String[] args) {
        DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String cad=df.format(LocalDateTime.now());
        Scanner sc=new Scanner(cad);
        sc.useDelimiter("-");
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
        System.out.println(cad);
    }
}
