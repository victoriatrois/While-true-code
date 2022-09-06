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
public class Pedido {
    private int numeroDaMesa;
    private String saborEscolhido;
    private String bebidaEscolhida;
    private ArrayList<Produto> itemPedido;
    
    private float valorASerPago;

    public int getNumeroDaMesa() {
        return numeroDaMesa;
    }

    public void setNumeroDaMesa(int numeroDaMesa) {
        this.numeroDaMesa = numeroDaMesa;
    }

    public ArrayList<Produto> getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(ArrayList<Produto> itemPedido) {
        this.itemPedido = itemPedido;
    }
    
    public float getValorASerPago() {
        return valorASerPago;
    }
    
    public void adicionaProdutoAoPedido(Produto produto) {
     this.itemPedido.add(produto);
    }

    public void setValorASerPago(float valorASerPago) {
        this.valorASerPago = valorASerPago;
    }
    
    public float fechaPedido() {
        for (Produto cadaItemPedido : itemPedido) {
            valorASerPago += cadaItemPedido.getPrecoProduto();
        }
        return valorASerPago;
    }

    public String getSaborEscolhido() {
        return saborEscolhido;
    }

    public void setSaborEscolhido(String saborEscolhido) {
        this.saborEscolhido = saborEscolhido;
    }

    public String getBebidaEscolhida() {
        return bebidaEscolhida;
    }

    public void setBebidaEscolhida(String bebidaEscolhida) {
        this.bebidaEscolhida = bebidaEscolhida;
    }

    
}
