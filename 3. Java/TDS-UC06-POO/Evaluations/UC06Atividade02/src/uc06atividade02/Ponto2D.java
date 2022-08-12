/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc06atividade02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author v3gc
 */
public class Ponto2D {
    private float[] eixosXY;
    private float eixoX;
    private float eixoY;
    

    public Ponto2D() {
        eixosXY = new float[2];
    }
    
    public Ponto2D(float eixoX, float eixoY) {
        eixosXY = new float[2];
        eixosXY[0] = this.eixoX;
        eixosXY[1] = this.eixoY;
        
    }

    public float[] getEixosXY() {
        return eixosXY;
        
    }

    public void setEixosXY(float[] eixoX) {
        this.eixosXY = eixoX;
    }

    public float getEixoX() {
        return eixoX;
    }

    public void setEixoX(float eixoX) {
        this.eixoX = eixoX;
    }

    public float getEixoY() {
        return eixoY;
    }

    public void setEixoY(float eixoY) {
        this.eixoY = eixoY;
    }
    
    public float calculaDistancia(Ponto2D coordenadaA, Ponto2D coordenadaB) {
        coordenadaA = new Ponto2D();
        coordenadaB = new Ponto2D();
        
        
        float distanciaEntreAB = Math.sqrt(Math.pow((coordenadaB[0] - coordenadaA[0]), 2)) + (Math.pow((coordenadaB[1] - coordenadaA[1]), 2));
        
        System.out.println("A distância entre os pontos A e B é de ");
        
        
        return distanciaEntreAB;
    }
    
    public void multiplicaCoordenadaA (double multiplicador) {
        
    }
    
    public void mostraCoordenadas() {
        Map<String, Ponto2D> levantamentoDeCoordenadas = new HashMap <>();
        
    }
}
