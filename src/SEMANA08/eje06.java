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
interface datoImpresionFact{
    String cabeceraFact();
    String cuerpoFact();
    String piepaginaFact();    
}
interface datoImpresionBOl{
    String cabeceraBol();
    String cuerpoBol();
    String piepaginaBol();
}
class boleta implements datoImpresionBOl{
    public String cabeceraBol(){
        return "";
    }
    public String cuerpoBol(){
        return "";
    }
    public String piepaginaBol(){
        return "";
    }
}
class factura implements datoImpresionFact{
    public String cabeceraFact(){
        return "";
    }
    public String cuerpoFact(){
        return "";        
    }
    public String piepaginaFact(){
        return "";
    }    
}
class documentos implements datoImpresionFact,datoImpresionBOl{
    public String cabeceraFact(){
        return "";
    }
    public String cuerpoFact(){
        return "";        
    }
    public String piepaginaFact(){
        return "";
    }   
    public String cabeceraBol(){
        return "";
    }
    public String cuerpoBol(){
        return "";
    }
    public String piepaginaBol(){
        return "";
    }
}
public class eje06 {
    public static void main(String[] args) {
        
    }
}
