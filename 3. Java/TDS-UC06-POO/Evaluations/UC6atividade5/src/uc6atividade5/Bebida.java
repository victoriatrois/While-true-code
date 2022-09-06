
package uc6atividade5;

public class Bebida {

private String nome;
private Float quantidade;
private Float preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

@Override
    public String toString() {
        return "---- Descrição da Bebida " + this.getNome() + ": ----" + 
                "\nTamanho: " + String.format("%.2f", this.getQuantidade()) + "ml" + 
                "\nPreço: R$" + String.format("%.2f", this.getPreco());
    }    

}
