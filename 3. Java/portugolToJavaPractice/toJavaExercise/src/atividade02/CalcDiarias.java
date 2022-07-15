package atividade02;

import java.util.Scanner;
import java.text.*;

/* Desenvolva um algoritmo que receba o valor de uma diária no hotel e a quantidade de dias de hospedagem. Valide essas
 * informações para que o valor da diária não seja negativo e que a quantidade de dias não seja negativa nem maior que 30.
 * Em caso de informação inválida, escreva na tela uma mensagem informando ao usuário e solicite novo valor. Ao final de tudo,
 * escreva “Fim do programa”.
 *   Exemplo:
 *      Entrada: R$ 100 a diária
 *      Saída: Valor inválido
 *      Entrada: R$ 100 a diária
 *      Entrada: 30 dias
 *      Saída: Fim do programa
 */

public class CalcDiarias {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Quantos dias você ficará hospedado?");
    int numDiarias = in.nextInt();

    if (numDiarias < 1 || numDiarias > 31) {
      System.out.println("Valor inválido. Forneça um valor 1 e 30.");
      System.out.println("Fim do programa.");
    } else {
      System.out.println("Qual o valor da diária?");
      float valorDiaria = in.nextFloat();
      
      float total = numDiarias*valorDiaria;

      System.out.printf("Uma estadia de " + numDiarias + " dias a " + valorDiaria + " reais, dará um total de " + total + " reais.");
    }
  }
}
