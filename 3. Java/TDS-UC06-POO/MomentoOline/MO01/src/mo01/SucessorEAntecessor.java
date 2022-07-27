/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mo01;

import java.util.Scanner;

/**
 *
 * @author v3gc
 */
public class SucessorEAntecessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //construir um algoritmo que calcule o sucessor e o antecessor do número digitado.
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        
        System.out.println("O antecessor de " + numero + " é " + antecessor + " e o seu sucessor é " + sucessor +".");
       
    }
    
}
