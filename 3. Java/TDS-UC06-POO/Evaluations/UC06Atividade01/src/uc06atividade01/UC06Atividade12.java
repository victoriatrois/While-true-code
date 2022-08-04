/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uc06atividade01;

import java.util.Scanner;

/**
 * Escreva um programa Java que faça a troca de quartos entre dois hóspedes. O programa deve receber o nome de um cliente e a idade dele (este cliente,
 * a princípio, será hospedado no quarto A), depois receber o nome de outro cliente e a idade (este, se for mais jovem, ficará no quarto B, mas, se for
 * mais velho que o primeiro cliente, ficará no quarto A e o primeiro cliente ficará no quarto B). Além disso, se a pessoa mais velha for idosa (tem 60
 * anos ou mais), ela terá desconto de 40%. O programa deve mostrar, ao final, qual cliente ficou no quarto A e o desconto, se houver, e qual ficou no
 * quarto B.
 * 
 * Exemplo:
 *          [Entrada de dados]
 *          Maria (nome cliente)
 *          20 (idade cliente)
 *          Joao (nome cliente)
 *          60 (idade cliente)
 *          [Saída de dados]
 *          Quarto A: Joao com desconto de 40%; Quarto B:
 *          Maria
 * 
 * @author v3gc
 */
public class UC06Atividade12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o nome do primeiro hóspede: ");
        String hospede1 = entrada.nextLine();
        
        System.out.print("Digite a idade do primeiro hóspede: ");
        int idadeHospede1 = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Digite o nome do segundo hóspede: ");
        String hospede2 = entrada.nextLine();
        
        System.out.print("Digite a idade do segundo hóspede: ");
        int idadeHospede2 = entrada.nextInt();
        entrada.nextLine();
        
        if (idadeHospede1 > idadeHospede2) {
            if   ((idadeHospede1 >= 60) && (idadeHospede2 >= 60)) {
                System.out.print("Quarto A: " + hospede1 + " com 40% de desconto; ");
                System.out.println("Quarto B: " + hospede2 + " com 40% de desconto.");
                
            } else if (idadeHospede1 >= 60) {
                System.out.print("Quarto A: " + hospede1 + " com 40% de desconto; ");
                System.out.println("Quarto B: " + hospede2 + ".");
                
            }else {
            System.out.print("Quarto A: " + hospede1 + "; ");
            System.out.println("Quarto B: " + hospede2 + ".");
            }
            
        } else {
            if ((idadeHospede2 >= 60) && (idadeHospede1 >= 60)) {
                System.out.print("Quarto A: " + hospede2 + " com 40% de desconto; ");
                System.out.println("Quarto B: " + hospede1 + " com 40% de desconto.");
                
            } else if (idadeHospede2 >= 60) {
                System.out.print("Quarto A: " + hospede2 + " com 40% de desconto; ");
                System.out.println("Quarto B: " + hospede1 + ".");
                
            } else {
            System.out.print("Quarto A: " + hospede2 + "; ");
            System.out.println("Quarto B: " + hospede1 + ".");
            
            }
        }
    }
    
}
