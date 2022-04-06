/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplometodos;

/**
 *
 * @author v3gc
 */
public class ExemploMetodos {

    /**
     * @param args the command line arguments
     */
    public static double somar(double valor_1, double valor_2) {
        double resultado = valor_1+valor_2;
        return resultado;
    }
    public static double subtrair(double valor_1, double valor_2) {
        double resultado = valor_1-valor_2;
        return resultado;
    }
    public static double multiplicar(double valor_1, double valor_2) {
        double resultado = valor_1*valor_2;
        return resultado;
    }
    public static double dividir(double valor_1, double valor_2) {
        double resultado = valor_1/valor_2;
        return resultado;
    }
    
    public static void main(String[] args) {
        System.out.println(somar(2.6,4.7));
        System.out.println(subtrair(5,5));
        System.out.println(multiplicar(2,3));
        System.out.println(dividir(10,2));
    }
    
}
