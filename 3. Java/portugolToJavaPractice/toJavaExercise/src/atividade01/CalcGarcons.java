package atividade01;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author v3gc
 * Quando uma empresa contrata o hotel para abrigar eventos, o hotel oferece garçons para servir os convidados. Cada garçom custa R$ 10,50 por hora. Um dos garçons da equipe
 * coordena os demais e, por isso, recebe R$ 12,00 por hora. Considerando essas informações, escreva um algoritmo que recebe o número de garçons necessários e o total de
 * horas do evento e calcule o custo total que o hotel terá com a contratação desses profissionais. Considere que serão informados sempre valores maiores ou iguais a 1 para
 * as entradas do algoritmo. Ao final, mostre o custo total em tela.
 *
 *      Exemplo
 *      Entradas: 4 garçons; 8 horas
 *      Saída: “Custo total: R$ 348.0”
 */

public class CalcGarcons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float hrGarcons = 10.50f;
        float extraGarcomCoord = 1.50f;
        
    
        System.out.println("Digite a duração do evento em horas:");
        int duracaoEvento = in.nextInt();
    
        while (duracaoEvento < 1)
        if (duracaoEvento < 1){
            System.out.println("Valor inválido. Os eventos devem durar no mínimo uma hora.");
        } else {
            System.out.println("Digite o número de garçons que irão trabalhar:");
            int numGarcons = in.nextInt();
            
            if (numGarcons < 1){
                System.out.println("Valor inválido. Você precisará de no mínimo 01 garçon.");
            } else {
                
                
                float custoGarcons = hrGarcons * duracaoEvento;
                float custoGarcomCoord = extraGarcomCoord * duracaoEvento;
                float custoTotalEvento = custoGarcons * numGarcons + custoGarcomCoord;
                
                System.out.println("O custo total do evento será de " + custoTotalEvento + " reais.");
            }
        }
    }
}
