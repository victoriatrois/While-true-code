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

public class AreaCirculo {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        double PI = 3.1415;
        
        double diametro = entrada.nextFloat();
        
        double raio = diametro / 2;
        double raioAoQuadrado = Math.pow(raio, 2);
        double areaCirculo =  PI * raioAoQuadrado;
        
        System.out.printf("%.2f", areaCirculo);
    }
}
