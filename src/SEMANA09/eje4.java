/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author chris
 */
class teclado{
    String leerCadena()throws IOException{
        String cad="";
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System  .in));
        cad=br.readLine();
        return cad;
    }
    int leerEntero()throws IOException{
        int cad;
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System  .in));
        cad=Integer.parseInt(br.readLine());
        return cad;
    }
    float leerFloat()throws IOException{
        float cad;
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System  .in));
        cad=Float.parseFloat(br.readLine());
        return cad;
    }
}
public class eje4 {
    public static void main(String[] args) throws IOException{
        teclado tecla=new teclado();
        String cad="";
        int eda;
        System.out.println("Escribir sus nombre");
        cad=tecla.leerCadena();
        System.out.println("Escribir su edad");
        eda=tecla.leerEntero();
        System.out.println("Buenos dias "+cad+" Tu edad es: "+eda);
    }
}
