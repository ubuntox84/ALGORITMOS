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
class animal{
    String viven;
    boolean pelo;
    int pata;
    public animal(String v, boolean  pe, int pa){
        this.viven=v;
        this.pelo=pe;
        this.pata=pa;
    }
}
class dog extends animal{
    String name;
    public dog(String v, boolean  pe, int pa, String n){
        super(v,pe,pa);
        this.name=n;
    }
}
class conejo extends animal{
    String name;
    public conejo(String v, boolean  pe, int pa, String n){
        super(v,pe,pa);
        this.name=n;
    }
}
public class eje10 {
    public static void main(String[] args) {
        dog d1=new dog("Tierra",true,4,"Fido");
        conejo c1=new conejo("Tiene", true, 4, "Box");
    }
}
