
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class Ejerc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = leer.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
    }
    
}
