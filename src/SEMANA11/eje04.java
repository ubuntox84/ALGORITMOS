/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA11;

/**
 *
 * @author chris
 */
 class persona{
     String name;
     public persona(String x){
         this.name=x;
     }
    String mostrar(){
        return this.name;
    } 
 }
class noddo{
    persona dato;
    noddo sgte;
    public noddo(persona x){
        this.dato=x;
        this.sgte=null;
    }
}
class listanoddo{
    noddo ultimo;
    public listanoddo(){
        this.ultimo=null;
    }
    void ingresar(String x){
        noddo newnodo=new noddo(new persona(x));
        if(ultimo==null){
           ultimo=newnodo; 
        }else{
            newnodo.sgte=ultimo;
            ultimo=newnodo;
        }        
    }
    void mostrar(){
        noddo temp=ultimo;
        while(temp!=null){
            System.out.print(temp.dato.mostrar()+"\t");
            temp=temp.sgte;
        }
    }
}
public class eje04 {
    public static void main(String[] args) {
        listanoddo lista=new listanoddo();
        lista.ingresar("Juan");
        lista.ingresar("Manuel");
        lista.ingresar("Nela");
        lista.ingresar("Lucas");
        lista.ingresar("Victoria");
        lista.mostrar();
    }
}
