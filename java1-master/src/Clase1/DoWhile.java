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
public class DoWhile {
    
      public static void main(String[] args) {
        int edad  = 30;
        while(edad < 30){
            System.out.println("edad incluida (WHILE) :" + edad );
        }
        
        do{
            System.out.println("edad incluida (DO-WHILE) :" + edad );
        }while(edad < 30);
    }
    
}
