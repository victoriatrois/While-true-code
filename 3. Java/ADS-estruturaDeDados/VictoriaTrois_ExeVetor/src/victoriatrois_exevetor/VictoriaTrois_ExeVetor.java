/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package victoriatrois_exevetor;

import java.util.Scanner;

/**
 *
 * @author v3gc
 */
public class VictoriaTrois_ExeVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // TODO: criar um vetor vazio de 20 elementos
        int[] lista;
        lista = new int[20];
        
        // TODO: criar um menu numerado de 0 a 8
        int opcao;
        
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Finalizar programa");
        System.out.println("1 - Criar vetor");
        System.out.println("2 - Adicionar valor");
        System.out.println("3 - Apagar valor");
        System.out.println("4 - Procurar valor");
        System.out.println("5 - Identificar valores significativos");
        System.out.println("6 - Exibir maior valor");
        System.out.println("7 - Exibir menor valor");
        System.out.println("8 - Exibir todos os elementos");
        
        opcao = entrada.nextInt();
        
        
        switch (opcao) {
            // TODO: finalizar o programa (item 0)
            case 0:
                System.out.println("Programa finalizado.");
            
            // TODO: criar um vetor vazio (item 1)
            case 1:
                for (int i = 0; i < lista.length; i++) {
                    lista[i] = 0;
                }
                break;
            
            // TODO: preencher o próximo elemento vazio do vetor seja preenchido (item 2)
            case 2:
                for (int i = 0; i < lista.length; i++) {
                    if (lista[i] == 0) {
                        lista[i] = entrada.nextInt();
                        break;
                    }
                }
                break;
            
            // TODO: apagar um valor informado varrendo o vetor (item 3)
            case 3:
                System.out.println("opcao 3.");
                break;
            
            // TODO: percorrer o vetor e verificar se o valor informado é encontrado (item 4)
            case 4:
                System.out.println("opcao 4.");
                break;
            
            // TODO: identificar quantos valores significativos existem no vetor (item 5)
            case 5:
                System.out.println("opcao 5.");
                break;
            
            // TODO: identificar e exibir o maior valor do vetor e sua posição (item 6)
            case 6:
                System.out.println("opcao 6.");
                break;
            
            // TODO: identificar e exibir o menor valor do vetor e sua posição (item 7)
            case 7:
                System.out.println("opcao 7.");
                break;
            
            // TODO: exibir todos os elementos do vetor (item 8)
            case 8:
                System.out.println("opcao 8.");
                break;
            
            default:
                System.out.println("Digite uma opção válida.");
                break;
            
        }
    }
}
