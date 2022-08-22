/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc06atividade02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author v3gc
 */
public class Trajetoria {
    Scanner entrada = new Scanner(System.in);
    
    private ArrayList<Ponto2D> coordenadas = new ArrayList();
    
    public ArrayList<Ponto2D> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(ArrayList<Ponto2D> coordenadas) {
        this.coordenadas = coordenadas;
    }
    
    public ArrayList<Ponto2D> defineCoordenadas(int numeroDeCordenadas) {
        for (int coordenadaAtual = 0; coordenadaAtual < numeroDeCordenadas; coordenadaAtual++) {
            System.out.println("Digite os eixos XY da " + (coordenadaAtual + 1) + "ª coordenada:");
            Ponto2D coordenadasDaTrajetoria = new Ponto2D();
            
            System.out.print("Eixo X: ");
            coordenadasDaTrajetoria.setEixoX(entrada.nextDouble());
            
            System.out.print("Eixo Y: ");
            coordenadasDaTrajetoria.setEixoY(entrada.nextDouble());
            
            coordenadas.add(coordenadasDaTrajetoria);
            
        }
        
        System.out.println("\n");
        
        return coordenadas;
    }
    
    public void exibePontos() {
        System.out.print("Lista de coordenadas:");
        
        for (int elementoAtual = 0; elementoAtual < coordenadas.size(); elementoAtual++) {
            
            System.out.print("(");
            System.out.print(String.format("%.2f", coordenadas.get(elementoAtual).getEixoX()));
            System.out.print(" , ");
            System.out.print(String.format("%.2f", coordenadas.get(elementoAtual).getEixoY()));
            System.out.print(")\n");
            
        }
    }
    public ArrayList<Double> calculaDistanciaPontoAPonto() {
        ArrayList<Double> distanciasEntrePontos = new ArrayList<>();
        
        for (int elementoAtual = 0; elementoAtual < coordenadas.size(); elementoAtual++) {
            if (elementoAtual == coordenadas.size() - 1) {
                break;
                
            } else {
                int elementoSeguinte = elementoAtual + 1;
                
                System.out.print("(");
                System.out.print(String.format("%.2f", coordenadas.get(elementoAtual).getEixoX()));
                System.out.print(" , ");
                System.out.print(String.format("%.2f", coordenadas.get(elementoAtual).getEixoY()));
                System.out.print(") a (" );
                System.out.print(String.format("%.2f", coordenadas.get(elementoSeguinte).getEixoX()));
                System.out.print(" , ");
                System.out.print(String.format("%.2f", coordenadas.get(elementoSeguinte).getEixoY()));
                System.out.print(") a - distância: " );

                System.out.println(String.format("%.2f", coordenadas.get(elementoAtual).calculaDistancia(coordenadas.get(elementoAtual), coordenadas.get(elementoSeguinte))));
                
            }
        }
        
        System.out.print("\n");
        
        return distanciasEntrePontos;
    }
    

    // 2.a. mostrar na tela a rota do primeiro ponto até o último da lista, dizendo a distância entre eles
    public void exibeDistanciaPontoAPonto() {
        for (int elementoAtual = 0; elementoAtual < coordenadas.size(); elementoAtual++) {
            if (elementoAtual == coordenadas.size() - 1) {
                break;
                
            } else {
                int elementoSeguinte = elementoAtual + 1;

                System.out.print("(");
                System.out.print(String.format("%.2f", coordenadas.get(elementoAtual).getEixoX()));
                System.out.print(" , ");
                System.out.print(String.format("%.2f", coordenadas.get(elementoAtual).getEixoY()));
                System.out.print(") a (" );
                System.out.print(String.format("%.2f", coordenadas.get(elementoSeguinte).getEixoX()));
                System.out.print(" , ");
                System.out.print(String.format("%.2f", coordenadas.get(elementoSeguinte).getEixoY()));
                System.out.print(") a - distância: " );

                System.out.println(String.format("%.2f", coordenadas.get(elementoAtual).calculaDistancia(coordenadas.get(elementoAtual), coordenadas.get(elementoSeguinte))));
                
            }
        }
        System.out.print("\n");
    }
    
    /* 2.b. ser capaz de calcular e retornar a distância total formada pelo caminho dos pontos armazenados em sua lista
     * a soma da distância do ponto 1 ao 2, do 2 ao 3, e assim por diante.*/
    public Double calculaDistanciaTotal() {
        Double distanciaTotal = 0.0;
        ArrayList<Double> distanciasEntrePontos = new ArrayList<>();
        
        for (int elementoAtual = 0; elementoAtual < coordenadas.size(); elementoAtual++) {
            if (elementoAtual == coordenadas.size() - 1) {
                break;
                
            } else {
                int elementoSeguinte = elementoAtual + 1;
                distanciasEntrePontos.add(coordenadas.get(elementoAtual).calculaDistancia(coordenadas.get(elementoAtual), coordenadas.get(elementoSeguinte)));
                
                distanciaTotal += distanciasEntrePontos.get(elementoAtual);
                
            }
        }
        
        System.out.println("Distância total:");
        System.out.println(String.format("%.2f", distanciaTotal));
        System.out.print("\n");
            
        return distanciaTotal;
        
    }
    
    // 2.c. ser capaz de redimensionar os pontos, multiplicando todos os pontos da lista por um dado valor double.
    public void redimensionaRota(double multiplicador) {
        for (int elementoAtual = 0; elementoAtual < coordenadas.size(); elementoAtual++) {
            if (elementoAtual == coordenadas.size() - 1) {
                break;
            
        } else {
                System.out.println((elementoAtual + 1) + "ª coordenada multiplicada por " + multiplicador);
                
                coordenadas.get(elementoAtual).multiplicaCoordenada(multiplicador);
            }
        }
    
        
    }
}
