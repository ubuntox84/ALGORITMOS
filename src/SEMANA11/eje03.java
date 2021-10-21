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
class node{
    int dato;
    node sgte;
    public node(int x){
        this.dato=x;
        this.sgte=null;
    }
}
class listaNode{
    node ultimo;
    public listaNode(){
        ultimo=null;
    }
    void ingresar(int x){
        node newnode=new node(x);
        if(ultimo==null){
            ultimo=newnode;
        }else{
            newnode.sgte=ultimo;
            ultimo=newnode;
        }        
    }
    void mostrar(){
        node temp=ultimo;
        while(temp!=null){
            System.out.print(temp.dato+"\t");
            temp=temp.sgte;
        }
    }
}
public class eje03 {
    public static void main(String[] args) {
        listaNode lista=new listaNode();
        lista.ingresar(10);
        lista.ingresar(9);
        lista.ingresar(8);
        lista.ingresar(5);
        lista.ingresar(4);
        lista.mostrar();
    } 
}
