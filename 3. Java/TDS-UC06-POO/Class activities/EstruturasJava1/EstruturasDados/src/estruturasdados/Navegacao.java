/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturasdados;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author v3gc
 */
public class Navegacao {
    Stack<Site> sites;
    
    public Navegacao() {
        sites = new Stack<Site>();
    }
    
    public void executa() {
        Scanner entrada = new Scanner(System.in);
        String opcao = "";
        
        while(! opcao.equals("x")){
            System.out.println("Digite [n] para digitar uma nova URL; [v] para voltar e [x] para sair:");
            opcao = entrada.nextLine();
            
            if (! opcao.equals("n") && ! opcao.equals("v") && ! opcao.equals("x")) {
                System.out.println("Entrada inválida. Digite \"n\", \"v\", ou \"x\".");
                
            } else {
                switch (opcao) {
                    case "n":
                        Site novoSite = new Site();
                        System.out.print("Nome: ");
                        novoSite.nome = entrada.nextLine();

                        System.out.print("URL: ");
                        novoSite.url = entrada.next();

                        sites.push(novoSite);

                        System.out.println("Acessando " + novoSite.url + "...");

                        break;

                    case "v":
                        if (! sites.empty()){
                            Site siteRetirado = sites.pop();

                            System.out.println("Saindo de: " + siteRetirado.url + "...");
                            
                            if (! sites.empty()) {
                                Site siteAtual = sites.peek();
                                System.out.println("Voltando para: " + siteAtual.url + "...");
                            }
                            
                            break;
                        } else {
                            System.out.println("Histórico vazio.");
                        }
                }
            }
        }
        
    }
}
