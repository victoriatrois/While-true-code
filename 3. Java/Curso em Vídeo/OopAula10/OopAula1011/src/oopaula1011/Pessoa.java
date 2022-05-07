/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopaula1011;

/**
 *
 * @author v3gc
 */
public abstract class Pessoa { //Pessoa é uma generalização de Visitante, Estudante, Bolsista, Professore, etc.
    //atributos
    private String nome;
    private int idade;
    private String sexo;
    
    //método construtor
    public Pessoa(){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    //métodos acessores
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    //método próprios
    public void fazAniver(){
        this.setIdade(this.getIdade()+1);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome: " + nome + ", idade: " + idade + ", sexo: " + sexo + '}';
    }
    
    
}
