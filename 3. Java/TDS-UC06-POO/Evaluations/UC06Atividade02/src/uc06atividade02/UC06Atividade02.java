/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uc06atividade02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author v3gc
 */
public class UC06Atividade02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> distanciasTotais = new ArrayList();
        
        // 3.a. crie duas trajetorias
        for (int trajetoriaAtual = 1; trajetoriaAtual < 3; trajetoriaAtual++) {
            // 3.b. leia um numero N do usuário
            System.out.print("Quantos lugares você deseja informar na " + trajetoriaAtual + "ª trajetória ? ");
            int coordenadasDesejadas = Integer.parseInt(entrada.nextLine());
            
            if (coordenadasDesejadas < 1) {
                System.out.println("Entrada inválida. Digite um número maior que zero.");
                break;
        
            // 3.c. para cada trajetória, crie N pontos e leia as coordenadas x e y de cada ponto    
            } else {
                Trajetoria GPS = new Trajetoria();
                GPS.defineCoordenadas(coordenadasDesejadas);
                GPS.exibeDistanciaPontoAPonto();
                distanciasTotais.add(GPS.calculaDistanciaTotal());
                // 3.d. para cada trajetória, mostre na tela a distância total entre seu primeiro e último pontos e a rota do primeiro ao último ponto.
                GPS.exibeDistanciaPontoAPonto();
                distanciasTotais.add(GPS.calculaDistanciaTotal());
                System.out.println("\n");   
                
            }
        }
        
        // 3.e. multiplique a menor das duas trajetórias por 2 e mostre a nova distância total e a rota do primeiro ao último ponto
                Double rota1 = distanciasTotais.get(0);
                Double rota2 = distanciasTotais.get(1);
                
        
        if (rota1 < rota2) {
            System.out.println("A menor trajetória é a 1ª.");        
            System.out.println(String.format("%.2f", rota1));
        
        } else {
            System.out.println("A menor trajetória é a 2ª.");
            System.out.println(String.format("%.2f", rota2));
            }

    }
}