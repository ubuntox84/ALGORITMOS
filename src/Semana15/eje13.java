/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana15;

import java.util.function.Predicate;

/**
 *
 * @author chris
 */

class compare{
    int x,y;

    public compare(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
public class eje13 {
    public static void main(String[] args) {
        Predicate<compare> t=new Predicate<compare>() {
            @Override
            public boolean test(compare t) {
                return t.getX()==t.getY();
            }
        };
        System.out.println(t.test(new compare(15, 15)));
        System.out.println(t.test(new compare(15, 10)));
        System.out.println(t.test(new compare(1, 15)));
    }
}
