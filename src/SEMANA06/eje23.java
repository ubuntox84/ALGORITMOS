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
interface conectar{
    float PI=3.1416f;
    abstract void abrir();
    void cerrar();
    default void status(){
        
    }
}
interface consultas{
    void select();
    void update();
    default void delete(){
        
    }
}
interface mysql extends conectar,consultas{
    
}
interface oracle{
    
}
class basedatos implements mysql{
    public void abrir(){
        
    }
    public void cerrar(){
        
    }
    public void select(){
        
    }
    public void update(){
        
    }
}
public class eje23 {
    
}
