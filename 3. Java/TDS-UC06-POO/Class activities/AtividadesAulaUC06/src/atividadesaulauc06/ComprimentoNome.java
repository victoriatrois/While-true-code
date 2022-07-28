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
public class ComprimentoNome {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite seu nome completo: ");
        String nome = entrada.nextLine();
        
        if (! nome.contains(" ")) {
            System.out.println("Entrada inválida. Entre um nome com no mínimo um sobrenome.");
            
        } else {
            String nomeSemEspacos = nome.replaceAll("\\s", "");
        
        int tamanhoNome = nomeSemEspacos.length();
        
        int fimNome = nome.indexOf(" ");
        
        String primeiroNome = nome.substring(0, fimNome);
        
        System.out.println("Seu nome tem " + tamanhoNome + " letras e seu primeiro nome é " + primeiroNome + ".");
        
        }
        
        
    }
}
