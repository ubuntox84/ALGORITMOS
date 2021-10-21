/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA11;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author chris
 */
class Arco {

    private Nodo origen;
    private Nodo destino;

    public Arco() {
    }

    public Nodo getOrigen() {
        return origen;
    }

    public void setOrigen(Nodo origen) {
        this.origen = origen;
    }

    public Nodo getDestino() {
        return destino;
    }

    public void setDestino(Nodo destino) {
        this.destino = destino;
    }
}

class Nodo {

    private String nombre;
    private List<Arco> arcos = new ArrayList<>();

    public Nodo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarArco(Arco arco) {
        arcos.add(arco);
    }

    public List<Arco> getArcos() {
        return arcos;
    }

    public List<Nodo> getNodosAdyacentes() {
        List<Nodo> nodos = new ArrayList<>();

        // por cada arco donde el nodo es origen
        for (Arco arco : arcos) {
            // si el arco no es reflexivo
            if (arco.getDestino() != this) // agrega el nodo destino a la lista 
            // de nodos adyacentes
            {
                nodos.add(arco.getDestino());
            }
        }

        // retorna la lista de nodos adyacentes
        return nodos;
    }
}

class Grafo {

    List<Nodo> nodos = new ArrayList<>();
    List<Arco> arcos = new ArrayList<>();

    public Grafo() {
    }

    public void addNodo(String nombre) {
        Nodo nodo = new Nodo();
        nodo.setNombre(nombre);
        nodos.add(nodo);
    }

    public void addArco(String origen, String destino) throws Exception {

        Nodo nodoOrigen = buscarNodo(origen);
        Nodo nodoDestino = buscarNodo(destino);

        // Origen o destino no encontrado
        if (nodoOrigen == null) {
            throw new RuntimeException("Error en la Búsqueda: NodoOrigen no encontrado");
        }
        if (nodoDestino == null) {
            throw new RuntimeException("Error en la Búsqueda: NodoOrigen no encontrado");
        }

        addArco(nodoOrigen, nodoDestino);
    }

    public void addArco(Nodo nodoOrigen, Nodo nodoDestino) {
        Arco arco = new Arco();
        arco.setOrigen(nodoOrigen);
        arco.setDestino(nodoDestino);
        arcos.add(arco);
        nodoOrigen.agregarArco(arco);

        arco = new Arco();
        arco.setOrigen(nodoDestino);
        arco.setDestino(nodoOrigen);
        arcos.add(arco);
        nodoDestino.agregarArco(arco);
    }

    public Nodo buscarNodo(String nombre) {
        for (Nodo nodo : nodos) {
            if (nodo.getNombre().equals(nombre)) {
                return nodo;
            }
        }
        return null;
    }

    public boolean existeRuta(String origen, String destino) throws Exception {
        if (buscarRuta(origen, destino) != null) {
            return true;
        }
        return false;
    }

    public List<Nodo> buscarRuta(String origen, String destino) throws Exception {

        Nodo nodoOrigen = buscarNodo(origen);
        Nodo nodoDestino = buscarNodo(destino);
        List<Nodo> nodosRuta = new ArrayList<>();

        // Origen o destino no encontrado
        if (nodoOrigen == null) {
            throw new RuntimeException("Error en la Búsqueda: NodoOrigen no encontrado");
        }
        if (nodoDestino == null) {
            throw new RuntimeException("Error en la Búsqueda: NodoOrigen no encontrado");
        }

        if (buscarRutaDFS(nodosRuta, nodoOrigen, nodoDestino)) {
            return nodosRuta;
        } else {
            return null;
        }
    }

    private boolean buscarRutaDFS(List<Nodo> nodosRuta, Nodo nodoOrigen, Nodo nodoDestino) {

        // agrega el origen
        nodosRuta.add(nodoOrigen);

        // origen y destino son el mismo ?
        if (nodoOrigen.getNombre().equals(nodoDestino.getNombre())) {
            return true;
        }

        // si no son el mismo, revise las rutas usando una pila
        Stack<Nodo> pilaDeNodos = new Stack<>();
        ArrayList<Nodo> nodosVisitados = new ArrayList<>();

        pilaDeNodos.add(nodoOrigen);

        while (!pilaDeNodos.isEmpty()) {
            Nodo actual = pilaDeNodos.pop();

            // ignore los nodos ya visitados
            if (nodosVisitados.contains(actual)) {
                continue;
            }

            // es el nodo que estamos buscando ?
            if (actual.equals(nodoDestino)) {
                nodosRuta.addAll(pilaDeNodos);
                nodosRuta.add(nodoDestino);
                return true;
            } else {
                // siga buscando en las rutas no visitadas
                nodosVisitados.add(actual);
                for (Nodo nodo : actual.getNodosAdyacentes()) {
                    if (!pilaDeNodos.contains(nodo)) {
                        pilaDeNodos.add(nodo);
                    }
                }
            }
        }
        return false;

    }
}

public class eje02 {

    public static void main(String[] args) {
        try {

            Grafo g = new Grafo();

            g.addNodo("A");
            g.addNodo("B");
            g.addNodo("C");

            g.addArco("A", "B");
            g.addArco("B", "C");
            g.addArco("A", "C");

            List<Nodo> camino = g.buscarRuta("A", "C");

            if (camino == null) {
                System.out.println("Camino A -> C no encontrado");
            } else {
                System.out.println("Camino A -> C encontrado");
                for (Nodo nodo : camino) {
                    System.out.println(nodo.getNombre());
                }
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
