/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturasdados;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author v3gc
 */
public class Favoritos {
    //lista genérica (menos limitada que um vetor)
    List<Site> sites;
    
    public Favoritos(){
        sites = new ArrayList<>();
        
    }
    
    public void mostraFavoritos(){
        System.out.println("Lista de favoritos");
        
        for (Site s : sites){
            System.out.println(s.nome + " (" + s.url + ")");
        }
    }
    
    public void executa(){
        sites.add(new Site("Site 1", "https://www.instagram.com/"));
        sites.add(new Site("Site 2", "https://senac.blackboard.com/webapps/login/"));
        sites.add(new Site("Site 3", "https://sig.ifrs.edu.br/sigaa/verTelaLogin.do"));
        
        mostraFavoritos();
        //para remover um dos sites da lista usamoso método .remove(): sites.remove(1) remove o segundo item da lista.
    }
}
