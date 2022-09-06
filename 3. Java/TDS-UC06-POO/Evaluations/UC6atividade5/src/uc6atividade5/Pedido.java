
package uc6atividade5;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

private Integer mesa;
private Float total;

ArrayList<String> pizzasPedido = new ArrayList();
ArrayList<String> bebidasPedido = new ArrayList();


    public Integer getMesa() {
        return mesa;
    }

    public void setMesa(Integer mesa) {
        this.mesa = mesa;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public ArrayList<String> getPizzasPedido() {
        return pizzasPedido;
    }

    public void setPizzasPedido(ArrayList<String> pizzasPedido) {
        this.pizzasPedido = pizzasPedido;
    }

    public ArrayList<String> getBebidasPedido() {
        return bebidasPedido;
    }

    public void setBebidasPedido(ArrayList<String> bebidasPedido) {
        this.bebidasPedido = bebidasPedido;
    }

@Override
    public String toString() {
        return "---- Total do pedido da mesa " + this.getMesa() + ": ----" + 
                "\n Pizza " + this.getPizzasPedido() + 
                "\n Bebida " + this.getBebidasPedido() +  
                "\nPreço total: R$" + String.format("%.2f", this.getTotal());
    }

}    

//  Metodo para pesquisar itens em Pizza
//public float pesquisarPizzar (String pedidoPizza) {
//    float valorPizza = 0.0f;
//    Pizza pizza;
//    
//    for (int i = 0; i < lista_pizzas.size(); i++) {
//        if (lista_pizzas.get(i).getNomePizza().contains(pedidoPizza)) {
//        valorPizza = lista_pizzas.get(i).getPrecoPizza();
//        }
//    }
//    return valorPizza;
//    
//}
