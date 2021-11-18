/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author chris
 */
class persona{
    int id;
    String name;
    float nota;

    public persona(int id, String name, float nota) {
        this.id = id;
        this.name = name;
        this.nota = nota;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "persona{" + "id=" + id + ", name=" + name + ", nota=" + nota + '}';
    }
    
}

class comparatorNombre implements Comparator<persona>{

    @Override
    public int compare(persona p1, persona p2) {
//        persona p1=(persona)o1;
//        persona p2=(persona)o2;
        return p1.getName().compareTo(p2.getName());
    }
    
}
public class eje03 {
    public static void main(String[] args) {
        List<persona> lista=new ArrayList<>();
        lista.add(new persona(8,"E",14));
        lista.add(new persona(1,"B",16));
        lista.add(new persona(3,"D",8));
        lista.add(new persona(4,"X",11));
        lista.add(new persona(6,"A",10));
        Collections.sort(lista, new comparatorNombre());
        lista.forEach(cad -> System.out.println(cad.toString()));
    }
}
