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
public class MenorTempo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float menorTempo = Float.MAX_VALUE;
        float tempoVolta = 100000;
        String continuar = "S";
        

        while (continuar.equals("S")) {
            System.out.print("Informe o(s) tempo(s) da(s) voltas dadas: ");
            tempoVolta = entrada.nextFloat();
            entrada.nextLine();

            if (menorTempo > tempoVolta) {
                menorTempo = tempoVolta;
            }

            System.out.print("Deseja informar uma nova volta? Digite \"S\" ou \"N\". ");
            continuar = entrada.next().toUpperCase();

            if ((! continuar.equals("S")) && (! continuar.equals("N"))) {
                System.out.println("Entrada inválida. Digite \"S\" ou \"N\".");
                continuar = entrada.next().toUpperCase();
            }
        }
        
        System.out.println("A menor volta foi " + menorTempo + ".");

    }
}
