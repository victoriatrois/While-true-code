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
        
        String continuar = "";
        
        String[][] planta = new String[4][4];
        
        //colunas (andares)
        planta[0][0] = "4º andar  ";
        planta[1][0] = "3º andar  ";
        planta[2][0] = "2º andar  ";
        planta[3][0] = "1º andar  ";

        //corpo da grade preenchido com [ ]
        for (int l = 0; l < 4; l++) {
              for (int c = 1; c < 4; c++) {
                planta[l][c]= "[ ]";
              }
            }
        
        do {            
            System.out.print("Digite o andar que deseja ocupar: ");
            int andar = entrada.nextInt();
            
            while ((andar < 1) || (andar > 4)) {
                System.out.println("Entrada inválida. Digite um número entre 1 e 4.");
                andar = entrada.nextInt();
                
            }
            
            switch (andar) {
                case 4 -> {
                    System.out.println("Escolha o quarto:");
                    System.out.println("41, 42, 43");
                    int quarto = entrada.nextInt();
                    
                    if ((quarto != 41) && (quarto != 42) && (quarto != 43)) {
                        System.out.println("Entrada inválida. Escolha um dos quartos disponíveis no quarto andar: 41, 42 ou 43.");
                    } else {
                        switch (quarto) {
                            case 41 -> planta [0][1] = "[x]";
                                
                            case 42 -> planta [0][2] = "[x]";
                                
                            case 43 -> planta [0][3] = "[x]";
                            
                            default -> System.out.println("Este quarto não existe.");
                        }
                    }
                    break;
                }
                
                case 3 -> {
                    System.out.println("Escolha o quarto:");
                    System.out.println("31, 32, 33");
                    int quarto = entrada.nextInt();
                    
                    if ((quarto != 31) && (quarto != 32) && (quarto != 33)) {
                        System.out.println("Entrada inválida. Escolha um dos quartos disponíveis no terceiro andar: 31, 32 ou 33.");
                    } else {
                        switch (quarto) {
                            case 31 -> planta [1][1] = "[x]";
                                
                            case 32 -> planta [1][2] = "[x]";
                                
                            case 33 -> planta [1][3] = "[x]";
                            
                            default -> System.out.println("Este quarto não existe.");    
                        }
                    }
                    break;
                }
                
                case 2 -> {
                    System.out.println("Escolha o quarto:");
                    System.out.println("21, 22, 23");
                    int quarto = entrada.nextInt();
                    
                    if ((quarto != 21) && (quarto != 22) && (quarto != 23)) {
                        System.out.println("Entrada inválida. Escolha um dos quartos disponíveis no segundo andar: 21, 22 ou 23");
                    } else {
                        switch (quarto) {
                            case 21 -> planta [2][1] = "[x]";
                                
                            case 22 -> planta [2][2] = "[x]";
                                
                            case 23 -> planta [2][3] = "[x]";
                                                        
                            default -> System.out.println("Este quarto não existe.");
                        }
                    }
                    break;
                }
                
                case 1 -> {
                    System.out.println("Escolha o quarto:");
                    System.out.println("11, 12, 13");
                    int quarto = entrada.nextInt();
                    
                    if ((quarto != 11) && (quarto != 12) && (quarto != 13)) {
                        System.out.println("Entrada inválida. Escolha um dos quartos disponíveis no primeiro andar: 11, 12 ou 13.");
                    } else {
                        switch (quarto) {
                            case 11 -> planta [3][1] = "[x]";
                                
                            case 12 -> planta [3][2] = "[x]";
                                
                            case 13 -> planta [3][3] = "[x]";
                                                        
                            default -> System.out.println("Este quarto não existe.");
                        }
                    }
                    break;
                }
            }
            
            System.out.println("Deseja continuar? Digite \"S\"/\"N\"");
            entrada.nextLine();
            continuar = entrada.nextLine().toUpperCase();
            
        } while (continuar.equals("S"));
        
          for (int linhas = 0; linhas < 4; linhas++) {
            System.out.print("\n" + planta[linhas][0]);
            
            for (int colunas = 1; colunas < 4; colunas++) {
              System.out.print(planta[linhas][colunas] + "  ");
            }
          }
    }
}
