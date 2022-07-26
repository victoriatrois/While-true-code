/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturasdados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author v3gc
 */
public class Historico {
    Queue<Site> sites;
    
    public Historico(){
        sites = new LinkedList<>();
    }
    
    public void executa(){
        Scanner entrada = new Scanner(System.in);
        String continuar = "s";
        
        while (continuar.equals("s")){
            Site novoSite = new Site();
            System.out.print("Nome: ");
            novoSite.nome = entrada.nextLine();
            
            System.out.print("URL: ");
            novoSite.url = entrada.nextLine();
            
            sites.add(novoSite);
            
            if (sites.size() > 3) {
                Site siteRemovido = sites.remove();
                System.out.println("Site " + siteRemovido.url + "foi removido.");
            }
            
            System.out.println("Continuar: s/n");
            continuar = entrada.nextLine();
        }
        
    }
}
