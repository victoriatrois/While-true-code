/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopaula13;

/**
 *
 * @author v3gc
 */
public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("Au, au, au, au!");
    }
    
    public void reagir(String frase){
        if (frase.equals("Quem quer comida") || frase.equals("Oi oi!")){
            System.out.println("Abanando o rabo e fazendo festa");
        } else {
            System.out.println("Rosnando");
        }
    }
        
    public void reagir(int hora, int min){
        if (hora < 12){
            System.out.println("Abanando o rabo");
        } else if (hora >= 18){
            System.out.println("Ignorando");
        } else {
            System.out.println("Abanando o rabo e fazendo festa");
        }
    }
    public void reagir(boolean dono)    {
        if (dono){
            System.out.println("Abanando o rabo e fazendo festa");
        } else {
            System.out.println("Rosnando e latindo");
            this.emitirSom();
        }
    }
    public void reagir(int idade, float peso){
        if (idade < 5){
            if (peso<10){
                System.out.println("Abanado o rabo");
            } else {
                System.out.println("Latindo");
                this.emitirSom();
            }
        } else {
            if (peso < 10){
                System.out.println("Rosnando");
            } else {
                System.out.println("Ignorando");
            }
        }
    }
}
