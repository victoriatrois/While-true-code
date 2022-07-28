/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesaulauc06;

import java.util.Scanner;

/**
 *
 * @author v3gc
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        float num1 = entrada.nextFloat();
        System.out.print("Digite um segundo número: ");
        float num2 = entrada.nextFloat();
        
        System.out.println("A soma de " + num1 + " e " + num2 + " é " + (num1 + num2) + ".\n");
        System.out.println("A subtração de " + num1 + " e " + num2 + " é " + (num1 - num2) + ".\n");
        System.out.println("A multiplicação de " + num1 + " e " + num2 + " é " + (num1 * num2) + ".\n");
        
        if (num2 == 0) {
            System.out.println("A divisão de " + num1 + " e " + num2 + " não resulta em um número.\n");
        } else {
            System.out.println("A divisão" + " de " + num1 + " e " + num2 + " é " + (num1 / num2) + ".\n");
        }
        
        
    }
}
