/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursoshumanos;

/**
 *
 * @author v3gc
 */
public class Vendedor extends Funcionario{
    //atributos
    private double comissao;
    
    //método construtor
    public Vendedor(long cpf, double salario, double desconto, double comissao){
        super();
        this.comissao = comissao;
    }
    
    //métodos acessores
    public void setComissao(double comissao){
        this.comissao = comissao;
    }
    
    public double getComissao(){
        return comissao;
    }
    
    //métodos próprios
    public double calcularSalario(){
        return super.calcularSalario(this.getSalario(),this.getDesconto()) + this.getComissao();
        
    }
}