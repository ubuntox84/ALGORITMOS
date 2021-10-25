/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA12;

/**
 *
 * @author chris
 *
 */
class perro {

    String name;

    public perro(String n) {
        this.name = n;
    }

    String mostrarPerro() {
        return this.name;
    }
}

class nodo {

    perro dato;
    nodo sgte;

    public nodo(String n) {
        this.dato = new perro(n);
        this.sgte = null;
    }
}

class operacion {

    nodo inicio;
    nodo fin;

    public operacion() {
        this.inicio = null;
        this.fin = null;
    }

    void ingresarUltimo(String n) {
        nodo newnodo = new nodo(n);
        //System.out.println(newnodo.dato.mostrarPerro());
        if (inicio == null) {
            inicio = fin = newnodo;
        } else {
            fin.sgte = newnodo;
            fin = newnodo;
        }
    }

    void ingresarInicio(String n) {
        nodo newnodo = new nodo(n);
        if (inicio == null) {
            inicio = fin = null;
        } else {
            newnodo.sgte = inicio;
            inicio = newnodo;
        }
    }

    void mostrar() {
        nodo temp = inicio;
        //System.out.println(inicio==null?"null":inicio.dato.mostrarPerro());
        while (temp != null) {
            System.out.print(temp.dato.mostrarPerro() + "-->");
            temp = temp.sgte;
        }
    }

    nodo buscarNodo(String n) {
        nodo temp = inicio;
        nodo nodosearch = null;
        while (temp != null) {
            if (temp.dato.mostrarPerro().equalsIgnoreCase(n)) {
                nodosearch = temp;
                break;
            }
            temp = temp.sgte;
        }
        return nodosearch;
    }

    void eliminar(String n) {
        nodo nodoEliminar;
        if ((nodoEliminar = buscarNodo(n)) != null) {
            nodo temp = inicio;
            if (temp != nodoEliminar) {
                while(true){
                    if(temp.sgte==nodoEliminar){
                        temp.sgte=nodoEliminar.sgte;
                        break;
                    }
                    temp=temp.sgte;
                }
            } else {
                inicio = null;
            }
        } else {
            System.out.println("El NODO NO existe!!");
        }
    }
}

public class eje01 {

    //fido, max, reno, oso, limon
    public static void main(String[] args) {
        operacion op = new operacion();
        op.ingresarUltimo("Fido");
        op.ingresarUltimo("Max");
        op.ingresarUltimo("Reno");
        op.ingresarUltimo("Oso");
        op.ingresarUltimo("Limon");
        op.ingresarInicio("Choco");
        op.ingresarInicio("Tacho");
        String nameSearch = "pepe";
        op.mostrar();
        System.out.println("\nBuscando a " + nameSearch);

        System.out.println(op.buscarNodo(nameSearch) == null ? "NO encuentrado" : "SI encontrado" + op.buscarNodo(nameSearch).dato.mostrarPerro());
        
        op.eliminar(nameSearch);
        op.mostrar();
    }
}
