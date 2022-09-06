
package uc6atividade5;

import java.util.List;

public class Cardapio {

String nomePizzaria;
List<Pizza> Pizzas;
List<Bebida> Bebidas;
                        
//                atualizaCardapio()
//                listaCardapio()

    public String getNomePizzaria() {
        return nomePizzaria;
    }

    public void setNomePizzaria(String nomePizzaria) {
        this.nomePizzaria = nomePizzaria;
    }

    public List<Pizza> getPizzas() {
        return Pizzas;
    }

    public void setPizzas(List<Pizza> Pizzas) {
        this.Pizzas = Pizzas;
    }

    public List<Bebida> getBebidas() {
        return Bebidas;
    }

    public void setBebidas(List<Bebida> Bebidas) {
        this.Bebidas = Bebidas;
    }
                        
    
}
