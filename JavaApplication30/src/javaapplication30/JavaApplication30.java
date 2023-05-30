/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,operacion,resultado;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("MENU\n" +
"1. Sumar\n" +
"2. Restar\n" +
"3. Multiplicar\n" +
"4. Dividir\n" +
"5. Salir\n" +
"Elija opción:");
        operacion=leer.nextInt();
      
        if (operacion >= 1 && operacion <= 5){
            switch (operacion){
                case 1 : 
                    resultado=num1+num2;
                    System.out.println("El resultado es " + resultado);
                break;
                
                case 2:
                    resultado=num1-num2;
                    System.out.println("El resultado es " + resultado);
                    break;
                    
                    case 3 : 
                    resultado=num1*num2;
                    System.out.println("El resultado es " + resultado);
                break;
                case 4 : 
                    resultado=num1/num2;
                    System.out.println("El resultado es 5" + resultado);
                break;
                case 5 : 
                    System.out.println("Finalizado");
                
                break;
                    
                      
            }
        }
        
    }
    
}
