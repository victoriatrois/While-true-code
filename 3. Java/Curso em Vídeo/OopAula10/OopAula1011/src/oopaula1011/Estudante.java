/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopaula1011;

/**
 *
 * @author v3gc
 */
public class Estudante extends Pessoa{ //Herança para diferença: Estudante tem tudo que Pessoa tem mais seus atributos e métodos próprios.
                                        //Estudante é uma especialização de Pessoa.
    //atributos
    private int matricula;
    private String curso;
    
    //método construtor
    public Estudante(){
        this.matricula = matricula;
        this.curso = curso;
    }
    
    //métodos acessores
    public int getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    //métodos próprios
    public void cancelaMatricula(){
        System.out.println("Matrícula de " + this.getNome() + " cancelada.");
    }
    
    public void pagarMensalidade(){
        System.out.println("Mensalidade de " + this.getNome() + " paga.");
    }
}
