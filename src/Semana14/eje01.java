/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana14;

import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class eje01 {
    static int pos=-1;
    public static void main(String[] args) {
        int vect[]={5,8,7,9,7};
        int op=0;        
        do{
            int e=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));        
            JOptionPane.showMessageDialog(null, buscar(vect,e)?"Elemento Encontrado en la posicion "+pos:"Elemento no Encontrado");
            
            op=JOptionPane.showOptionDialog(null, "Desea salir?", "Pregunta", JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, new Object[]{"SI","NO"}, 0);            
        }while(op==0);
        
    }

    private static boolean buscar(int[] vect, int e) {
        int con=1;
        for(Integer x:vect){
            if(x.equals(e)){
                pos=con;                
                return true;
            }
            con++;            
        }
        return false;
    }

 
}
