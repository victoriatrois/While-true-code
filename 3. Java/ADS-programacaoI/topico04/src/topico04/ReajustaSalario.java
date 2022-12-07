/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topico04;

/**
 *
 * @author v3gc
 */
import java.util.Scanner;

public class ReajustaSalario {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float salario = entrada.nextFloat();
        float porcentagemDeReajuste = entrada.nextFloat();
        
        float reajuste = (salario / 100) * porcentagemDeReajuste;
        float salarioReajustado = salario + reajuste;
        
        System.out.printf("%.2f", salarioReajustado);
    }
}
