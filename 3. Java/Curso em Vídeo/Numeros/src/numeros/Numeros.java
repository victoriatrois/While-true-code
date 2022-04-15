/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author v3gc
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, soma = 0;
        String resposta;
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.println("Digite um número:");
            numero = scan.nextInt();
            soma += numero;
            System.out.println("Quer continuar? [S/N]");
            resposta = scan.next();
        }while(resposta.equals("S"));
        System.out.println("A soma de todos os números é " + soma);
    }
    
}
