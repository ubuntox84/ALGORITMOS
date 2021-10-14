/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author chris
 */
class frutas{
    String name;
    float peso;
    public frutas(String n, float p){
        this.name=n;
        this.peso=p;
    }
    String mostrar(){
        return "Nombre:\t"+this.name+" Peso:\t"+this.peso;
    }

    public String getName() {
        return name;
    }

    public float getPeso() {
        return peso;
    }
    
}
class metodo{
    LinkedList<frutas> lista;
    DataInputStream dis;
    DataOutputStream dos;
    File arch;
    public metodo(){
        arch=new File("c:/ficheroAlgoritmos/frutas.txt");
        lista=new LinkedList<>();
    }
    void leer()throws IOException{
        String n="";
        float p;
        if(!arch.exists()){
            arch.createNewFile();
        }
        dis=new DataInputStream(new FileInputStream(arch));
        try{
            while((n=dis.readUTF())!=null){
                p=dis.readFloat();
                agregar(new frutas(n,p));
                //System.out.println(n+"\t"+p+"Entro");
            }
        }catch(Exception e){
            //System.out.println(e.getMessage());
        }finally{
            dis.close();
        }
    }
    void escribir()throws IOException{
        dos=new DataOutputStream(new FileOutputStream(arch));
        try {
            for(frutas f:lista){
                dos.writeUTF(f.getName());
                //dos.writeChar('\t');
                dos.writeFloat(f.getPeso());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            dos.close();
        }
    }
    void agregar(frutas f){
        if(f!=null){
            lista.add(f);
        }        
    }
    void mostrar(){
        for(frutas f: lista){
            System.out.println(f.mostrar());
        }
    }
}
public class eje03 {
    public static void main(String[] args)throws IOException{
        metodo met=new metodo();
        met.leer();
        met.agregar(new frutas("Mango",12));
        met.agregar(new frutas("Fresa",6));
        met.agregar(new frutas("Mandarina",11));
        met.mostrar();
        met.escribir();
    }
}
