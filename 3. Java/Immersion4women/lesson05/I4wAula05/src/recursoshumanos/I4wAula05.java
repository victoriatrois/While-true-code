/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursoshumanos;

/**
 *
 * @author v3gc
 */
public class I4wAula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setCpf(123456789); //long não é um bom tipo para CPF, faltaram 2 dígitos
        f1.setSalario(1209.75);
        f1.setDesconto(102.35);
        System.out.println("Salário líquido: " + f1.calcularSalario(1209.75, 102.35) + ".");
        
        Vendedor v1 = new Vendedor(123456789, 1620.50, 120.45, 50.55);
        System.out.println("Salário líquido " + v1.calcularSalario(1620.50, 120.45) + ".");
    }
    
}
