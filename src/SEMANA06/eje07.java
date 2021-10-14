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
class sumatoria{
    int suma(){
       return 0; 
    }
    int suma(int x){
        return x;
    }
    int suma(int x, int y){
        return x+y;
    }
    int suma(int x, int y, int z){
        return x+y+z;
    }
    int suma(int x, int y, int z, int r){
        return x+y+z+r;
    }
}
public class eje07 {
    public static void main(String[] args) {
        sumatoria sum=new sumatoria();
        System.out.println(sum.suma(10, 5, 20));
    }
}
