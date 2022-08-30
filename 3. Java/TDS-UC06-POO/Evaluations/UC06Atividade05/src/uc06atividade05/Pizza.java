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
public class Pizza extends Produto{
    private String ingrediente;
    private ArrayList listaDeIngredientes;
    private String categoria;

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }
    
    public ArrayList getListaDeIngredientes() {
        return listaDeIngredientes;
    }

    public void setListaDeIngredientes(String ingrediente) {
        this.listaDeIngredientes.add(ingrediente);
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public boolean ehSalgada(String categoria) {
        return this.getCategoria().equals("salgada");
    }

    public void listaIngrediantes() {
        System.out.println("*** Ingredientes da Pizza de " + this.getNomeProduto() + " ***");
        System.out.println(this.getListaDeIngredientes());
    }
}
