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
class Puntos{
    private int a=10;
    private int b=11;
    private int c=13;
    private int d=14;
    //get a set

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

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
    int sumatoria(){
        int sum;
        sum=this.a+this.b+this.c+this.d;
        return sum;
    }
    
}
public class eje02 {
    public static void main(String[] args) {
        Puntos p1=new Puntos();
        System.out.println(p1.getA());
        p1.setA(150);
        p1.setB(150);
        p1.setC(150);
        p1.setD(150);
        System.out.println("La suma es: "+p1.sumatoria());
    }
}
