/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc06atividade05;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;


/**
 *
 * @author v3gc
 */
public class Pedido {
    public static String removeDiacriticos(String s) {
	    s = Normalizer.normalize(s, Normalizer.Form.NFD);
	    s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
	    return s;
    }
    Scanner entrada = new Scanner(System.in);
    
    Queue<String> produtosPedidos;
    private int numeroDaMesa;
    private String saborDePizza;
    
    public Pedido() {
        produtosPedidos = new LinkedList<>();
    }
    
    public int getNumeroDaMesa() {
        return numeroDaMesa;
    }

    public void setNumeroDaMesa(int numeroDaMesa) {
        this.numeroDaMesa = numeroDaMesa;
    }
    
    public String getSaborDePizza() {
        return saborDePizza;
    }
    
    public void setSaborDePizza(String saborDePizza) {
        this.saborDePizza = saborDePizza;
    }
    
    public void criarPedido(int numeroDaMesa, String saborDePizza, int quantidadeDaPizza, String bebidaEscolhida, int quantidadeDaBebida) {
        String adicionaNovoItem = "sim";
        
        do {
            if (adicionaNovoItem.equals("nao")) {
                break;
                
            } else {
                System.out.print("Digite o número da sua mesa: ");
                while (this.getNumeroDaMesa() < 1 && this.getNumeroDaMesa() > 50) {
                    System.out.println("Número inválido. Temos mesas numeradas de 1 a 50.");
                }
                
                System.out.print("Digite o sabor da pizza desejada: ");
                String saborDePizzaEscolhido = entrada.nextLine();
                
                System.out.print("Quantas pizzas desse sabor você deseja? ");
                int quantidadeDePizzasDesseSabor = entrada.nextInt();
                
                System.out.println("");
                





            }
        } while(adicionaNovoItem.equals("sim"));
    }

    //conferir a partir daqui
    private static int numeroDoPedido = 0;
    
    private int quantidadeDoItem;
    private ArrayList<Produto> itemEscolhido = new ArrayList<>();
    private float valorTotal;
    
    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setNumeroDoPedido(int numeroDoPedido) {
        incrementaNumeroDoPedido();
        Pedido.numeroDoPedido = numeroDoPedido;
    }
    
    public int getQuantidadeDoItem() {
        return quantidadeDoItem;
    }

    public void setQuantidadeDoItem(int quantidadeDoItem) {
        this.quantidadeDoItem = quantidadeDoItem;
    }

    public ArrayList<Produto> getItemEscolhido() {
        return itemEscolhido;
    }

    public void setItemEscolhido(ArrayList<Produto> itemEscolhido) {
        this.itemEscolhido = itemEscolhido;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void incrementaNumeroDoPedido() {
        numeroDoPedido++;
    }

    @Override
    public String toString() {
        return "Pedido{" + "entrada=" + entrada + ", numeroDaMesa=" + numeroDaMesa + ", quantidadeDoItem=" + quantidadeDoItem + ", itemEscolhido=" + itemEscolhido + ", valorTotal=" + valorTotal + '}';
    }
}
