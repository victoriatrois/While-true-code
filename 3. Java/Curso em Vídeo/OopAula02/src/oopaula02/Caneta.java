/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopaula02;

/**
 *
 * @author v3gc
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    public void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Está tampada? "+ this.tampada);
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Para rabiscar destampe a caneta.");
        } else{
            System.out.println("Estou rabiscando.");
        }
    }
    
    protected void tampar(){
        this.tampada = true;
    }
    
    protected void destampar(){
        this.tampada = false;
    }
}
