/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopaula03;

/**
 *
 * @author v3gc
 */
public class Caneta {
    //atributos -> privados
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    public boolean tampada;
    
    public void mostraInformacoes(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Está tampada? "+ this.tampada);
    }
    
    public void rabisca(){
        if(this.tampada == true){
            System.out.println("ERRO! Para rabiscar destampe a caneta.");
            
        } else{
            System.out.println("Estou rabiscando.");
        }
    }
    
    public void tampa(){
        this.tampada = true;
    }
    
    public void destampa(){
        this.tampada = false;
    }
}
