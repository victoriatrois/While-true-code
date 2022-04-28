package handsonact3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author v3gc
 */
public class NovoAluno {
    private String nome;
    private int codigo;
    private double nota1;
    private double nota2;
    
    public NovoAluno(){
        this.nome = nome;
        this.codigo = codigo;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    public double getNota1(){
        return this.nota1;
    }
    
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
    public double getNota2(){
        return this.nota2;
    }
    
    public double calcularMedia(){
        return (this.getNota1()+this.getNota2())/2;
    }
    
    public void estadoAtual(){
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Codigo: "+ this.getCodigo());
        System.out.println("Nota 1: "+ this.getNota1());
        System.out.println("Nota 2: "+ this.getNota2());
        System.out.println("Media: "+ calcularMedia());
    }
}
