/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author v3gc
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetor[] = {3,7,6,1,9,4,2};
        
        for(int valor:vetor){
            System.out.println(valor);
        }
            
        int posicao = Arrays.binarySearch(vetor, 1);
        System.out.println("Encontrei o valor na posição " + posicao);
        
        int vetor02[] = new int[20];
        Arrays.fill(vetor02,0);
        
        for(int valor02:vetor02){
            System.out.print(valor02 + " ");
        }
    
    }
    
}
