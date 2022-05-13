/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package produtos;

/**
 *
 * @author v3gc
 */
public class I4wAula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computador comp1 = new Computador();
        System.out.println("Código de barras: " + comp1.autenticaCodigo(1023932830));
        System.out.println("Valor: " + comp1.calcularPreco(100, 20));
    }
    
}
