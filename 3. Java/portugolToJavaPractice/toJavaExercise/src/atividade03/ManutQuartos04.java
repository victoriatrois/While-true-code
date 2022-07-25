/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade03;

import java.util.Scanner;

/**
 * Desenvolva  um  algoritmo  para  montar  uma  tabela  com  escala de limpeza de um quarto. A limpeza é feita todos os dias da semana
 * pode acontecer em três turnos:manhã, tarde e noite. O algoritmo deve receber o dia da semana representado por um número inteiro 
 * (1-Domingo,  2-Segunda ...  7-Sábado) e também o turno (“M” -manhã, “T”-tarde  e “N”-noite). Depois, o algoritmo deve receber o nome
 * da pessoa escalada para a limpeza e registrar no espaço adequado. Deve receber entradas até que se digite 0 como dia da semana. As
 * entradas de  dia  e  turno  devem  ser  validadas  para  que  valores  incorretos  não sejam  informados.  Ao  fim, é  preciso mostrar
 * na  tela  a  tabela  com  a escala de limpezas, sendo as linhas os dias da semana e as colunas os turnos.
 *       Exemplo
 *               Entrada: 2
 *               Entrada: “T”
 *               Entrada: Ronaldo
 *               Entrada: 4
 *               Entrada: “M”
 *               Entrada: Maria
 *               Entrada: 6
 *               Entrada: “T”
 *               Entrada: João
 *               Entrada: 6
 *               Entrada: “N”
 *               Entrada: Maria
 *               Entrada: 0
 *               Saída:             Manhã    Tarde       Noite
 *                       Domingo:
 *                       Segunda:            Ronaldo
 *                       Terça:
 *                       Quarta: Maria
 *                       Quinta:             João        Maria
 *                       Sexta:
 *                       Sábado:
 * 
 * (Dica para formatação da tabela na saída: use o caractere \t para espaçamento.)
 * 
 * @author v3gc
 */

