/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA07;

/**
 *
 * @author chris
 */
enum equipos {
    U("UNIVERSITARIO", 5), SP("SPORTING CRISTAL", 3), A("ALIANZA LIMA", 7);
    String nombre;
    int puesto;

    private equipos(String n, int p) {
        nombre = n;
        puesto = p;
    }

    String getnombre() {
        return nombre;
    }

    int getpuesto() {
        return puesto;
    }
}

public class eje05 {
    public static void main(String[] args) {
        equipos p=equipos.SP;
        System.out.println(p.getnombre());
        System.out.println(p.getpuesto());
    }
}
