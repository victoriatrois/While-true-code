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
    // 1.e. manter privadas suas informações
    private double eixoX;
    private double eixoY;
    
    // 1.e. públicas suas operações
    // 1.d. conter um construtor que receba as duas coordenadas
    public Ponto2D(double eixoX, double eixoY) {
        this.eixoX = eixoX;
        this.eixoY = eixoY;
    }
    
    public Ponto2D() {
        
    }

    public double getEixoX() {
        return eixoX;
    }

    public void setEixoX(double eixoX) {
        this.eixoX = eixoX;
    }

    public double getEixoY() {
        return eixoY;
    }

    public void setEixoY(double eixoY) {
        this.eixoY = eixoY;
    }
    
    // 1.a. ser capaz de calcular e retornar a distância do objeto (A) até outro ponto informado (B).
    public Double calculaDistancia(Ponto2D pontoA, Ponto2D pontoB) {
        double distanciaEntreEixosX = pontoB.getEixoX() - pontoA.getEixoX();
        double distanciaEntreEixosY = pontoB.getEixoY() - pontoA.getEixoY();
        
        double distanciaEntreAB = Math.sqrt((Math.pow(distanciaEntreEixosX, 2)) + (Math.pow(distanciaEntreEixosY, 2)));
        
        return distanciaEntreAB;
    }
    
    // 1.b. ser capaz de calcular a multiplicação do ponto do objeto (A) por um valor double (k) informado.
    public void multiplicaCoordenada (double multiplicador) {
        double eixoXMultiplicado = multiplicador * this.eixoX;
        double eixoYMultiplicado = multiplicador * this.eixoY;

        System.out.println("X: " + eixoXMultiplicado + ", Y: " + eixoYMultiplicado + ".");

    }
    
    // 1.c. ser capaz de mostrar na tela as coordenadas do ponto no formato “(x, y)”.
    public void mostraCoordenadas() {
        System.out.println("(X:" + this.eixoX + " , Y:" + this.eixoY + ").");
        
    }
}