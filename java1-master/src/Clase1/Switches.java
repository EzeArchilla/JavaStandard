/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase1;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Switches {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad :");
        int edad = scanner.nextInt();
        switch (edad) {
            case 10:
                System.out.println("Hola niño");
                break;
            case 20:
                System.out.println("Hola joven");
                break;
            case 30:
            case 40:
                System.out.println("Hola Sr");
                break;
            case 60:
                System.out.println("Hola Abuelo");
                break;
            default:
                System.out.println("Edad Desconocida");
                break;
        }

    }

}
