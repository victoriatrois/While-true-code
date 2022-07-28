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
public class Tabuada {
    public static void main(String[] args) {
        Scanner  entrada = new Scanner(System.in);
        
        System.out.print("Digite o número cuja tabuada você deseja consultar: ");
        float num = entrada.nextFloat();
        
        for (int contador = 1; contador < 11; contador++) {
            float resultado = num * (float) contador;
            System.out.println(num + " x " + contador + " = " + resultado);
        }
                
    }
        
}
