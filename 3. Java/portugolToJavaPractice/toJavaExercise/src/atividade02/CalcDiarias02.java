package atividade02;

import java.util.Scanner;

/*
 * O hotel conta, em temporadas baixas, com uma promoção em que, quanto mais dias o hóspede permanece, maior desconto
 * ele recebe. Se o hóspede ficar apenas um dia, a hospedagem terá preço cheio; a partir do segundo dia, aplicam-se 
 * 10% de desconto e, a cada dia mais, adicionam-se 10% de desconto, chegando ao máximo de 50% de desconto. Expanda o 
 * algoritmo anterior e, a partir da informação validada de valor de diária e de dias de hospedagem, escreva na tela 
 * uma lista informativa com o valor da diária dia a dia, aplicando seus devidos descontos.
 * 
 *       Exemplo
 *       Entradas: R$ 150 a diária; 7 diárias
 *       Saídas: Dia 1: R$ 150
 *               Dia 2: R$ 135
 *               Dia 3: R$ 120
 *               Dia 4: R$ 105
 *               Dia 5: R$ 90
 *               Dia 6: R$ 75
 *               Dia 7: R$ 75
 */
public class CalcDiarias02 {
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
      
      float desconto = valorDiaria * 10 / 100;
      
      if (numDiarias > 0){
        System.out.println("Sua estadia ficará:");
        System.out.println("Dia 1: R$" + valorDiaria + ".");

        for (int dias = 2; dias < numDiarias; dias++) {
          valorDiaria -= desconto;
          System.out.println("Dia " + dias + ": R$" + valorDiaria +".");
          
        }
        if (numDiarias > 6) {
          for (int dias = 7; dias <= numDiarias; dias++){
            System.out.println(("Dia " + dias + ": R$" + valorDiaria +"."));
          }
        }
      }
    }
  }  
}
