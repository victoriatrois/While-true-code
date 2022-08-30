/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc06atividade05;

/**
 *
 * @author v3gc
 */
public abstract class Produto {
    private String nomeProduto;
    private float precoProduto;
    private String tamanhoProduto;
    
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getTamanhoProduto() {
        return tamanhoProduto;
    }

    public void setTamanhoProduto(String tamanhoProduto) {
        this.tamanhoProduto = tamanhoProduto;
    }
    
    public void mostraDados() {
        System.out.println(this.getNomeProduto());
        System.out.println(this.getPrecoProduto());
        System.out.println(this.getTamanhoProduto());
    }

}