public class ManutQuartos04 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      String[][] grade = new String[8][4];

      //coluna e linha 0
      grade[0][0] = "         ";

      //colunas
      grade[0][1] = "      manhã   ";
      grade[0][2] = "   tarde   ";
      grade[0][3] = "   noite";

      //linhas
      grade[1][0] = "  domingo      ";
      grade[2][0] = "  segunda      ";
      grade[3][0] = "    terça      ";
      grade[4][0] = "   quarta      ";
      grade[5][0] = "   quinta      ";
      grade[6][0] = "    sexta      ";
      grade[7][0] = "   sábado      ";
      
      //corpo da grade em branco
      for (int l = 1; l < 8; l++) {
            for (int c = 1; c < 4; c++) {
              grade[l][c]= " ";
            }
          }

      System.out.println("Digite \"1\" para começar.");
      int dia = in.nextInt();
      char turno = '-';
      String colaboradore = "";

      while (dia != 0) {
        System.out.println("Escolha o dia:");
        System.out.println("1-Domingo, 2-Segunda, 3-Terça, 4-Quarta, 5-Quinta, 6-Sexta, 7-Sábado.");
        System.out.println("Para sair digite 0.");
        dia = in.nextInt();

        if (dia < 0 || dia > 7) {
          System.out.println("Entrada inválida.");
          System.out.println("Digite 1-Domingo, 2-Segunda, 3-Terça, 4-Quarta, 5-Quinta, 6-Sexta, 7-Sábado.");
          System.out.println("Para sair digite 0.");

          
        } else {
          switch (dia) {
            case 1:
                System.out.println("Escolha o turno:");
                System.out.println("\"M\"-Manhã, \"T\"-Tarde ou \"N\"-Noite.");
                in.nextLine();
                turno = in.next().charAt(0);

                if ((turno != 'M') && (turno != 'T') && (turno != 'N')) {
                    System.out.println("Entrada inválida. Digite \"M\"-Manhã, \"T\"-Tarde ou \"N\"-Noite.");
                    in.nextLine();
                    turno = in.next().charAt(0);

                } else {
                    System.out.println("Digite o nome do(a) colaborador(a)");
                    in.nextLine();
                    colaboradore = in.nextLine();
                }

                if (turno == 'M') {
                    grade[1][1] = colaboradore;

                } else if (turno == 'T') {
                    grade[1][2] = colaboradore;

                } else {
                    grade[1][3] = colaboradore;

                }
                break;

            case 2:
                System.out.println("Escolha o turno:");
                System.out.println("\"M\"-Manhã, \"T\"-Tarde ou \"N\"-Noite.");
                in.nextLine();
                turno = in.next().charAt(0);

                if ((turno != 'M') && (turno != 'T') && (turno != 'N')) {
                  System.out.println("Entrada inválida. Digite \"M\"-Manhã, \"T\"-Tarde ou \"N\"-Noite.");
                  in.nextLine();
                  turno = in.next().charAt(0);

                } else {
                  System.out.println("Digite o nome do(a) colaborador(a)");
                  in.nextLine();
                  colaboradore = in.nextLine();
                }

                if (turno == 'M') {
                  grade[2][1] = colaboradore;

                } else if (turno == 'T') {
                  grade[2][2] = colaboradore;

                } else {
                  grade[2][3] = colaboradore;

                }
                break;
            
            case 3:
                System.out.println("Escolha o turno:");
                System.out.println("\"M\"-Manhã, \"T\"-Tarde ou \"N\"-Noite.");
                in.nextLine();
                turno = in.next().charAt(0);

                if ((turno != 'M') && (turno != 'T') && (turno != 'N')) {
                  System.out.println("Entrada inválida. Digite \"M\"-Manhã, \"T\"-Tarde ou \"N\"-Noite.");
                  in.nextLine();
                  turno = in.next().charAt(0);

                } else {
                  System.out.println("Digite o nome do(a) colaborador(a)");
                  in.nextLine();
                  colaboradore = in.nextLine();
                }

                if (turno == 'M') {
                  grade[3][1] = colaboradore;

                } else if (turno == 'T') {
                  grade[3][2] = colaboradore;

                } else {
                  grade[3][3] = colaboradore;

                }
                  break;

            case 4:
                System.out.println("Escolha o turno:");
                System.out.println("\"M\"-Manhã, \"T\"-Tarde ou \"N\"-Noite.");
                in.nextLine();
                turno = in.next().charAt(0);

                if ((turno != 'M') && (turno != 'T') && (turno != 'N')) {
                  System.out.println("Entrada inválida. Digite \"M\"-Manhã, \"T\"-Tarde ou \"N\"-Noite.");
                  in.nextLine();
                  turno = in.next().charAt(0);

                } else {
                  System.out.println("Digite o nome do(a) colaborador(a)");
                  in.nextLine();
                  colaboradore = in.nextLine();
                }

                if (turno == 'M') {
                  grade[4][1] = colaboradore;

                } else if (turno == 'T') {
                  grade[4][2] = colaboradore;

                } else {
                  grade[4][3] = colaboradore;

                }
                  break;

            case 5:
                System.out.println("Escolha o turno:");
                System.out.println("\"M\"-Manhã, \"T\"-Tarde ou \"N\"-Noite.");
                in.nextLine();
                turno = in.next().charAt(0);

                if ((turno != 'M') && (turno != 'T') && (turno != 'N')) {
                  System.out.println("Entrada inválida. Digite \"M\"-Manhã, \"T\"-Tarde ou \"N\"-Noite.");
                  in.nextLine();
                  turno = in.next().charAt(0);

                } else {
                  System.out.println("Digite o nome do(a) colaborador(a)");
                  in.nextLine();
                  colaboradore = in.nextLine();
                }

                if (turno == 'M') {
                  grade[5][1] = colaboradore;

                } else if (turno == 'T') {
                  grade[5][2] = colaboradore;

                } else {
                  grade[5][3] = colaboradore;

                }
                  break;

            case 6:
                System.out.println("Escolha o turno:");
                System.out.println("\"M\"-Manhã, \"T\"-Tarde ou \"N\"-Noite.");
                in.nextLine();
                turno = in.next().charAt(0);

                if ((turno != 'M') && (turno != 'T') && (turno != 'N')) {
                  System.out.println("Entrada inválida. Digite \"M\"-Manhã, \"T\"-Tarde ou \"N\"-Noite.");
                  in.nextLine();
                  turno = in.next().charAt(0);

                } else {
                  System.out.println("Digite o nome do(a) colaborador(a)");
                  in.nextLine();
                  colaboradore = in.nextLine();
                }

                if (turno == 'M') {
                  grade[6][1] = colaboradore;

                } else if (turno == 'T') {
                  grade[6][2] = colaboradore;

                } else {
                  grade[6][3] = colaboradore;

                }
                  break;
            
            case 7:
                System.out.println("Escolha o turno:");
                System.out.println("\"M\"-Manhã, \"T\"-Tarde ou \"N\"-Noite.");
                in.nextLine();
                turno = in.next().charAt(0);

                if ((turno != 'M') && (turno != 'T') && (turno != 'N')) {
                  System.out.println("Entrada inválida. Digite \"M\"-Manhã, \"T\"-Tarde ou \"N\"-Noite.");
                  in.nextLine();
                  turno = in.next().charAt(0);

                } else {
                  System.out.println("Digite o nome do(a) colaborador(a)");
                  in.nextLine();
                  colaboradore = in.nextLine();
                }

                if (turno == 'M') {
                  grade[7][1] = colaboradore;

                } else if (turno == 'T') {
                  grade[7][2] = colaboradore;

                } else {
                  grade[7][3] = colaboradore;

                }
                  break;
          }

          
      }
        System.out.println(grade[0][0] + grade[0][1] + grade[0][2] + grade[0][3]);
        System.out.println(" ");
          for (int linhas = 1; linhas < 8; linhas++) {
            System.out.print("\n" + grade[linhas][0]);
            for (int colunas = 1; colunas < 4; colunas++) {
              System.out.print(grade[linhas][colunas] + "         ");
              
            }
            
          }
          System.out.println(" ");
          
        }
    }
}
