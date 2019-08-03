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
public class TipoDeDatos {

    public static void main(String[] args) {

        boolean flag = true;
        char character = 65;
        char character2 = 'A';
        byte opcion = 10;
        int numero = 01234567;
        long longValue = 922337200;
        /**
         * Nota: de quitar la conversion a float entonces reconoceria el valor
         * como un double
         */
        float floatValue = 12.12345f;
        double doubleValue = 0.0;

        System.out.println("flag :" + flag);
        System.out.println("character :" + character);
        System.out.println("character2 :" + character2);
        System.out.println("opcion :" + opcion);
        System.out.println("numero :" + numero);
        System.out.println("longValue :" + longValue);
        System.out.println("floatValue :" + floatValue);
        System.out.println("doubleValue :" + doubleValue);
    }

}
