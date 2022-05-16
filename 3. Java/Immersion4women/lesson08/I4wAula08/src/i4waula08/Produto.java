/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package i4waula08;

/**
 *
 * @author v3gc
 */
public class Produto {
    private String nome;
    private double valor;
    private int qtd;
    private double valorDesconto;
    
    public Produto(String nome, double valor, int qtd){
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
    }
    
    public Produto(){
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
    }
    
    public Produto(String nome, double valor, int qtd, double valorDesconto){
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
        this.valorDesconto = valorDesconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
}