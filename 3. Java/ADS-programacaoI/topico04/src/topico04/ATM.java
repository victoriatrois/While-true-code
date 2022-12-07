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

public class ATM {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int intencaoDeSaque = entrada.nextInt();
        
        int quantidadeDeNotasDeCem = intencaoDeSaque / 100;
        intencaoDeSaque -= quantidadeDeNotasDeCem * 100;
        
        int quantidadeDeNotasDeVinte = intencaoDeSaque / 20;
        intencaoDeSaque -= quantidadeDeNotasDeVinte * 20;
        
        int quantidadeDeNotasDeCinco = intencaoDeSaque / 5;
        intencaoDeSaque -= quantidadeDeNotasDeCinco * 5;
        
        int quantidadeDeNotasDeUm = intencaoDeSaque / 1;
        intencaoDeSaque -= quantidadeDeNotasDeUm * 1;
        
        System.out.println(quantidadeDeNotasDeCem + " de 100.");
        System.out.println(quantidadeDeNotasDeVinte + " de 20.");
        System.out.println(quantidadeDeNotasDeCinco + " de 5.");
        System.out.println(quantidadeDeNotasDeUm + " de 1.");
    }
}
