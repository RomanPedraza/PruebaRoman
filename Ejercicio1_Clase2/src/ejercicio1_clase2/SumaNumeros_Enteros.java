/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_clase2;

import java.util.Scanner;

/**
 *
 * @author rentas
 */
public class SumaNumeros_Enteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int numero, numero1, total;
       
        System.out.println("Ingrese el primer número:");
        numero = leer.nextInt();
        System.out.println("Ingrese el segundo número:");
        numero1 = leer.nextInt();
        
        total = numero + numero1;
        System.out.println("La suma del priumer número " + numero+ " y el segundo número " + numero1 + " es: " + total);
        
        
    }
    
}
