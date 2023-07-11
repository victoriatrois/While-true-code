/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga;

import br.edu.ifrs.Clubes;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Programa {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int opcao = 0;
        
        do {
            System.out.println("------- Menu -------");
            System.out.println("1 - Inserir Clubes");
            System.out.println("2 - Atualizar Clubes");
            System.out.println("3 - Deletar Clubes");
            System.out.println("4 - Listar Clubes");
            System.out.println("0 - Sair do Programa");
            System.out.println("--------------------");
            System.out.println("Digite uma opção válida: ");

            opcao = s.nextInt();
            
            switch (opcao) {
                case 0: {
                    System.out.println("Bye bye");
                    break;
                }
                case 1: {
                    Clubes club = new Clubes();
                    
                    System.out.println("Digite a Sigla do Clube: ");
                    club.setSigla(s.next());
                    
                    System.out.println("Digite o Nome do Clube: ");
                    club.setNome(s.next());
                    
                    club.inserir();
                    
                    break;
                }
                case 2: {
                    Clubes club = new Clubes();
                    
                    System.out.println("Digite a Sigla do Clube: ");
                    club.setSigla(s.next());
                    
                    System.out.println("Digite o Nome do Clube: ");
                    club.setNome(s.next());
                    
                    System.out.println("Digite o ID do registro a ser atualizado: ");
                    club.setId(s.nextInt());
                    
                    club.atualizar();
                    
                    break;
                }
                case 3: {
                    Clubes club = new Clubes();
                    
                    System.out.println("Digite o ID do registro a ser excluído: ");
                    club.setId(s.nextInt());
                    
                    club.deletar();
                    
                    break;
                }
                case 4: {
                    Clubes club = new Clubes();
                    
                    Clubes lista[] = club.selecionar();
                    System.out.println("ID | Sigla | Nome");
                    for (int i=0; i<lista.length; i++) {
                        System.out.println(lista[i].getId() +" | "+ lista[i].getSigla() +" | "+lista[i].getNome());
                    }
                    
                    break;
                }
                default: {
                    System.out.println("Opção Inválida!!!");
                    break;
                }
            }
        } while (opcao != 0);
    }
}
