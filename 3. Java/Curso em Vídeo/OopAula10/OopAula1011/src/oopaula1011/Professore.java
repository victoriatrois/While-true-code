/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopaula1011;

/**
 *
 * @author v3gc
 */
public class Professore extends Pessoa{
    //atributos
    private String especialidade;
    private float salario;
    
    //método construtor
    public Professore(){
        this.especialidade = especialidade;
        this.salario = salario;
    }
    
    //métodos acessores
    public String getEspecialidade(){
        return especialidade;
    }
    
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    
    public float getSalario(){
        return salario;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    //métodos próprios
    public void recebeAumento(float aumento){
        this.setSalario(this.getSalario() + aumento);
    }
}
