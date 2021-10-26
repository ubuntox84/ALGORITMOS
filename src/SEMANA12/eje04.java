/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA12;

import java.util.Random;

/**
 *
 * @author chris
 */
class fruta{
    String nombre;
    float precio;
    public fruta(String n, float p){
        this.nombre=n;
        this.precio=p;
    }
    String mostrarData(){
        return "Nombre: "+this.nombre+"\tPrecio: "+this.precio;
    }
}
//Pila - lifo - ultimos en entrar primero en salir
//Cola - fifo - primero en entrar primero en salir

class nododobles{
    fruta dato;
    nododobles sgte;
    nododobles ant;
    public nododobles(String n, float p){
        dato=new fruta(n, p);
        this.ant=this.sgte=null;
    }
}

class operacio{
    nododobles inicio;
    nododobles fin;
    public operacio(){
        this.inicio=this.fin=null;
    }
    void agregarPila(String n, float p){
        nododobles newnodo=new nododobles(n, p);
        if(inicio==null){
            inicio=fin=newnodo;
        }else{
            newnodo.ant=fin;
            fin.sgte=newnodo;
            fin=newnodo;
        }
    }
    void agregarCola(String n, float p){
        nododobles newnodo=new nododobles(n, p);
        if(inicio==null){
            inicio=fin=newnodo;
        }else{
            newnodo.sgte=inicio;
            inicio.ant=newnodo;
            inicio=newnodo;
        }
    }
    void mostrarInicioFin(){
        nododobles temp=inicio;
        System.out.println("");
        while(temp!=null){
            System.out.println(temp.dato.mostrarData());
            temp=temp.sgte;
        }
    }
    void eliminarCola(){
        if(inicio==null){
            System.out.println("Lista Vacia!!");
        }else{
            if(inicio.sgte==null){
                inicio=fin=null;
                System.out.println("Se eliminio el ultimo nodo!!");
            }else{
                inicio=inicio.sgte;
                inicio.ant=null;
                System.out.println("Se elimino el primer nodo!!");
            }
        }
    }
    void eliminarPila(){
        if(fin==null){
            System.out.println("Lista Vacia!!");
        }else{
            if(fin.ant==null){
                inicio=fin=null;
                System.out.println("Se eliminio el ultimo nodo!!");
            }else{
                fin=fin.ant;
                fin.sgte=null;
                System.out.println("Se elimino un nodo de la lista!!");
            }
        }
    }
}

public class eje04 {
    public static void main(String[] args) {
        operacio op=new operacio();
        Random rd=new Random();
        op.agregarPila("Fresa", rd.nextFloat());
        op.agregarPila("Mango", rd.nextFloat());
//        op.agregarPila("Sandia", rd.nextFloat());
//        op.agregarPila("Melocoton", rd.nextFloat());
//        op.agregarPila("Naranja", rd.nextFloat());
//        op.agregarCola("Manzana", rd.nextFloat());
//        op.agregarCola("Limon", rd.nextFloat());
//        op.agregarCola("Uva", rd.nextFloat());
        op.mostrarInicioFin();
        //op.eliminarCola();
        op.eliminarPila();
        op.eliminarPila();
        op.eliminarPila();
        op.eliminarPila();
        op.mostrarInicioFin();
    }
}
