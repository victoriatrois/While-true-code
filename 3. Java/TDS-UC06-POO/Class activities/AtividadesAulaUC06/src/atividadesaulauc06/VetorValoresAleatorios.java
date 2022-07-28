/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesaulauc06;

/**
 *
 * @author v3gc
 */
public class VetorValoresAleatorios {
    public static void main(String[] args) {
        int [] numeros = new int[6];
        
        for (int i = 0; i < 6; i++) {
            numeros[i] = (int) (Math.random()*60);
            System.out.print(numeros[i] + " ");
        }
    }
}
