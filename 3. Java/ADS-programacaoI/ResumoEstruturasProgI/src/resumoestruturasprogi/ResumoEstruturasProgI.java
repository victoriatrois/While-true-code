/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resumoestruturasprogi;

import java.util.Scanner;

/**
 *
 * @author v3gc
 */
public class ResumoEstruturasProgI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada;
        
        String afazeresTrabalho[][] = new String[6][6];
        
        //String afazeresTrabalho[][] = {
        //                                {" ", "Segunda", "Terça", "Quarta", "Quinta", "Sexta"},
        //                                {"manhã", "reunião", "", "", "", "trabalhar presencial"},
        //                                {"tarde", "", "entregar tarefa 34252", "", "", "trabalhar presencial"}
        //                              };

        
        String nomes[] = new String[3];
        
        entrada = new Scanner(System.in);
        
        int primeiroNumero;
        
        primeiroNumero = entrada.nextInt();
        int segundoNumero = 9;
        
        String nome = "Pedro";
        
        System.out.println(afazeresTrabalho);
        
       while (primeiroNumero < segundoNumero) {
           System.out.println(primeiroNumero + "/" + segundoNumero);
           segundoNumero--;
       }
       
       do {
           System.out.println(primeiroNumero + "/" + segundoNumero);
           segundoNumero--;
       } while (primeiroNumero < segundoNumero);
       
       
       for (int i = 0; i < segundoNumero; i++) {
           System.out.println("i é : " + i);
           System.out.println("segundo número: " + segundoNumero);
       }
    
    }
}
