/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc.pkg4;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Ejerc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double gradosF, gradosC;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de grados centigrados");
        gradosC = leer.nextDouble();
        gradosF = 32 + (9*gradosC/5);
        System.out.println("La conversion de grados centigrados a Farenheit es: "+gradosF);
    }
    
}
