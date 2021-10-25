/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA12;

/**
 *
 * @author chris
 */
class nodoo{
    int dato;
    nodoo sgte;
    public nodoo(int n){
        this.dato=n;
        this.sgte=null;
    }
    int getDato(){
        return this.dato;
    }
}
class operation{
    nodoo inicio;
    nodoo fin;
    public operation(){
        this.inicio=this.fin=null;
    }
    void ingresar(int n){
        nodoo newnodo=new nodoo(n);
        if(inicio==null){
            inicio=fin=newnodo;
        }else{
            fin.sgte=newnodo;
            fin=newnodo;
            fin.sgte=inicio;
        }
    }
    void mostrar(){
        nodoo temp=inicio;
        while(temp!=null){            
            System.out.println(temp.getDato());
            if(temp==fin){
                break;
            }
            temp=temp.sgte;
        }
    }
}
public class eje02 {
    public static void main(String[] args) {
        operation op=new operation();
       
        op.ingresar(1);
        op.ingresar(2);
        op.ingresar(3);
        op.ingresar(4);
        op.ingresar(5);
        
         op.mostrar();
        
    }
}
