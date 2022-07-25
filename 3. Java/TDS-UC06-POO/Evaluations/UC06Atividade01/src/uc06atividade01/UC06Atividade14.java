/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc06atividade01;

import java.util.Scanner;

/**
 * Monte  um  algoritmo  em  que  o  usuário  poderá  cadastrar  e  pesquisar hóspedes.  O algoritmo  deve  oferecer  um  menu  com três
 * opções  ao usuário: 1–Cadastrar; 2-Pesquisar; 3-Sair. A opção “cadastrar” deve permitir  que  o  usuário  informe  um  nome de  hóspede,
 * gravando-o  em memória (com  um máximo  de  15  cadastros,  mostrando  a  mensagem “Máximo  de  cadastros  atingido” quando  isso  acontecer).
 * A opção “pesquisar” deve permitir que o usuário informe um nome e, caso seja encontrado um nome exatamente igual, mostre a mensagem
 * “Hóspede (nome) foi  encontrado  no  índice (índice no qual foicadastrado)”. Se  o nome não for encontrado, mostre “Hóspede  não  encontrado”.
 * O algoritmo deve permitir que o usuário realize essas operações repetidas vezes,até que use a opção “3”, que encerra o algoritmo.
 *          Exemplo:
 *                    Saída: Digite 1-Cadastrar; 2-Pesquisar; 3-Sair
 *                    Entrada: 1
 *                    Entrada: Maria da Silva
 *                    Saída: Digite 1-Cadastrar; 2-Pesquisar; 3-Sair
 *                    Entrada: 1
 *                    Entrada: José Freitas
 *                    Saída: Digite 1-Cadastrar; 2-Pesquisar; 3-Sair
 *                    Entrada: 2
 *                    Entrada: José Freitas
 *                    Saída: Hóspede José Freitas foi encontrado no índice 1
 *                    Saída: Digite 1-Cadastrar; 2-Pesquisar; 3-Sair
 *                    Entrada: 3
 * @author v3gc
 */

public class UC06Atividade14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String [] hospede = new String[15];
        
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite 1 para cadastrar, 2 para pesquisar e 3 para sair.");
            int opcao = in.nextInt();
            
            while (opcao < 1 || opcao > 3) {
                System.out.println("Entrada inválida");
                System.out.println("Digite 1 para cadastrar, 2 para pesquisar e 3 para sair.");
                opcao = in.nextInt();
            }
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do(a) hóspede:");
                    hospede[i] = in.next();
                    
                    break;
                
                case 2:
                    System.out.println("Digite o nome do(a) hóspede que você deseja pesquisar:");
                    String consulta = in.next();
                    
                    for (i = 0; i < 15; i++) {
                        if (consulta.equals(hospede[i])) {
                            System.out.println("Hóspede " + hospede[i] + " presente no índice " + i + ".");
                        }

                    }
                    if (! consulta.equals(hospede[0]) && ! consulta.equals(hospede[1]) && ! consulta.equals(hospede[2]) && ! consulta.equals(hospede[3]) && ! consulta.equals(hospede[4]) && ! consulta.equals(hospede[5]) && ! consulta.equals(hospede[6]) && ! consulta.equals(hospede[7]) && ! consulta.equals(hospede[8]) && ! consulta.equals(hospede[9]) && ! consulta.equals(hospede[10]) && ! consulta.equals(hospede[11]) && ! consulta.equals(hospede[12]) && ! consulta.equals(hospede[13]) && ! consulta.equals(hospede[14])) {
                        System.out.println("Hóspede não encontrade.");
                    }
                    
                    break;
                
                case 3:
                    i = 15;
                    System.out.println("Programa terminado.");
                    break;

            }
            
        }
    }
}
