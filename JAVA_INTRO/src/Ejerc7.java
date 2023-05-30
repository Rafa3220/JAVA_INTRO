
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
public class Ejerc7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String frase;
        String pass = "eureka";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la contraseña");
        frase = leer.nextLine();
        if (frase.equals(pass)) {
            System.out.println("Usted ingresó al sistema");
        } else {
            System.out.println("Contraseña incorrecta");
        }
    }
}