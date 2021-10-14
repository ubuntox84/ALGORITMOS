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
interface contenido{
    
}
class laser implements contenido{
    void escaner(){
        
    }
}
class tinta implements contenido{
    
}
class impacto implements contenido{
    
}
public class eje05 {
    public static void main(String[] args) {
        imprimir(new laser());
    }
    static void imprimir(contenido op){
        if(op instanceof tinta){}
        if(op instanceof impacto){}
        if(op instanceof laser){
            ((laser) op).escaner();
        }
    }
}
