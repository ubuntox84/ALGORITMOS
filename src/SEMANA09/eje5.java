/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chris
 */
class metodo{
    ArrayList<String> canasta;
    File archi;    
    BufferedReader br;   
    FileOutputStream output;
    public metodo(){
        archi=new File("c:/ficheroAlgoritmos/archivo.txt");
        canasta=new ArrayList<>();
    }
    void leer()throws IOException{
        try {
            if(!archi.exists()){
                archi.createNewFile();
            }
            br=new BufferedReader(new InputStreamReader(new FileInputStream(archi)));
            String line=br.readLine();
            String cad[]=line.split(",");
            for(String x:cad){
                canasta.add(x);
            }
        } catch (Exception e) {
        }finally{
           br.close();
        }        
    }
    void escribir()throws IOException{
        try {
            output=new FileOutputStream(archi);
            output.write(formarCadena().getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally{
            output.close();
        }
        
    }
    String formarCadena(){
        String cad="";
        int contador=0;
        for(String x:canasta){
            contador++;
            if(contador==canasta.size()){
                cad+=x;
            }else{
                cad+=x+",";
            }           
        }
        return cad;
    }
    void agregar(String fru){
        canasta.add(fru);
    }
    void mostrar(){
        for(String cad:canasta){
            System.out.print(cad+"  ");
        }
    }
}
public class eje5 {
    public static void main(String[] args) throws IOException{
        metodo aplicacion=new metodo();
        Scanner sc=new Scanner(System.in);
        boolean band=true;
        int op;
        aplicacion.leer();
        do{
            System.out.println("\nQue desea realizar: [1]agregar\t[2]mostrar\t[3]salir");
            op=sc.nextInt();
            switch(op){
                case 1:{
                    System.out.println("Ingresar un producto!!");
                    aplicacion.agregar(sc.next());
                    break;
                }
                case 2: {
                    aplicacion.mostrar();
                    break;
                }
                case 3:{
                    band=false;
                    aplicacion.escribir();
                    break;
                }default:System.out.println("Caracter desconocido!!");
            }
        }while(band);
        System.out.println("Hasta pronto!!!");
    }
}
