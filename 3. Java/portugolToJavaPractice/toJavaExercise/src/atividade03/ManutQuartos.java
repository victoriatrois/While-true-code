package atividade03;

import java.util.Scanner;

/*
 * Considerando  que  o  hotel  tenha  20  quartos,  desenvolva  um  algoritmo para  marcar  a  ocupação  de  cada
 * quarto. Inicie  todos  os  quartos como desocupados. Depois, o usuário informará o número do quarto (de 1 a 20)
 * e, em seguida, se esse quarto está livre ou ocupado. Neste caso, se o quarto já estiver ocupado, mostre a mensagem
 * “Quarto já ocupado”. Questione se o usuário quer informar outro quarto e, dessa forma, repita a operação. Ao fim,
 * mostre o status de cada quarto.
 * 
 *       Exemplo:
 *               Entrada: 5
 *               Entrada: Ocupado
 *               Saída: Deseja continuar? (S/N)
 *               Entrada: “S”
 *               Entrada: 7
 *               Entrada: Ocupado
 *               Saída: Deseja continuar? (S/N)
 *               Entrada: “S”
 *               Entrada: 5
 *               Entrada: Ocupado
 *               Saída: Quarto já ocupado
 *               Saída: Deseja continuar? (S/N)
 *               Entrada: “S”
 *               Entrada: 20
 *               Entrada: Ocupado
 *               Saída: Deseja continuar? (S/N)
 *               Entrada: “N”
 *               Saída:  1-livre; 2-livre; 3-livre; 4-livre; 5-ocupado; 6-livre; 7-ocupado; 8-livre; 9-livre;
 *                       10-livre; 11-livre; 12-livre; 13-livre; 14-livre; 15-livre; 16-livre; 17-livre; 18-livre;
 *                       19-livre; 20-ocupado
 */

public class ManutQuartos {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    char continuar = ' ';
    String quarto[] = {"livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre"};
    
    do {
      System.out.println("Qual o numero do quarto?");
      int posicao = in.nextInt();

      if (posicao < 1 || posicao > 20) {
        System.out.println("Entrada inválida. Os quartos são numerados de 1 a 20.");

      } else {
        if (! quarto[posicao - 1].equals("livre")) {
          System.out.println("Este quarto está ocupado.");

        } else {
          System.out.println("Este quarto está ocupado ou livre?");
          quarto[posicao - 1] = in.next();
          quarto[posicao - 1] = quarto[posicao - 1].toLowerCase();
          
          System.out.println("Deseja continuar? Digite 'S' para sim e 'N' para não.");
          continuar = in.next().charAt(0);

        }
      }
      
    } while (continuar == 'S');

    System.out.println("Situação atual:");

    for (int i = 0; i < 19; i++) {
      System.out.print("Quarto " + (i + 1) + "- " + quarto[i] + "; ");
      
    }
    
    System.out.println("Quarto 20 - " + quarto[19] + "; ");
  }
}