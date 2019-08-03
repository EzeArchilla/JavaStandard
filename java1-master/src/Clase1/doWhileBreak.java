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
public class doWhileBreak {
    
    public static void main(String[] args) {
        int edad = 30;
        do{
            System.out.println("edad (doWhileBreak) :"+ edad );
            edad = edad + 1;
            if(edad == 40){
                break;
            }
        }while(edad < 80);
    }
}
