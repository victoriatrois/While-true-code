/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author v3gc
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetor[] = {3,2,8,7,5,4};
        System.out.println("O total de casas do vetor é " + vetor.length);
        
        for(int contador=0; contador<=(vetor.length-1); contador++){
            System.out.println("Na posição " + contador + " temos o valor " + vetor[contador] + ".");
        }
        
        //vetor03
        Arrays.sort(vetor);
        for(int valor:vetor){
            System.out.println(valor);
        }        
    }
}
