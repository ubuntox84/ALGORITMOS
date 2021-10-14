/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03;

/**
 *
 * @author chris
 */
class perro{
  String name;
  int odl;
  //constructor
  public perro(String n, int o){
      name=n;
      odl=o;
    }
  void mostrar(){
    System.out.println("Nombre: "+name+" Edad: "+odl);
    }
}

public class eje8 {    
    static void modificarNombre(perro x){
      x.name="Oso";
    }
    public static void main(String[] args) {
        perro p1=new perro("Luna",7);
        System.out.println("Datos originales: ");        
        p1.mostrar();
        modificarNombre(p1);
        System.out.println("Datos modificados: ");   
        p1.mostrar();
        
    }
}
