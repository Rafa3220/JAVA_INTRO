/*5
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc.pkg1;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Ejerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números: ");
        int numero = leer.nextInt();
        int numero_2 = leer.nextInt();
        int resultado = numero + numero_2;
        System.out.println("La suma de los números es: " + resultado);
    }
    
}
