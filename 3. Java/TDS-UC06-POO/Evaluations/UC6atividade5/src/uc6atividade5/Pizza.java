
package uc6atividade5;

public class Pizza {

private String nome;
private String tipo;
private String ingredientes;
private Float tamanho;
private Float preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Float getTamanho() {
        return tamanho;
    }

    public void setTamanho(Float tamanho) {
        this.tamanho = tamanho;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

@Override
    public String toString() {
        return "---- Descrição da Pizza de " + this.getNome() + ": ----" + 
                "\nDoce ou Salgada? " + this.getTipo() + 
                "\nDescrição dos ingredientes: " + this.getIngredientes() +
                "\nTamanho: " + String.format("%.2f", this.getTamanho()) + "cm" + 
                "\nPreço: R$" + String.format("%.2f", this.getPreco());
                
    }

// Metodo para pesquisar itens em Pizza

//public float pesquisarPizzar (String pedidoPizza) {
//    float valorPizza = 0.0f;
//    Pizza pizza;
//    
//    for (int i = 0; < listagem_Pizza.size(); i++) {
//        if (listagem_Pizza.get(i).getNomePizza().contains(pedidoPizza)) {
//        valorPizza = listagem_Pizza.get(i).getPrecoPizza();
//        }
//    }
//    return valorPizza;
//}    

    

    
    
}
