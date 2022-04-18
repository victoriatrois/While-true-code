/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopaula04;

/**
 *
 * @author v3gc
 */
public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String modelo, String cor, float ponta){//não tem tipo(nem mesmo void) e tem o mesmo nome da Classe, então é o método construtor.
        this.modelo = modelo;//OU this.setModelo(modelo);
        this.cor = cor;//OU this.setCor(cor);
        this.ponta = ponta;//OU this.setPonta(ponta);
        this.tampar();
        
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m ){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Ponta: "+ this.getPonta());
        System.out.println("Cor: "+ this.cor);
        System.out.println("Tampada:"+ this.tampada);
    }
}
