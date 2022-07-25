/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade03;

import java.util.Scanner;

/**
 * Escreva  um algoritmo que receba os nomes e sexos de 10  hóspedes. Depois disso, mostre, separadamente: primeiro,todos os nomes dos
 * hóspedesdo sexo masculino;depois,todos os nomes das hóspedes do sexo feminino.
 *      Exemplo:
 *              Entradas: Maria  Silva,  “F”;  Antônia  Oliveira,  “F”;  João  Siqueira, “M”; Joaquim Sá, “M”; José da Silva, “M”;
 *              Mário Peres, “M”; Joana Assunção, “F”; Helena Sá, “F”; Marisa Tomás, “F”; Roberto Freire,“M”
 *              Saídas: João  Siqueira, Joaquim  Sá,  José  da  Silva,  Mário  Peres, Roberto Freire
 *              Maria Silva, Antônia Oliveira,Joana Assunção, Helena Sá, Marisa Tomás
 *
 * @author v3gc
 */
public class ManutQuartos02 {
  
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
  
  String[] hospede = new String[10];
  String[] sexo = new String[10];
  int contMasc = 0;
  int contFem = 0;
  int contNaoBin = 0;

    for (int i = 0; i < 10; i++) {
      System.out.println("Digite o nome do hóspede " + (i + 1) + ":");
      hospede[i] = in.nextLine();

      System.out.println("Qual o sexo de " + hospede[i] + "?");
      System.out.println("Use M para masculino, F para feminimo e NB para não-ninário");
      sexo[i] = in.nextLine();
      sexo[i] = sexo[i].toLowerCase();

      if (! sexo[i].equals("m") && ! sexo[i].equals("f") && ! sexo[i].equals("nb")) {
        System.out.println("Entrada inválida. Use 'M' para masculino, 'F' para feminimo e 'NB' para não-ninário");
        sexo[i] = in.nextLine();
        sexo[i] = sexo[i].toLowerCase();
      }
    }
      
    for (int i = 0; i < 10; i++) {
      if (sexo[i].equals("m")) {
        contMasc++;

        if (contMasc > 1) {
          System.out.print("; " + hospede[i]);
          
        } else {
          System.out.print(hospede[i]);
          
        }
      }
    }
        
    System.out.println(" ");
    
    for (int i = 0; i < 10; i++) {
      if (sexo[i].equals("f")) {
        contFem++;

        if (contFem > 1) {
          System.out.print("; " + hospede[i]);
          
        } else {
          System.out.print(hospede[i]);
          
        }
      }
    }
    
        System.out.println(" ");

    for (int i = 0; i < 10; i++) {
      if (sexo[i].equals("nb")) {
        contNaoBin++;

        if (contNaoBin > 1) {
          System.out.print("; " + hospede[i]);
          
        } else {
          System.out.print(hospede[i]);
          
        }
      }
    }

  }  
}

