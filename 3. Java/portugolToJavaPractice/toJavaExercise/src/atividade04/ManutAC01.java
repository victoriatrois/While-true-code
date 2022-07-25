/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade04;

import java.util.Scanner;

/**
 * A manutenção dos condicionadores de ar do hotel é© realizada por empresas terceirizadas que, em alguns casos,
 * oferecem desconto quando o serviço é feito em uma quantidade determinada de aparelhos. Assim, crie uma função
 * ou um procedimento que receba o nome da empresa, o valor do serviço por aparelho, a quantidade de aparelho em
 * manutenção, o percentual de desconto (que pode ser zero) e a quantidade mínima de aparelhos para que o desconto
 * seja dado. Calcule o valor total do serviço, a partir do valor unitário e da quantidade de aparelhos, aplicando
 * o desconto, caso seja  cabível, e mostre a mensagem "O serviço com (nome  da  empresa) custará R$(total calculado)".
 * 
 * Monte um algoritmo que permita que o usuário informe repetidas vezes os dados necessários para o cálculo e use
 * a função/procedimento para mostrar o total orçado. Termine o algoritmo quando o usuário responder "N" para a mensagem
 * "Deseja informar novos dados? (S/N)".
 *      Exemplo:
 *              Entradas:"Empresa 1"; R$  100,00  por  aparelho;  15  aparelhos, 20% de desconto; mínimo de 10 unidades para desconto
 *              Saída: O serviço com empresa 1 custará R$ 1200.0
 *              Saída: Deseja informar novos dados? (S/N)
 *              Entrada: "S"
 *              Entradas: "Empresa 2"; R$ 90,00 por aparelho; 15 aparelhos, 0% de desconto; 0 unidades (pois nãoo oferece desconto)
 *              Saída: O serviÃ§o com a empresa 1 custarÃ¡ R$ 1350.0
 *              Saída: Deseja informar novos dados? (S/N)
 *              Entrada: "N"
 * 
 *  m[0][0] - Empresa de indice 0, preço por aparelho
 *  m[0][1] - Empresa de indice 0, quantidade de aparelhos
 *  m[0][2] - Empresa de indice 0, desconto
 *  m[0][3] - Empresa de indice 0, num min de aparelhos para desconto
 *
 * @author v3gc
 */



public class ManutAC01 {
    
    Scanner in = new Scanner(System.in);
    
    public void cadastraEmpresa(String[] nomeEmpresa, float[][] dados, int idx){
        System.out.println("Digite o nome da empresa: ");
        nomeEmpresa[idx] = in.nextLine();
        
        float precoPorAparelho = -1.0f;
        float qtdAparelhos = -1.0f;
        float desconto = -1.0f;
        float qtdMin = -1.0f;
        
        while (precoPorAparelho < 1) {
            System.out.println("Digite o valor do serviço por aparelho:");
            precoPorAparelho = in.nextFloat();
            
            if (precoPorAparelho < 1) {
                System.out.println("Entrada inválida. Digite um valor maior ou igual a 1.");
                precoPorAparelho = in.nextFloat();
                
            } else {
                while (qtdAparelhos < 1) {
                    System.out.println("Digite a quantidade de aparelhos para manutenção:");
                    qtdAparelhos = in.nextFloat();
                    
                    if (qtdAparelhos < 1) {
                        System.out.println("Entrada inválida. Digite uma quantidade maior que zero.");
                        
                    } else {
                        while (desconto < 0 || desconto > 100) {
                            System.out.println("Digite o percentual de desconto:");
                            desconto = in.nextFloat();
                            
                            if (desconto < 0 || desconto > 100) {
                                System.out.println("Entrada inválida. Digite um percentual de desconto entre 0 e 100.");
                                
                            } else {
                                if (desconto > 0){
                                    while (qtdMin < 0){
                                        System.out.println("Digite a quantidade mínima de aparelhos para desconto:");
                                        qtdMin = in.nextFloat();
                                        
                                        if (qtdMin < 0) {
                                            System.out.println("Entrada inválida. Digite um valor maior ou igual a zero.");
                                        
                                        } else {
                                            qtdMin = 0;
                                        
                                        }
                                    }
                                }                                
                            }
                        }
                    }
                }
            }
        }
        
        dados[idx][0] = precoPorAparelho;
        dados[idx][1] = qtdAparelhos;
        dados[idx][2] = desconto;
        dados[idx][3] = qtdMin;
        
    }
    
    public float calculaOrcamento(float[][] dados, int idx){
        float precoPorAparelho = dados[idx][0];
        float qtdAparelhos = dados[idx][1];
        float desconto = dados[idx][2];
        float qtdMin = dados[idx][3];
        
        if (desconto == 0) {
            float orcamento = precoPorAparelho * qtdAparelhos;
            return orcamento;
        } else {
            desconto = 1 - (desconto/100);
            float orcamento = precoPorAparelho * qtdAparelhos * desconto;
            return orcamento;
        }
    }
    
    public static void main(String[] args) {
        final int maxEmpresas = 10;
        final int maxColunas = 4;
        
        String[] empresa = new String[maxEmpresas];
        float[][] dados = new float[maxEmpresas][maxColunas];
        int indice = 0;
        char opcao = 'S';
        float[] orcamento = new float[maxEmpresas];
        
        while (opcao == 'S') {
            cadastraEmpresa(empresa, dados, indice);
            orcamento[indice] = calculaOrcamento(dados,indice);
            
            System.out.println("O serviço de " + empresa[indice] + " custará " + orcamento[indice] " reais.");
            indice++;
            
            System.out.println("Deseja informar mais dados? ");
            opcao = in.nextInt();
            
            while (opcao == 'S' && opcao != 'N') {
                if (opcao != 'S') {
                    System.out.println("Entrada inválida. Digite \"S\" ou \"N\".");
                    
                } else {
                    break;
                }
            }
        }
        
    }
}
