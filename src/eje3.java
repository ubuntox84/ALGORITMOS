/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
class nododoble{
    int dato;
    nododoble sgte;
    nododoble ant;
    public nododoble(int n){
        this.dato=n;
        this.sgte=this.ant=null;
    }
}
class opera{
    nododoble inicio;
    nododoble fin;
    public opera(){
        this.inicio=this.fin=null;
    }
    void ingresar(int n){
        nododoble newnodo=new nododoble(n);
        if(inicio==null){
            inicio=fin=newnodo;
        }else{
            fin.sgte=newnodo;
            newnodo.ant=fin;
            fin=newnodo;
        }
    }
    void mostrarInicioFin(){
        nododoble temp=inicio;
        while(temp!=null){
            System.out.print(temp.dato+"--->");
            temp=temp.sgte;
        }
    }
    void mostrarFinInicio(){
        nododoble temp=fin;
        while(temp!=null){
            System.out.print(temp.dato+"--->");
            temp=temp.ant;
        }
    }
}
public class eje3 {
    public static void main(String[] args) {
        opera op=new opera();
        op.ingresar(12);
        op.ingresar(57);
        op.ingresar(95);
        op.mostrarInicioFin();
        System.out.println("");
        op.mostrarFinInicio();
    }
}
