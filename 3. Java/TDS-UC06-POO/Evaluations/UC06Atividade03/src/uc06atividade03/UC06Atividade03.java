/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uc06atividade03;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author v3gc
 */
public class UC06Atividade03 {

    /**
     * @param args the command line arguments
     */
    
    public static String removeDiacriticos(String s) {
	    s = Normalizer.normalize(s, Normalizer.Form.NFD);
	    s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
	    return s;
	}
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Funcionario> cadastro = new ArrayList();
        
        int opcao;
        
        do {
        
        System.out.println("Digite 1 para cadastrar funcionários, 2 para exibir informações, 3 para dar aumento geral e 4 para sair.");
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcao) {
                case 1 -> {
                    System.out.print("Qual a modalidade de contratação desse funcionário? (Digite \"Horista\" ou \"Celetista\"): ");
                    String modalidadeDeContratacao = removeDiacriticos(entrada.nextLine().toLowerCase());
                    
                    if (modalidadeDeContratacao.equals("horista")) {
                        Horista funcionario = new Horista();
                        cadastro.add(funcionario);
                        
                        funcionario.setModalidadeDeContratacao(modalidadeDeContratacao);
                        
                        System.out.print("Digite o nome do funcionário: ");
                        String nome = entrada.nextLine();
                        funcionario.setNome(nome);
                        
                        System.out.print("Digite o CPF do funcionário: ");
                        String cpf = entrada.nextLine();
                        funcionario.setCpf(cpf);
                        
                        System.out.print("Digite o enderço do funcionário: ");
                        String endereco = entrada.nextLine();
                        funcionario.setEndereco(endereco);
                        
                        System.out.print("Digite o telefone do funcionário: ");
                        String telefone = entrada.nextLine();
                        funcionario.setTelefone(telefone);
                        
                        System.out.print("Digite o setor do funcionário: ");
                        String setor = entrada.nextLine();
                        funcionario.setSetor(setor);
                        
                        System.out.print("Digite o salário do funcionário: ");
                        float salario = entrada.nextFloat();
                        entrada.nextLine();
                        funcionario.setSalario(salario);
                        
                        System.out.println("\n");
                        
                    } else {
                        Celetista funcionario = new Celetista();
                        cadastro.add(funcionario);
                        
                        funcionario.setModalidadeDeContratacao(modalidadeDeContratacao);
                        
                        System.out.print("Digite o nome do funcionário: ");
                        String nome = entrada.nextLine();
                        funcionario.setNome(nome);
                        
                        System.out.print("Digite o CPF do funcionário: ");
                        String cpf = entrada.nextLine();
                        funcionario.setCpf(cpf);
                        
                        System.out.print("Digite o enderço do funcionário: ");
                        String endereco = entrada.nextLine();
                        funcionario.setEndereco(endereco);
                        
                        System.out.print("Digite o telefone do funcionário: ");
                        String telefone = entrada.nextLine();
                        funcionario.setTelefone(telefone);
                        
                        System.out.print("Digite o setor do funcionário: ");
                        String setor = entrada.nextLine();
                        funcionario.setSetor(setor);
                        
                        System.out.print("Digite o salário do funcionário: ");
                        float salario = entrada.nextFloat();
                        entrada.nextLine();
                        funcionario.setSalario(salario);
                        
                        System.out.println("\n");
                    }
                }
                    
                case 2 -> {
                    if (cadastro.isEmpty()){
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        for (Funcionario cadastros : cadastro) {
                            System.out.println(cadastros.toString());
                            System.out.println("\n");
                        }
                    }
                }
                    
                case 3 -> {
                    if (cadastro.isEmpty()){
                        System.out.println("Impossível aplicar aumento. Nenhum funcionário cadastrado.");
                    } else {
                        for (Funcionario cadastros : cadastro) {
                            cadastros.aplicaAumento();
                            System.out.println(cadastros.toString());
                            System.out.println("\n");
                        }
                    }
                }
                    
                case 4 -> {
                    break;
                }
                    
                default -> {
                    while (opcao < 1 || opcao > 4) {
                        System.out.println("Entrada inválida");
                        System.out.println("Digite 1 para cadastrar funcionários, 2 para exibir informações, 3 para dar aumento geral e 4 para sair.");
                        opcao = entrada.nextInt();
                        entrada.nextLine();
                    }
                }
                    
            }
        
        if (opcao == 1 && cadastro.size() >= 10) {
            System.out.println("Impossível cadastrar mais funcionários. A capacidade da empresa foi atingida.");
        }
        
        } while(opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4);
    }
}
