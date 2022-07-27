/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadesaulauc06;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author v3gc
 */
public class CalculadoraIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar calendario = GregorianCalendar.getInstance();
        Scanner entrada = new Scanner(System.in);
        
        int anoAtual = calendario.get(Calendar.YEAR);
        int mesAtual = calendario.get(Calendar.MONTH);
        
        System.out.print("Digite o seu ano de nascimento: ");
        int anoNascimento = entrada.nextInt();
        
        if (anoNascimento < (0)) {
            System.out.println("Entrada inválida. Digite um ano maior que zero.");
            
        } else {
            System.out.print("Agora o mês: ");
            int mesNascimento = entrada.nextInt();
            
            if (mesNascimento < 0 || mesNascimento >12) {
                System.out.println("Entrada inválida. Digite um número de um (1) a doze (12)");
                
            } else {
                
                int idade = anoAtual - anoNascimento;

                if (mesAtual < mesNascimento) {
                    idade -= 1;
                    System.out.println("Você tem " + idade + " anos e completará " + (idade +1) + " até o final de " + anoAtual + ".");
                    
                } else {
                    System.out.println("Você tem " + idade + " anos.");
                    
                }
            }   
        }
    }
}
