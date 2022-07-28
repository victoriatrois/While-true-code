/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc06atividade01;

import java.util.Scanner;

/**
 * Monte um programa Java que mostre na tela em formato de tabela os quartos ocupados e os desocupados. Considere que o hotel tem quatro andares
 * e três quartos por andar. Primeiro, o usuário registrará os quartos ocupados, informando para cada ocupação o número do apartamento (andares
 * de 1 a 4 e números de quarto de 1 a 3). O programa deverá questionar “Deseja informar outra ocupação? (S/N)” e o usuário poderá informar
 * quantos quartos quiser, até que responda “N” a essa pergunta.
 * 
 * Em seguida, o programa mostrará uma tabela, em que o primeiro andar é o inferior e o último é o superior, marcando com X o quarto ocupado.
 * 
 * Exemplo:
 *          [Saída de dados]
 *          Informe Andar e Quarto
 *          [Entrada de dados]
 *          1 (andar)
 *          1 (quarto)
 *          [Saída de dados]
 *          Deseja informar outra ocupação? (S/N)
 *          [Entrada de dados]
 *          S
 *          [Saída de dados]
 *          Informe Andar e Quarto
 *          [Entrada de dados]
 *          2 (andar)
 *          3 (quarto)
 *          [Saída de dados]
 *          Deseja informar outra ocupação? (S/N)
 *          S
 *          [Saída de dados]
 *          Informe Andar e Quarto
 *          [Entrada de dados]
 *          4(andar)
 *          1(quarto)
 *          [Saída de dados]
 *          Deseja informar outra ocupação? (S/N)
 *          [Entrada de dados]
 *          N
 *          [Saída de dados]
 *          Ocupação do hotel:
 *                              4º andar [X][ ][ ]
 *                              3º andar [ ][ ][ ]
 *                              2º andar [ ][ ][X]
 *                              1º andar [X][ ][ ]
 * 
 ** @author v3gc
 */
public class UC06Atividade15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String[][] grade = new String[4][4];
        
        //colunas (andares)
        grade[0][0] = "4º andar  ";
        grade[1][0] = "3º andar  ";
        grade[2][0] = "2º andar  ";
        grade[3][0] = "1º andar  ";

        //corpo da grade preenchido com [ ]
        for (int l = 0; l < 4; l++) {
              for (int c = 1; c < 4; c++) {
                grade[l][c]= "[ ]";
              }
            }
        
          for (int linhas = 0; linhas < 4; linhas++) {
            System.out.print("\n" + grade[linhas][0]);
            
            for (int colunas = 1; colunas < 4; colunas++) {
              System.out.print(grade[linhas][colunas] + "  ");
            }
          }
    }
}
