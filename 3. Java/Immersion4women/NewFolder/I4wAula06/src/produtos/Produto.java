/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtos;

/**
 *
 * @author v3gc
 */
public abstract class Produto{
    //atributos
    public double preco;
    public int quantidade;
    public long codigoDeBarras;
    
    //métodos acessores
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public long getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(long codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
    
    //método próprio
    public double calcularPreco(double preco, double lucro){
        double precoDeVenda = this.getPreco()/(1 - 0.2);
        return precoDeVenda;
    }
}
