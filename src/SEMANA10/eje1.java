/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA10;

/**
 *
 * @author chris
 */
class cliente {

    String name;
    clave contra ;

    public cliente(String n) {
        this.name = n;
        contra= new clave();
    }

    void agregarclave() {
        contra.setPass(1234);
    }

    int mostrarclave() {
        return contra.getPass();
    }

    
}

class clave {

        int pass;

        public int getPass() {
            return pass;
        }

        public void setPass(int pass) {
            this.pass = pass;
        }
    }

public class eje1 {

    public static void main(String[] args) {
        cliente c1 = new cliente("Juan");
    }
}
