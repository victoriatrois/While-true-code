/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson03;

/**
 *
 * @author v3gc
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Arroz");
        produto.setValor(3.5f);
        produto.setQuantidade(10);
        
        System.out.println("Nome: "+ produto.getNome());
        System.out.println("Valor: "+ produto.getValor());
        System.out.println("Quantidade: "+ produto.getQuantidade());
    }
    
}
