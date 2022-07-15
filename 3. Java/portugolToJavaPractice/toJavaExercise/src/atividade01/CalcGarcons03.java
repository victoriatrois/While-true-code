/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01;

import java.util.Scanner;

/*
 * Ainda em relação ao atendimento de eventos, o hotel necessita de uma funcionalidade que indique 
 * qual de seus dois auditórios é o mais adequado para um evento. O audotório Alfa conta com
 * 150 lugares e espaço para mais 70 cadeiras. O auditório Beta conta com 350 lugares, sem espaço
 * para mais cadeiras.
 * 
 * Desenvolva um algoritmo que, dado o número de convidados do evento, mostre na tela qual dos
 * auditórios é o mais adequado. No caso do auditório Alfa, calcule ainda quantas cadeiras adicionais
 * serão necessárias. Se o número de convidados for maior que 350, informe: "Máximo de convidados
 * excedidos".
 * 
 * Também verifique a entrada, mostrando a mensagem "valor inválido" caso seja informado um número de
 * convidados menor ou igual a zero.
 * 
 * @author v3gc
 */
public class CalcGarcons03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Quantos convidados seu evento receberá?");
        int numConvidados = in.nextInt();
        
        
        if (numConvidados < 1) {
            System.out.println("Valor inválido. Você precisa teer ao menos 01 convidado.");
            
        } else if (numConvidados > 350){
            System.out.println("Número máximo de convidados excedido");
            
        } else {
            if ((numConvidados < 150) || (numConvidados <= 230)) {
                    int numCadeirasExtras = numConvidados - 150;
                    System.out.println("Use o auditório Alfa e inclua " + numCadeirasExtras + " cadeiras extras.");
                    
            } else if ((numConvidados > 230) || (numConvidados <=350)){
                System.out.println("Use o auditório Beta.");
            }
        }
    }
 
}
