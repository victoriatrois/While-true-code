package uc06atividade01;

import java.util.Scanner;

/* 
 * Escreva um algoritmo que receba o valor normal de uma diária e, em seguida, receba nomes de hóspedes e suas
 * idades. Caso o hóspede tenha idade inferior a 4 anos, ele não paga hospedagem, nesse caso, mostre na tela
 * “(Nome do hóspede) possui gratuidade”. Hóspede com mais de 80 anos paga metade, então mostre na tela 
 * “(Nome do hóspede) paga meia”. O usuário informará hóspedes até digitar a 		 *palavra “PARE”, que interrompe a
 *  entrada de dados. Ao fim, mostre a quantidade de gratuidades, a quantidade de meias hospedagens e o valor total,
 *  considerando todos os hóspedes informados.
 *      Exemplo
 *              Entrada: R$ 100 a diária
 *              Entrada: Adolfo, 50 anos
 *              Entrada: Murilo, 1 ano
 *              Saída: Murilo possui gratuidade
 *              Entrada: Joaquim, 82 anos
 *              Saída: Joaquim paga meia
 *              Entrada: PARE
 *              Saída: Total de hospedagens: R$ 150; 1 gratuidade(s); 1 meia(s)
 */

public class UC06Atividade13 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Qual o valor da diária?");
    float valorDiaria = in.nextFloat();
    String strValorDiaria = Float.toString(valorDiaria);

    if (valorDiaria <= 0 || strValorDiaria.indexOf(',') >= 0) {
      System.out.println("Valor inválido. Use ponto ao invés de vírgula e valores maiores que zero.");

    } else {
      String pare = "pare";
      String nome = " ";
        
      int contadorGratuidade = 0;
      int contadorMeia = 0;
      int contadorInteira = 0;

      while (! nome.equals(pare)) {
        System.out.println("Qual o nome do hóspede? (Para parar, digite: 'PARE'.");
        nome = in.next();
        nome = nome.toLowerCase();

        if (nome.equals(pare)) {
          break;

        } else {
          String nomeCap = nome.substring(0, 1).toUpperCase() + nome.substring(1);
          System.out.println("Qual a idade de " + nomeCap  + "?");
          int idade = in.nextInt();
                      
          if (idade < 4) {
            System.out.println(nomeCap + " possui gratuidade.");
            contadorGratuidade ++;

          } else if (idade >= 80) {
            System.out.println(nomeCap + " paga meia. (" + valorDiaria / 2 + ").");
            contadorMeia ++;

          } else {
            System.out.println(nomeCap + " paga inteira. (" + valorDiaria + ").");
            contadorInteira ++;

          }     
        }
      }

      float valorTotal = 0;

      if ((contadorInteira > 0) && (contadorMeia > 0) && (contadorGratuidade > 0)) {
        valorTotal = valorDiaria * (contadorInteira + (((float) contadorMeia) / 2));

        System.out.println("Valor total em diárias: " + valorTotal + ".");
        System.out.println("Sendo elas " + contadorInteira + " inteira(s)");
        System.out.println("           " + contadorMeia + " meia(s) e");
        System.out.println("           " + contadorGratuidade + " gratuíta(s).");

      } else if ((contadorInteira > 0) && (contadorMeia == 0) && (contadorGratuidade > 0)) {
        valorTotal = valorDiaria * contadorInteira;

        System.out.println("Valor total em diárias: " + valorTotal + ".");
        System.out.println("Sendo elas " + contadorInteira + " inteira(s) e");
        System.out.println("           " + contadorGratuidade + " gratuíta(s).");

      } else if ((contadorInteira > 0) && (contadorMeia > 0) && (contadorGratuidade == 0)) {
        valorTotal = valorDiaria * (contadorInteira + ((float) contadorMeia / 2));

        System.out.println("Valor total em diárias: " + valorTotal + ".");
        System.out.println("Sendo elas " + contadorInteira + " inteira(s) e");
        System.out.println("           " + contadorMeia + " meia(s).");

      } else if ((contadorInteira == 0) && (contadorMeia > 0) && (contadorGratuidade > 0)) {
        valorTotal = valorDiaria * ((float) contadorMeia/2);

        System.out.println("Valor total em diárias: " + valorTotal + ".");
        System.out.println("Sendo elas " + contadorMeia + " meia(s) e");
        System.out.println("           " + contadorGratuidade + " gratuíta(s).");

      } else {
        valorTotal = valorDiaria * contadorInteira;

        System.out.println("Valor total em diárias: " + valorTotal + ".");
        
      }
    }
  }
}
