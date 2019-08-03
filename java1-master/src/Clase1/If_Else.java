/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase1;

/**
 *
 * @author Fernando
 */
public class If_Else {

    public static void main(String[] args) {

        /**
         * Condicionales : >, <, >=, <=, !=
         *
         */
        int edad = 41;
        if (edad > 40) {
            System.out.println("Hola Sr");
        } else {
            System.out.println("Hola niño");
        }

        edad = 20;
        if (edad > 40) {
            System.out.println("Hola Sr");
        } else if (edad >= 20) {
            System.out.println("Hola Joven");
        } else {
            System.out.println("Hola niño");
        }

    }

}
