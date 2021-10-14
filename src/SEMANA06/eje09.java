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
class person{
    String nombre;
    String apellido;
    public person(String n, String a){
        this.nombre=n;
        this.apellido=a;
    }
    public person(String n){
        this.nombre=n;
        this.apellido="";
    }
    String nombreCompleto(){
        return "Nombre: "+this.nombre+" Apellidos: "+this.apellido;
    }
}
class student extends person{
    String codigo;
    String facultad;
    public student(String n, String a, String c, String f){
        super(n,a);
        this.codigo=c;
        this.facultad=f;
    }
    String DatosEstudio(){
        return "Codigo: "+this.codigo+" Facultad: "+this.facultad;
    }
    
    String Datoscompletos(){
        return "Datos: "+nombreCompleto()+" Estudios: "+DatosEstudio();
    }
}
public class eje09 {
    public static void main(String[] args) {
        student s1=new student("Juan", "Garcia", "20030471", "Medicina");
        System.out.println(s1.Datoscompletos());
    }
}
