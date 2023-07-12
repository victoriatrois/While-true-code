/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga;

import br.edu.ifrs.Clubes;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int opcao = 0;
        
        do {
            System.out.println("----------- Menu -----------");
            System.out.println("1 - Inserir Filmes");
            System.out.println("2 - Atualizar Filmes");
            System.out.println("3 - Deletar Filmes");
            System.out.println("4 - Listar Filmes");
            System.out.println("5 - Inserir Ator(a)");
            System.out.println("6 - Atualizar Ator(a)");
            System.out.println("7 - Deletar Ator(a)");
            System.out.println("8 - Listar Ator(a)");
            System.out.println("9 - Inserir Sala");
            System.out.println("10 - Atualizar Sala");
            System.out.println("11 - Deletar Sala");
            System.out.println("12 - Listar Sala");
            System.out.println("13 - Sair do Programa");
            System.out.println("----------------------------");
            System.out.println("Digite uma opção válida: ");

            opcao = s.nextInt();

            switch (opcao) {
                case 0 -> {
                    System.out.println("Bye bye");
                }
                case 1 -> {
                    Clubes club = new Clubes();

                    System.out.println("Digite a Sigla do Clube: ");
                    club.setSigla(s.next());

                    System.out.println("Digite o Nome do Clube: ");
                    club.setNome(s.next());

                    club.inserir();

                }
                case 2 -> {
                    Filme filme = new Filme();

                    System.out.println("Digite o Nome do filme em PTBR: ");
                    filme.setNomePTBR(s.next());

                    System.out.println("Digite o Nome original do filme: ");
                    filme.setNomeOriginal(s.next());



                    filme.atualizaFilme();

                }
                case 3 -> {
                    Filme filme = new Filme();

                    System.out.println("Digite o ID do registro a ser excluído: ");
                    filme.setIdFilme(s.nextInt());

                    filme.deletaFilme();

                }
                case 4 -> {
                    Filme filme = new Filme();

                    List<Filme> lista = filme.selecionaFilme();
                    System.out.println("ID Filme | Nome PTBR | Nome Original");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i).getIdFilme() + " | " + lista.get(i).getNomePTBR() + " | " + lista.get(i).getNomeOriginal());
                    }

                }
                case 5 -> {


                }
                case 6 -> {
                    System.out.println("A");
                }
                case 7 -> {
                    System.out.println("B");

                }
                case 8 -> {
                    System.out.println("C");
                }
                case 9 -> {
                    System.out.println("D");
                }
                case 10 -> {
                    System.out.println("E");
                }
                case 11 -> {
                    System.out.println("F");
                }
                case 12 -> {
                    System.out.println("G");
                }
                case 13 -> {
                    System.out.println("H");
                }
                default -> {
                    System.out.println("Opção Inválida!!!");
                }
            }
        } while (opcao != 0);
    }
}
