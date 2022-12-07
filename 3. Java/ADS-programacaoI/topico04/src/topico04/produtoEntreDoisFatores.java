/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package topico04;

import java.util.Scanner;

/**
 *
 * @author v3gc
 */
import java.util.Scanner;

public class produtoEntreDoisFatores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int primeiroFator = entrada.nextInt();
        
        int segundoFator = entrada.nextInt();
        
        int produto = primeiroFator*segundoFator;
        System.out.println(produto);
    }
}
