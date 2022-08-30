/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc06atividade05;

import java.util.ArrayList;

/**
 *
 * @author v3gc
 */
public class Cardapio {
    private String nomePizzaria;
    private Pizza pizza;
    private ArrayList<Pizza> saboresDePizza = new ArrayList<>();
    private Bebida nomeDaBebida;
    private ArrayList<Bebida> bebidas = new ArrayList<>();

    public String getNomePizzaria() {
        return nomePizzaria;
    }

    public void setNomePizzaria(String nomePizzaria) {
        this.nomePizzaria = nomePizzaria;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public ArrayList<Pizza> getSaboresDePizza() {
        return saboresDePizza;
    }

    public void setSaboresDePizza(ArrayList<Pizza> saboresDePizza) {
        this.saboresDePizza = saboresDePizza;
    }

    public Bebida getNomeDaBebida() {
        return nomeDaBebida;
    }

    public void setNomeDaBebida(Bebida nomeDaBebida) {
        this.nomeDaBebida = nomeDaBebida;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }
    
    public void adicionaPizzaAoCardapio(Pizza pizza) {
     this.saboresDePizza.add(pizza);   
    }
    
    public void adicionaBebidaAoCardapio(Bebida bebida) {
        this.bebidas.add(bebida);
    }
    
    public void listaCardapio() {
        System.out.println("*** " + this.getNomePizzaria() + " ***");
        System.out.println(this.pizza.getNomeProduto());
        System.out.println(this.nomeDaBebida.getNomeProduto());
    }
}
