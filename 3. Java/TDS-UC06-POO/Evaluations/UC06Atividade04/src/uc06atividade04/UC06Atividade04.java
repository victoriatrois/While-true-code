/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uc06atividade04;

import java.text.Normalizer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author v3gc
 */
public class UC06Atividade04 {
    
    public static String removeDiacriticos(String s) {
	    s = Normalizer.normalize(s, Normalizer.Form.NFD);
	    s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
	    return s;
	}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Queue<Float> meusTributos = new LinkedList<>();
        int opcao;
        
        do {
        
            System.out.println("Digite 1 para calcular tributos, 2 para exibir os tributos calculados e 3 para sair.");
            opcao = entrada.nextInt();
            entrada.nextLine();

            while (opcao != 1 && opcao != 2 && opcao != 3) {
                System.out.println("Entrada inválida. Digite 1 para calcular tributos, 2 para exibir os tributos calculados e 3 para sair.");
            }
            
            switch (opcao) {
                case 1 -> {
                    System.out.print("\nQual tributo você deseja calcular? ");
                    String tipoDeTributo = entrada.nextLine().toUpperCase();
                    
                    switch (tipoDeTributo) {
                        case "IPI" -> {
                            IPI calculo = new IPI();
                            
                            System.out.print("\nDigite o valor do produto: ");
                            float valorDoProduto = entrada.nextFloat();
                            calculo.setValorDoProduto(valorDoProduto);
                            
                            System.out.print("Digite o valor do frete: ");
                            float valorDoFrete = entrada.nextFloat();
                            calculo.setFrete(valorDoFrete);
                            
                            System.out.print("Digite o valor do seguro: ");
                            float valorDoSeguro = entrada.nextFloat();
                            calculo.setValorDoSeguro(valorDoSeguro);
                            
                            System.out.print("Se você teve outras despesas, digite o valor total delas. Digite zero (0) se elas não exixtiram: ");
                            float valorDeOutrasDespesas = entrada.nextFloat();
                            calculo.setOutrasDespesas(valorDeOutrasDespesas);
                            
                            calculo.calculaImposto();
                            System.out.println("\n" + calculo.toString() + "\n");
                            meusTributos.add(calculo.getResultadoCalculo());
                            
                        }
                        
                        case "ICMS" -> {
                            ICMS calculo = new ICMS();
                            
                            System.out.print("\nDigite o valor da mercadoria: ");
                            float valorDaMercadoria = entrada.nextFloat();
                            calculo.setValorDaMercadoria(valorDaMercadoria);
                            
                            calculo.calculaImposto();
                            System.out.println("\n" + calculo.toString() + "\n");
                            meusTributos.add(calculo.getResultadoCalculo());
                            
                        }
                        
                        case "PIS" -> {
                            PIS calculo = new PIS();
                            
                            System.out.print("\nDigite o débito total da empresa: ");
                            float debitoTotalDaEmpresa = entrada.nextFloat();
                            calculo.setDebitoTotalDaEmpresa(debitoTotalDaEmpresa);
                            
                            System.out.print("Digite o crédito total da empresa: ");
                            float creditoTotalDaEmpresa = entrada.nextFloat();
                            calculo.setCreditoTotalDaEmpresa(creditoTotalDaEmpresa);
                            
                            calculo.calculaImposto();
                            System.out.println("\n" + calculo.toString() + "\n");
                            meusTributos.add(calculo.getResultadoCalculo());
                        }
                        
                        case "COFINS" -> {
                            Cofins calculo = new Cofins();
                            
                            System.out.print("\nDigite o débito total da empresa: ");
                            float debitoTotalDaEmpresa = entrada.nextFloat();
                            calculo.setDebitoTotalDaEmpresa(debitoTotalDaEmpresa);
                            
                            System.out.print("Digite o crédito total da empresa: ");
                            float creditoTotalDaEmpresa = entrada.nextFloat();
                            calculo.setCreditoTotalDaEmpresa(creditoTotalDaEmpresa);
                            
                            calculo.calculaImposto();
                            System.out.println("\n" + calculo.toString() + "\n");
                            meusTributos.add(calculo.getResultadoCalculo());
                            
                        }
                        
                        default -> {
                            System.out.println("Não há cálculo disponível para esse tributo.");
                        }
                    }
                }
                
                case 2 -> {
                    if (meusTributos.isEmpty()) {
                        System.out.println("Você não tem cálculos armazenados.");
                        
                    } else {
                        System.out.println(meusTributos);
                    }
                }
                
                case 3 -> {
                    break;
                }
                
                default -> {
                    System.out.println("Digite uma opção válida: 1 para calcular tributos, 2 para exibir os tributos calculados e 3 para sair.");
                    
                }    
            }
            
        } while (opcao == 1 || opcao == 2);
        
    }
}
