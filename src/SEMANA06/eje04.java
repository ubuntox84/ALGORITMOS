/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA06;

/**
 *
 * @author chris
 */
class perro{
    String nombre;
    int edad;
    String raza;
    public perro(){
        this.nombre="";
        this.edad=0;
        this.raza="";
    }
    public perro(String n){
        this.nombre=n;
        this.edad=0;
    }
    public perro(String n, int e){
        this.nombre=n;
        this.edad=e;
    }
    public perro(String n, int e, String r){
        this.nombre=n;
        this.edad=e;
        this.raza=r;
    }
    String mostrardato(){
        return "Nombre: "+this.nombre+" Edad: "+this.edad;
    }
}
public class eje04 {
    public static void main(String[] args) {
        perro p1=new perro();
        perro p2=new perro("fido");
        perro p3=new perro("luna",8);
        perro p4=new perro("lima",16,"Boxer");
    }
}
