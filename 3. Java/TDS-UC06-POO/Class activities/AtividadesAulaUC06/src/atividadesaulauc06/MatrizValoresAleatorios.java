/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesaulauc06;

import java.util.Random;

/**
 *
 * @author v3gc
 */
public class MatrizValoresAleatorios {
    public static void main(String[] args) {
        int [][] numeros = new int [3][4];
        Random numeroAleatorio = new Random();
        
        for (int[] numero : numeros) {
            for (int c = 0; c < numero.length; c++) {
                numero[c] = numeroAleatorio.nextInt(10);
            }
        }
        
        for (int[] numero : numeros) {
            for (int c = 0; c < numero.length; c++) {
                System.out.print("\t[" + numero[c] + "] ");
            }
            System.out.println();
        }
    }
}
