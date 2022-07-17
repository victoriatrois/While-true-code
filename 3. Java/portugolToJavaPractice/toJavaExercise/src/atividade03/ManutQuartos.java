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
  Scanner in = new Scanner(System.in);
  
  String quarto[] = new String[20];
  int numQuarto;
    
  public void inserirLivreQuartos(){
    for (int i = 0; i < 20; i++) {
      quarto[i] = "livre";
    }
   }
    
    public void menu(){ //estático não precisa estanciar
        System.out.println("Bem vindo ao seu sistema de manutenção de ocupação de quartos.");
        System.out.println("Vamos começar?");
        System.out.println("Gestão dos quartos");
        System.out.println("1 - listar todos os quartos;");
        System.out.println("2 - marcar os quartos;");
        System.out.print("Digite aqui: ");
        
    }

    public void listaQuartos() {
      for (int i = 0; i < 20; i++) {
        System.out.println("Quarto número: " + i + ": " + quarto[i]);
      }
    }

    public void atualizaStatus(){
      System.out.println("Qual quarto você deseja ocupar?");
      numQuarto = in.nextInt();
      
      quarto[numQuarto] = "ocupado";
    }
    
    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
     ManutQuartos quarto = new ManutQuartos();
      int opcao;    
      char volta;
      quarto.inserirLivreQuartos();

    do{
      
        quarto.menu();
      opcao = in.nextInt();
        
        switch (opcao) {
        case 1:
          quarto.listaQuartos();
          
          break;
        
        case 2:
          quarto.atualizaStatus();
          
          break;
      
        default:
          break;
      }

   System.out.println("Você deseja continuar? \n's' para sim \n'n' para não");
   volta = in.next().charAt(0); //método para entrar CHAR

    } while (volta == 's') ;
    
    System.out.println("Obrigada por utilizar nosso gerenciador de hoteis");

    
    
  }
}