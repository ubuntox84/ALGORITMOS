/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA08;

/**
 *
 * @author chris
 */
interface  conectar{
    void abrir();
    void cerrar();
    void estado();
}
class a implements conectar{
    public void abrir(){
        
    }
    public void cerrar(){
        
    }
    public void estado(){
        
    }
} 
class b extends a implements conectar{
    public void abrir(){
        
    }
    public void cerrar(){
        
    }    
}
public class eje04 {
    public static void main(String[] args) {
        conectar c=new a();
        conectar r=new b();
        
    }
}
