/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc6;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Ejerc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        n1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = leer.nextInt();
        if(n1 > n2 ){
            System.out.println(n1 + " Es mayor que " + n2);
        }
        else if(n2 > n1){
            System.out.println(n2 + " Es mayor que " + n1);
        }
        else{
            System.out.println("Los números son iguales");
    }
    
}
