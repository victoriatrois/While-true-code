/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01;

import java.util.Scanner;

/*
 * 
 * Com base na situação anterior, considere que o hotel calcula a necessidade de 1 garçom para cada 20 participantes do evento. Assim, monte um algoritmo, baseado no anterior,
 * em que, ao invés de receber o número de garçons, receba a quantidade de convidados do evento, além da quantidade de horas do evento. Calcule e mostre na tela o número de 
 * garçons necessários e o custo total. Quando o número de participantes for menor que 20, considere apenas um garçom. Não deixe de aplicar a regra do coordenador, enunciada no
 * item anterior.
 *      Exemplo:
 *      Entradas: 200 pessoas; 10 horas
 * 
 * @author v3gc
 */
public class CalcGarcons02 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Quantos convidados seu evento receberá?");
        int numConvidados = in.nextInt();

        System.out.println("Quantas horas seu evento durará?");
        float duracaoEvento = in.nextFloat();

        int numGarcons = numConvidados/20;

        if (numGarcons == 1){
                System.out.println("Você precisará de 1 garçom.");
        } else {
                System.out.print("Você precisará de " + numGarcons + " garçons e ");

                float hrGarcons = 10.50f;
                float extraGarcomCoord = 1.50f;

                float custoGarcons = hrGarcons * duracaoEvento;
                float custoGarcomCoord = extraGarcomCoord * duracaoEvento;
                float custoTotalEvento = custoGarcons * numGarcons + custoGarcomCoord;

                System.out.println("o custo total do evento será de " + custoTotalEvento + " reais.");
        }
    }
}
