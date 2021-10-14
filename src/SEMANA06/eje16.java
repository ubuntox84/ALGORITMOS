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
class miclase<X>{
    X a;
    X b;

    public miclase(X a, X b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "miclase{" + "a=" + a + ", b=" + b + '}';
    }
    
}
public class eje16 {
    public static void main(String[] args) {
        miclase<Integer> a1=new miclase<>(10,5);
        miclase<String> a2=new miclase<>("10","5");
        miclase<Character> a3=new miclase<>('r','q');
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        
    }
}
