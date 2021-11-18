/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana15;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author chris
 */
class people{
    private String nombre;
    private String apellido;
    private int edad;

    public people(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "people{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
}
public class eje12 {
    public static void main(String[] args) {
        ArrayList<people> lista=new ArrayList<>();
        lista.add(new people("Juan", "Gomes", 15));
        lista.add(new people("Maria", "Farfan", 10));
        lista.add(new people("Nela", "Garcia", 7));
        lista.add(new people("Juliet", "Dolores", 4));
        //lista.stream().forEach(p->System.out.println(p.toString()));
        lista.stream().forEach(new Consumer<people>() {
            @Override
            public void accept(people t) {
                System.out.println(t.toString());
            }
        });
        
    }
}
