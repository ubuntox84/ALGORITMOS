/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA08;

/**
 *
 * @author chris
 */
class arbol{
    String name;
    int tamaño;
}
class coches{
    String marcaa;
    String color;
}
class ciudad{
    arbol ar;
    coches co;
    public ciudad(arbol a, coches c){
        this.ar=a;
        this.co=c;
    }
}
public class eje01 {
    public static void main(String[] args) {
        ciudad ci=new ciudad(new arbol(),new coches());
    }
}
