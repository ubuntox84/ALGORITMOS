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
class nod {

    int dato;
    nod sgte;
    nod ant;

    public nod(int x) {
        this.dato = x;
        sgte = ant = null;
    }
}

class ope {

    nod inicio;
    nod fin;

    public ope() {
        inicio = fin = null;
    }

    void ingresar(int p) {
        nod newnodo = new nod(p);
        if (inicio == null) {
            inicio = fin = newnodo;
            fin.sgte = inicio;
            inicio.ant = fin;
        } else {
            fin.sgte = newnodo;
            newnodo.ant = fin;
            fin = newnodo;
            fin.sgte = inicio;
            inicio.ant = fin;
        }
    }

    void mostrarInicioFIn() {
        nod temp = inicio;
        while (true) {
            if (temp == null) {
                System.out.println("Lista Vacia!!!");
                break;
            } else {
                if (temp == fin) {
                    System.out.print(temp.dato+"\t");
                    break;
                } else {
                    System.out.print(temp.dato+"\t");
                    temp = temp.sgte;
                }
            }

        }
    }
}

public class eje05 {

    public static void main(String[] args) {
        ope op = new ope();
        op.ingresar(7);
        op.ingresar(5);
        op.ingresar(2);
        op.ingresar(4);
        op.ingresar(8);
        op.ingresar(3);
        op.mostrarInicioFIn();
    }
}
