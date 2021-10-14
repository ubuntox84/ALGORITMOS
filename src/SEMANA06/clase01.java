/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA06;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class clase01 {
    private int numero;
    private String nombre;
    void definirdatos(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Numero: ");
        this.numero=sc.nextInt();
        System.out.println("Nombre: ");
        this.nombre=sc.next();
    }
    void mostrardatos(){
        System.out.println("Numero: "+this.numero);
        System.out.println("Nombre: "+this.nombre);
    }
}
