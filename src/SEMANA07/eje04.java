/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA07;

/**
 *
 * @author chris
 */

public class eje04 {
    public enum semana{
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
    }
    public static void main(String[] args) {
        semana dia=semana.LUNES;
        System.out.println(dia.ordinal());
    }
}
