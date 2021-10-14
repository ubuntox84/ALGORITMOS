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
class variables{
    //variables estaticas o variable de clase
    static int x;
    //variable de instancia
    int y;
    int z;

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        variables.x = x;
    }
    
}
public class eje05 {
    public static void main(String[] args) {
        variables.x=10;
        variables v1=new variables();
        variables v2=new variables();        
        System.out.println(v1.x);
    }
}
