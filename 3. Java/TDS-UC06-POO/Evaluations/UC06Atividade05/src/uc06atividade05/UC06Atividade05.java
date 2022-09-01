/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uc06atividade05;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author v3gc
 */
public class UC06Atividade05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Cardapio cardapio = new Cardapio();
        Pedido pedido = new Pedido();
        Stack<Pedido> pedidos = new Stack<>();
        
        int perfilUsuario;
        
        do {
            System.out.println("Digite a opção que condiz com o seu perfil:");
            System.out.println("1 - Gerente;\n2 - Cliente;");
            System.out.println("Digite 3 para sair.");
            perfilUsuario = entrada.nextInt();
            entrada.nextLine();
            if (perfilUsuario < 1 || perfilUsuario > 3) {
                System.out.println("Entrada inválida. Digite 1 para Gerente e 2 para Garçom ou Cliente.");
            } else {
                switch (perfilUsuario) {
                    case 1:
                        System.out.println("Digite 1 para cadastrar uma nova pizza, 2 para cadastrar uma nova bebida e 3 para sair.");
                        int escolhaGerente = entrada.nextInt();
                        entrada.nextLine();
                        
                        if (escolhaGerente < 1 || escolhaGerente > 3) {
                            System.out.println("Entrada inválida. Digite 1 para cadastrar uma nova pizza, 2 para cadastrar uma nova bebida e 3 para voltar.");
                            
                        } else {
                            switch (escolhaGerente) {
                                case 1 -> {
                                    Pizza pizza = new Pizza();
                                    
                                    System.out.print("Digite o nome do sabor: ");
                                    String nomeSabor = entrada.nextLine();
                                    pizza.setNomeProduto(nomeSabor);
                                    
                                    System.out.print("Digite o valor dessa pizza: ");
                                    Float precoPizza = entrada.nextFloat();
                                    entrada.nextLine();
                                    pizza.setPrecoProduto(precoPizza);
                                    
                                    System.out.print("Digite o tamanho dessa pizza: ");
                                    String tamanhoPizza = entrada.nextLine();
                                    pizza.setTamanhoProduto(tamanhoPizza);
                                    
                                    System.out.print("Quantos ingredientes essa pizza tem? ");
                                    int numeroDeIngredientes = entrada.nextInt();
                                    entrada.nextLine();
                                    
                                    for (int ingredienteAtual = 0; ingredienteAtual < numeroDeIngredientes; ingredienteAtual++) {
                                        System.out.println("Digite o ingrediente: ");
                                        String ingrediente = entrada.nextLine();
                                        pizza.setIngrediente(ingrediente);
                                    }
                                    
                                    System.out.print("Digite se a pizza é salgada ou doce: ");
                                    String categoria = entrada.nextLine();
                                    pizza.setCategoria(categoria);
                                    
                                    cardapio.setPizza(pizza);
                                    cardapio.adicionaPizzaAoCardapio(pizza);
                                }
                                    
                                case 2 -> {
                                    Bebida bebida = new Bebida();
                                    
                                    System.out.print("Digite o nome da bebida: ");
                                    String nomeBebida = entrada.nextLine();
                                    bebida.setNomeProduto(nomeBebida);
                                    
                                    System.out.print("Digite o valor dessa bebida: ");
                                    Float precoBebida = entrada.nextFloat();
                                    entrada.nextLine();
                                    bebida.setPrecoProduto(precoBebida);
                                    
                                    System.out.print("Digite o tamanho dessa bebida: ");
                                    String tamanhoBebida = entrada.nextLine();
                                    bebida.setTamanhoProduto(tamanhoBebida);
                                    
                                    cardapio.setNomeDaBebida(bebida);
                                    cardapio.adicionaBebidaAoCardapio(bebida);
                                }
                                    
                                case 3 -> {
                                    break;
                                }
                            }
                        }
                        break;
                        
                    case 2:
                        //para clientes
                        
                        System.out.println("Digite 1 para cardápio, 2 para pedidos, e 3 para voltar.");
                        int escolhaCliente = entrada.nextInt();
                        entrada.nextLine();
                        
                        if (escolhaCliente < 1 || escolhaCliente > 3) {
                            System.out.println("Entrada inválida. Digite 1 para cardápio, 2 para pedidos, e 3 para voltar.");
                            
                        } else {
                            switch (escolhaCliente) {
                                
                                case 1 -> {//c. listar o cardápio
                                    break;
                                }
                                
                                case 2 -> {//d. criar pedido e mostrar dados do pedido
                                    break;
                                }
                                
                                case 3 -> {//e. efetuar pedido
                                    break;
                                }
                            }
                        }         
                            
                        break;
                        
                        //criar case extra para cozinha?
                        
                        
                    case 3:
                        System.out.println("Programa encerrado.");
                        break;
                        
                    default:
                        break;
                }
            }
        } while (perfilUsuario == 1 || perfilUsuario == 2);
    }
    
}
