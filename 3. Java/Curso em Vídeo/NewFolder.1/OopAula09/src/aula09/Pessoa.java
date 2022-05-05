/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09;

/**
 *
 * @author v3gc
 */
public class Pessoa {
    //atributos
    private String nome;
    private int idade;
    private String sexo;
    
    //método construtor
    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    //métodos acessores
    private String getNome(){
        return nome;
    }
    private void setNome(String nome){
        this.nome = nome;
    }
    
    private int getIdade(){
        return idade;
    }
    private void setIdade(int idade){
        this.idade = idade;
    }
    
    private String getSexo(){
        return sexo;
    }
    private void setSexo (String sexo){
        this.sexo = sexo;
    }
    
    //métodos especiais
    public void fazerAniver(){
        this.setIdade(this.getIdade()+ 1);
        //guanabara fez this.idade++;
    }
}
