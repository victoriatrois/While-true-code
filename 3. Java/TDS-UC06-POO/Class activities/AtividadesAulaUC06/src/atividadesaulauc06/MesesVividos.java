/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesaulauc06;

import java.util.Scanner;

/**
 * Calcule o número de meses que uma pessoa viveu
 * @author v3gc
 */

public class MesesVividos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Quantos anos você tem? ");
        int idade = entrada.nextInt();
        
        if (idade < 0) {
            System.out.println("Digite um número positivo.");
            
        } else {
            System.out.print("Quantos meses se passaram desde o seu último aniversário? ");
            int mesesExtra = entrada.nextInt();
            
            if ((mesesExtra < 0) && (mesesExtra > 12)) {
                System.out.println("Digite um número de zero (0) a doze (12).");
                
            } else {
                int mesesVividos = (idade * 12) + mesesExtra;

                System.out.println("Até hoje, você viveu " + mesesVividos + " meses.");
                
            }
        }
    }
}
