/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package i4waula08;

/**
 *
 * @author v3gc
 */
public class I4wAula08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto("arroz", 4.59, 1);
        Produto p3 = new Produto("feijão", 6.88, 1, 0.5);
        
        System.out.println("Status: " + p1.getNome());
        System.out.println("preço: " + p1.getValor());
        System.out.println("quantidade: " + p1.getQtd());
        System.out.println("desconto: " + p1.getValorDesconto());
        
        System.out.println("Status: " + p2.getNome());
        System.out.println("preço: " + p2.getValor());
        System.out.println("quantidade: " + p2.getQtd());
        System.out.println("desconto: " + p2.getValorDesconto());
        
        System.out.println("Status: " + p3.getNome());
        System.out.println("preço: " + p3.getValor());
        System.out.println("quantidade: " + p3.getQtd());
        System.out.println("desconto: " + p3.getValorDesconto());
    }
    
}
