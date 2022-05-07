/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopaula1011;

/**
 *
 * @author v3gc
 */
public class Funcionarie extends Pessoa {
    //atributos
    private String setor;
    private boolean trabalhando;
    
    //método construtor
    public Funcionarie(){
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
    
    //métodos acessores
    public String getSetor(){
        return setor;
    }
    
    public void setSetor(String setor){
        this.setor = setor;
    }
    
    public boolean isTrabalhando(){
        return trabalhando;
    }
    
    public void setTrabalhando(boolean trabalhando){
        this.trabalhando = trabalhando;
    }
    //métodos próprios
    public void mudaTrabalho(){
        this.setTrabalhando(false);
    }
}
