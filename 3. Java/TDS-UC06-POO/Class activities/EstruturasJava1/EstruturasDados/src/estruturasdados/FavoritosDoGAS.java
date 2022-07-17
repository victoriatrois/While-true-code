/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturasdados;

/**
 *
 * @author v3gc
 */
import java.util.ArrayList;
public class FavoritosDoGAS {
    ArrayList<String> sites= new ArrayList<>();
    
        public void mostraFavoritos(){
        System.out.println("Lista de favoritos");
        
        for (int indice=0;indice<sites.size();indice++){
            System.out.println(sites.get(indice));
        }
    }
    
    public void executa(){
        sites.add("Site 1: https://www.instagram.com/");
        sites.add("Site 2: https://senac.blackboard.com/webapps/login/");
        sites.add("Site 3: https://sig.ifrs.edu.br/sigaa/verTelaLogin.do");
        
        mostraFavoritos();
    }
}
