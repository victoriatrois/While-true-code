/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topico04;

/**
 *
 * @author v3gc
 */

import java.util.Scanner;

public class SomaEntreDoisValores {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int primeiraParcela = entrada.nextInt();
        
        int segundaParcela = entrada.nextInt();
        
        int soma = primeiraParcela + segundaParcela;
        
        System.out.println(soma);
    }
}
