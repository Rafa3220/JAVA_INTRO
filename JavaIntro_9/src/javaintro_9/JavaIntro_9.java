/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro_9;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class JavaIntro_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase");
        frase = leer.next();
        if ("A".equals(frase.toUpperCase().substring(0, 1))) {
            System.out.println("Correcto: La primer letra es una A");
        } else {
            System.out.println("Incorrecto: La primer letra no es una A");
        }
    }
}