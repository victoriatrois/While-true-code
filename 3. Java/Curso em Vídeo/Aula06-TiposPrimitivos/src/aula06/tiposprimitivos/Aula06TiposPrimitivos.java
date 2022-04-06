/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula06.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author v3gc
 */
public class Aula06TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*System.out.println("Sua nota é "+nota);
        System.out.printf("A sua nota é %.1f \n", nota); //o número depois do %. é o número de casas após a vírgula
        System.out.format("Só usar a sintaxe igual a do soutf");
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("Sua nota de %s é $.1f \n", nome, nota);*/
        
        /*int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);*/
        String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println(valor);
        
        String valor2 = "30.5";
        float idade2 = Float.parseFloat(valor2);
        System.out.println(valor2);
    }
    
}
