/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author v3gc
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    static void somar(int a, int b) {
        int soma = a+b;
        System.out.println("A soma é: " + soma);
    }
    
    static int subtrair(int a, int b) {
        int subtracao = a-b;
        return subtracao;
    }
    
    public static void main(String[] args) {
        System.out.println("Começou o programa");
        somar(5,2);
        int subtracao = subtrair(5,2);
        System.out.println("A subtração é: " + subtracao);
    }
}