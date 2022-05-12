/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursoshumanos;

/**
 *
 * @author v3gc
 */
public class Funcionario {
    //atributos
    private long cpf;
    private double salario;
    private double desconto;
    
    //métodos construtores
    public Funcionario(long cpf, double salario, double desconto){
        this.cpf = cpf;
        this.salario = salario;
        this.desconto = desconto;
    }
    
    public Funcionario(){
        this.cpf = cpf;
        this.salario = salario;
        this.desconto = desconto;
    }
    
    //métodos acessores
    public void setCpf(long cpf){
        this.cpf = cpf;
    }
    
    public long getCpf(){
        return cpf;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setDesconto(double desconto){
        this.desconto = desconto;
    }
    
    public double getDesconto(){
        return desconto;
    }
    
    //métodos próprios
    public double calcularSalario(double salario, double desconto){
        double salarioLiq = salario - desconto;
        return salarioLiq;
    }
}
