/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc06atividade05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author v3gc
 */
public class Pizza extends Produto{
    Scanner entrada = new Scanner(System.in);
    
    private String ingrediente;
    private ArrayList listaDeIngredientes = new ArrayList<>();
    private String categoria;

    public Pizza(String saborDaPizza, float precoDaPizza, String tamanhoDaPizza, String categoria, int quantidadeDeIngredientes) {
        this.setNomeProduto(saborDaPizza);
        this.setPrecoProduto(precoDaPizza);
        this.setTamanhoProduto(tamanhoDaPizza);
        this.categoria = categoria;
        for (int i = 0; i < quantidadeDeIngredientes; i++) {
            System.out.println("Digite o " + (i+1) + "º ingrediente");
            listaDeIngredientes.add(entrada.nextInt());
        }
    }
    
    public Pizza () {
        this.setNomeProduto(this.getNomeProduto());
        this.setPrecoProduto(this.getPrecoProduto());
        this.setTamanhoProduto(this.getTamanhoProduto());
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
        this.listaDeIngredientes.add(ingrediente);
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

    public void listaIngredientes() {
        System.out.println("*** Ingredientes da Pizza de " + this.getNomeProduto() + " ***");
        System.out.println(this.getListaDeIngredientes());
    }
}
