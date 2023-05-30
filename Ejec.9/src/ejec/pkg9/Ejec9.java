/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejec.pkg9;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Ejec9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        int longitud = frase.length();
        if (longitud == 8) {
            System.out.println("La frase es de 8 caracteres");
        } else {
            System.out.println("Error: Por favor ingrese una frase de 8 letras");
        
                
                
    }
    
}
