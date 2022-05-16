/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package i4waula07;

/**
 *
 * @author v3gc
 */
public class I4wAula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario vendedor = new Vendedor(123456789, 1620.50, 120.45, 50.55);
        System.out.println("Salário líquido: " + vendedor.calcularSalario(1620.50, 120.45) + ".");
        Funcionario diarista = new Diarista(234657865, 8, 160);
        System.out.println("Salário liquido: " + diarista.getSalario() + ".");
    }
    
}
