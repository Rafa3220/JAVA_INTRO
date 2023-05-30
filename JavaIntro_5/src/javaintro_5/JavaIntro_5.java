/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro_5;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class JavaIntro_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner leer = new Scanner (System.in);
        int numero;
        System.out.println("Ingrese un numero");
        numero = leer.nextInt();
        double raiz = Math.sqrt(numero);
        System.out.println("El doble del numero es "+numero*2);
        System.out.println("El triple del numero es "+numero*3);
        System.out.println("La raiz cuadra del numero es "+raiz);
    }
    
}
