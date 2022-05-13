/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package i4waula07;

/**
 *
 * @author v3gc
 */
public class Diarista extends Funcionario{
    //atributos
    private double valorHora;
    private double quantidadeDeHoras;
    
    //métodos construtores
    public Diarista(){
        this.setSalario(valorHora * quantidadeDeHoras);
        this.setDesconto(0.0);
        this.valorHora = valorHora;
        this.quantidadeDeHoras = quantidadeDeHoras;
    }
    
    public Diarista(long cpf, double valorHora, double quantidadeDeHoras){
        this.setSalario(valorHora * quantidadeDeHoras);
        this.setDesconto(0.0);
        this.valorHora = valorHora;
        this.quantidadeDeHoras = quantidadeDeHoras;
    }

    //métodos acessores
    public Diarista(double valorHora, double quantidadeDeHoras) {
        this.valorHora = valorHora;
        this.quantidadeDeHoras = quantidadeDeHoras;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double getValorHora(){
        return valorHora;
    }
    
    public void setQuantidadeDeHoras(double quantidadeDeHoras){
        this.quantidadeDeHoras = quantidadeDeHoras;
    }
    
    public double getQuantidadeDeHoras(){
        return quantidadeDeHoras;
    }
    
    //métodos próprios
    public double calcularSalario(){
        double salario = this.valorHora * quantidadeDeHoras;
        return salario;
    }
}