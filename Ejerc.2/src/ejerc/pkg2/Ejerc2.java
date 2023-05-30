/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc.pkg2;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Ejerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in); 
        String nombre;
        System.out.print("Ingrese su nombre ");
        nombre = leer.next();
        System.out.print("Su nombre es "+nombre);
    }
    
}
