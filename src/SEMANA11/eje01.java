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
class vertice{
    String nombre;
    int numVertice;
    public vertice(String n){
        this.nombre=n;
        this.numVertice=-1;
    }
    String nomVertice(){
        return this.nombre;
    }
    boolean equals(vertice n){
        return this.nombre.equalsIgnoreCase(n.nomVertice());
    }
    void asigVertice(int n){
        this.numVertice=n;
    }
    String Tosetring(){
        return this.nombre+"("+this.numVertice+")";
    }
}
class gmatriz{
    int numVertice;
    int matriz[][];
    vertice [] vector;
    public gmatriz(int x){
        matriz=new int [x][x];
        vector=new vertice[x];
        this.numVertice=0;
    }
    void mostrarMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    int numVertice(String x){
        vertice v = new vertice(x);
        boolean encontrado = false;
        int i = 0;
        for (; (i < numVertice) && !encontrado;) {
            encontrado = vector[i].equals(v);
            if (!encontrado) i++;
        }
        return (i < numVertice) ? i : -1 ;
    }
    void nuevoVertice(String nombre){
        boolean existe=(numVertice(nombre)>=0);
        if(!existe){
            vertice v=new vertice(nombre);
            v.asigVertice(numVertice);
            vector[numVertice]=v;
            numVertice++;
        }
    }
    void nuevoArco(String a, String b)throws Exception{
        int ia,ib;
        ia=numVertice(a);
        ib=numVertice(b);
        if(ia<0||ib<0)throw new Exception("Vertice no existe!!");{
            matriz[ia][ib]=1;
            //matriz[ib][ia]=1;
        }
    }
    boolean adyacente(String a, String b)throws Exception{
        int ia,ib;
        ia=numVertice(a);
        ib=numVertice(b);
        if(ia<0||ib<0)throw new Exception("Vertice no existe!!");
        return matriz[ia][ib]==1;
    }
        
}
public class eje01 {
    public static void main(String[] args) throws Exception{
       
        gmatriz mat=new gmatriz(5);
        mat.nuevoVertice("D");
        mat.nuevoVertice("R");
        mat.nuevoVertice("K");
        mat.nuevoVertice("F");
        mat.nuevoVertice("L");
        mat.nuevoArco("D","K");
        mat.nuevoArco("D", "F");
        mat.nuevoArco("R", "D");
        mat.nuevoArco("K", "F");
        mat.nuevoArco("F", "K");
        mat.nuevoArco("F", "D");
        mat.nuevoArco("L", "F");
        mat.nuevoArco("L", "K");
        mat.mostrarMatriz();
    }
}
