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
class pleope{
    private int id;
    private String name;
    private float nota;

    public pleope(int id, String name, float nota) {
        this.id = id;
        this.name = name;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "persona{" + "id=" + id + ", name=" + name + ", nota=" + nota + '}';
    }  

    public int getId() {
        return id;
    }
    
}
public class eje04 {
    public static void main(String[] args) {
        List<pleope> lista=new ArrayList<>();
        lista.add(new pleope(8,"E",14));
        lista.add(new pleope(1,"B",16));
        lista.add(new pleope(3,"D",8));
        lista.add(new pleope(4,"X",11));
        lista.add(new pleope(6,"A",10));
        Collections.sort(lista, new Comparator<pleope>(){
            @Override
            public int compare(pleope p1, pleope p2) {
                int rpta=0;
                if(p1.getId()>p2.getId()){
                    rpta=1;
                }else if(p1.getId()<p2.getId()){
                    rpta=-1;
                }else{
                    rpta=0;
                }
                return rpta;
            }            
        });
        lista.forEach(cad -> System.out.println(cad.toString()));
    }
}
