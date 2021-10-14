/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA07;

import java.util.Scanner;

/**
 *
 * @author chris
 */
class estudiante{    
    String nombre;
    String codigo;
    public estudiante(String n, String c){
        this.nombre=n;
        this.codigo=c;
    }    
}
class evaluaciones{
    Scanner teclado=new Scanner(System.in);
    float nota1;
    float nota2;
    float nota3;
    float nota4;
    float promedio;
    public evaluaciones(float n1,float n2,float n3){
        this.nota1=n1;
        this.nota2=n2;
        this.nota3=n3;
    }
    public evaluaciones(float n1,float n2,float n3, float n4){
        this.nota1=n1;
        this.nota2=n2;
        this.nota3=n3;
        this.nota4=n4;
    }
    void ingresarnotas(){        
        System.out.println("Ingresar 3 notas");
        nota1=teclado.nextFloat();
        nota2=teclado.nextFloat();
        nota3=teclado.nextFloat();        
    }
    void ingresar4notas(){        
        System.out.println("Ingresar 3 notas");
        nota1=teclado.nextFloat();
        nota2=teclado.nextFloat();
        nota3=teclado.nextFloat();        
        nota4=teclado.nextFloat();        
    }
    float promedio(){
        return (nota1+nota2+nota3)/3;
    }
    float promedio4notas(){
        return (nota1+nota2+nota3+nota4)/4;
    }
}
class calificaciones{
    estudiante es1;
    evaluaciones e1;
    public calificaciones(estudiante es, evaluaciones e){
        this.es1=es;
        this.e1=e;
    }
}
public class eje06 {
    public static void main(String[] args) {
        calificaciones c1=new calificaciones(new estudiante("Juan","0020030471"),new evaluaciones(15,11,10));
    }
}
