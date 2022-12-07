/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc06atividade05;

/**
 *
 * @author v3gc
 */
public class Bebida extends Produto {
    
    public Bebida() {
        this.setNomeProduto(this.getNomeProduto());
        this.setPrecoProduto(this.getPrecoProduto());
        this.setTamanhoProduto(this.getTamanhoProduto());
    }
    
    public Bebida(String nomeDaBebida, float precoDaBebida, String tamanhoDaBebida) {
        this.setNomeProduto(nomeDaBebida);
        this.setPrecoProduto(precoDaBebida);
        this.setTamanhoProduto(tamanhoDaBebida);
        
    }

}
