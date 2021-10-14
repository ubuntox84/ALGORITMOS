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
import java.util.LinkedList;

/**
 *
 * @author chris
 */
class procedimiento{
    File arch;
    BufferedReader br;
    FileOutputStream fos;
    LinkedList<String> trabajadores;
    public procedimiento(){
        arch=new File("c:/ficheroAlgoritmos/nombre.txt");
        trabajadores=new LinkedList<>();
    }
    void leer()throws IOException{
        try{
            if(!arch.exists()){
                arch.createNewFile();
            }
            br=new BufferedReader(new InputStreamReader(new FileInputStream(arch)));
            String cad=br.readLine();
            String vect[]=cad.split(",");
                for(String x: vect){
                    trabajadores.add(x);
                }
        }catch(Exception r){
            //System.out.println(r.getMessage());
        }finally{
            br.close();
        }
    }
    void escribir()throws IOException{
       try{
            fos=new FileOutputStream(arch);
            fos.write(formatoCadena().getBytes());
       }catch(IOException e){
           System.out.println(e.getMessage());
       }finally{
           fos.close();
       }
    }
    String formatoCadena(){
        String tempcad="";
        int cont=0;
        for(String x:trabajadores){
            cont++;
           if(cont==trabajadores.size()){
               tempcad+=x;
           }else{
               tempcad+=x+",";
           }
        }
        return tempcad;
    }
    void mostrar(){
        String cad="";
        for(String x:trabajadores){
            System.out.println(x);
        }
    }
    
   void agregar(String x){
       trabajadores.add(x);
   }
//   void buscar(){
//       
//       for(String x:trabajadores){
//            cad+=" "+x;
//        }
//   }
}
public class eje6 {
    public static void main(String[] args) throws IOException{
        procedimiento pc=new procedimiento();
        pc.leer();
        pc.mostrar();
//        pc.agregar("Marlon");
//        pc.agregar("Maria");
//        pc.agregar("Valetina");
        pc.escribir();
                
    }
}
