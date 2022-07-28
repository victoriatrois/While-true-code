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
public class CalculadoraAreaCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        final float PI = 3.1415926535898f;
        
        System.out.print("Digite o raio do círculo: ");
        float raio = entrada.nextFloat();
        
        float area = (float) (PI * (Math.pow(raio, 2)));
        
        System.out.println("Um círculo com " + raio + " de raio tem área de " + area + ".");
        
    }
}
