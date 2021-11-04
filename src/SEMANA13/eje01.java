/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA13;

/**
 *
 * @author chris
 */
class nodo{
    int dato;
    nodo izq, der;
    public nodo(int x){
        this.dato=x;
        izq=der=null;
    }
    void mostrar(){
        System.out.print(dato+"  ");
    }
}
class arbol{
    nodo raiz;
    public arbol(){
        
    }
    void insertar(int x){
        if(raiz==null){
            raiz=new nodo(x);
        }else{
            insertar(raiz,x);
        }
    }
    void preorden(){
        this.preorden(raiz);
    }

    private void insertar(nodo padre, int x) {
        if(x>padre.dato){
            if(padre.der==null){
               padre.der=new nodo(x); 
            }else{
                insertar(padre.der,x);
            }
        }else if(x<padre.dato){
            if(padre.izq==null){
                padre.izq=new nodo(x);
            }else{
                insertar(padre.izq, x);
            }
        }
    }

    private void preorden(nodo padre) {
        if(padre!=null){
            padre.mostrar();
            preorden(padre.izq);
            preorden(padre.der);
        }
    }
}
public class eje01 {
    public static void main(String[] args) {
        int vect[]={14,15,4,9,7,18,3,5,16,4,20,17,9,14,5};
        arbol ar=new arbol();
        for(Integer x: vect){
            ar.insertar(x);
        }
        ar.preorden();
    }
}
