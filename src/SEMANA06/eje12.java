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
class padre{
    private int a;
    private int b;
    protected int c;
    //metodos

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
}
class hija extends padre{
    
}
public class eje12 {
    public static void main(String[] args) {
        hija h1=new hija();
        h1.c=10;
        padre p1=new padre();
        p1.c=20;
    }
}
