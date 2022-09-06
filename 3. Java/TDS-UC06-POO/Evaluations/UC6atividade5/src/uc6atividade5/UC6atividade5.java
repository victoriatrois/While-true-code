
package uc6atividade5;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class UC6atividade5 {
    
// método para remover capslock, espaço, e similares:    
public static String removeCaps(String s) {
    s = Normalizer.normalize(s, Normalizer.Form.NFD);
    s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    return s;
    }

 
  
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int menu = 1;
    
System.out.print("Iniciando o sistema.. \nInforme o nome da Pizzaria: \n");
String pizzaria = input.nextLine();
ArrayList<Pizza> lista_pizzas = new ArrayList();
ArrayList<Bebida> lista_bebidas = new ArrayList();
ArrayList<Pedido> lista_pedidos = new ArrayList();





while (menu != 7) {
        System.out.print("""
                 \n Selecione qual função você deseja:
                  1- Cadastrar nova pizza no cardápio
                  2- Cadastrar nova bebida no cardápio
                  3- Listar o cardápio
                  4- Criar pedido e mostrar dados do pedido
                  5- Cadastrar pedido na cozinha
                  6- Próximo pedido a ser preparado e levado ao cliente  
                  7- Encerrar aplicação
                 """);
menu = input.nextInt();

switch (menu) {
  
//    Cardapio cardapio = new cardapio();
//        LinkedList<Pedido Cozinha = new LinkedList<>();
//        new Pedido(cardapio.getPizzas(), cardapio.getBebidas());
//        pedido.preenchePedido();
//        pedido.mostraPedido();
//        Cozinha.add(pedido)
//    cardapio.listaCardapio();
//        cardapio.atualizaCardapio();
    
// Cadastrar nova pizza no cardápio
case 1:    

//        cardapio.atualizaCardapio();
Pizza pizza = new Pizza();
lista_pizzas.add(pizza);
    
    System.out.print("Qual o nome / sabor da pizza nova?\n");
    String bufferLine = removeCaps(input.nextLine().toLowerCase());
    String nome = removeCaps(input.nextLine().toLowerCase());
    pizza.setNome(nome);

    System.out.print("É uma pizza doce ou salgada?\n");
    
    String tipo = input.nextLine();
    pizza.setTipo(tipo);
    
    System.out.print("Quais os ingredientes desta pizza? Forneça uma pequena descrição: \n");
    
    String ingredientes = input.nextLine();
    pizza.setIngredientes(ingredientes);
    
    System.out.print("Informe o tamanho da pizza, em centímetros: \nCm ");
    Float tamanho = input.nextFloat();
    pizza.setTamanho(tamanho);
    
    System.out.print("Informe o valor da pizza: \nR$ ");
    Float preco = input.nextFloat();
    pizza.setPreco(preco);
    
    System.out.print("Cardapio atualizado!!\n");
    
break;    

// Cadastrar nova bebida no cardápio
case 2:    

Bebida bebida = new Bebida();
lista_bebidas.add(bebida);

    System.out.print("Qual o nome da bebida nova?\n");
    bufferLine = removeCaps(input.nextLine().toLowerCase());
    nome = removeCaps(input.nextLine().toLowerCase());
    bebida.setNome(nome);
    
    System.out.print("Informe quantos ml tem no copo da bebida: \nMl ");
    Float quantidade = input.nextFloat();
    bebida.setQuantidade(quantidade);
    
    System.out.print("Informe o valor da bebida: \nR$ ");
    preco = input.nextFloat();
    bebida.setPreco(preco);
    
break;    

// Listar o cardápio
case 3:    

System.out.print("Carregando o cardápio..\n");
System.out.print("---- Cardápido da Pizzaria " + pizzaria + " ----\n");

System.out.print("------ Pizzas ------\n");
for (Pizza pizzas1 : lista_pizzas) {
        System.out.println(pizzas1.toString());
        }

System.out.print("------ Bebidas ------\n");

for (Bebida bebidas1 : lista_bebidas) {
        System.out.println(bebidas1.toString());
        }

break;    

// Criar pedido e mostrar dados do pedido
case 4:    

Pedido pedido = new Pedido();
lista_pedidos.add(pedido);

System.out.print("Qual o número da mesa para este pedido?\n");
Integer mesa = input.nextInt();
pedido.setMesa(mesa);
Float TotalPedido = 0f;
Float valorPizza = 0f;
Float valorPizzaTotal = 0f;
Float valorBebida = 0f;
Float valorBebidaTotal = 0f;
String tipoPizza;
String TipoBebida;
String opcaoPizza = "sim";
String opcaoBebida = "sim";

// Loop se o cliente quiser mais de uma pizza:
while (opcaoPizza != "não") {
System.out.print("Deseja adicionar uma pizza? Digite SIM ou NÃO: \n");
bufferLine = removeCaps(input.nextLine().toLowerCase());
opcaoPizza = removeCaps(input.nextLine().toLowerCase());
            
    if ((! opcaoPizza.equals("nao")) && (! opcaoPizza.equals("sim"))) {
        System.out.println("Entrada inválida. Digite SIM ou NÃO.\n");
                
        } else {
            if (opcaoPizza.equals("nao")) {
            break;
            } else {
            System.out.print("Qual o sabor de pizza você deseja? \n");
            String pedidoPizza = removeCaps(input.nextLine().toLowerCase());
    
            pedido.pizzasPedido.add(pedidoPizza);
            
            // calculo do valor
            for (int i = 0; i < lista_pizzas.size(); i++) {
            if (lista_pizzas.get(i).getNome().contains(pedidoPizza)) {
            valorPizza = lista_pizzas.get(i).getPreco();
                }
            valorPizzaTotal = valorPizzaTotal + valorPizza;
                }
            }
        }
    }

// Loop se o cliente quiser mais de uma pizza:
while (opcaoBebida != "não") {
System.out.print("Deseja adicionar uma bebida? Digite SIM ou NÃO: \n");
bufferLine = removeCaps(input.nextLine().toLowerCase());
opcaoBebida = removeCaps(input.nextLine().toLowerCase());
            
    if ((! opcaoBebida.equals("nao")) && (! opcaoBebida.equals("sim"))) {
        System.out.println("Entrada inválida. Digite SIM ou NÃO.\n");
                
        } else {
            if (opcaoBebida.equals("nao")) {
            break;
            } else {
            System.out.print("Qual a bebida você deseja? \n");
            String pedidoBebida = removeCaps(input.nextLine().toLowerCase());
    
            pedido.bebidasPedido.add(pedidoBebida);
            
            // calculo do valor
            for (int i = 0; i < lista_bebidas.size(); i++) {
            if (lista_bebidas.get(i).getNome().contains(pedidoBebida)) {
            valorBebida = lista_bebidas.get(i).getPreco();
                }
            valorBebidaTotal = valorBebidaTotal + valorBebida;
                }
            }
        }
    }

// Calculo do valor da conta:
pedido.setTotal(valorPizzaTotal + valorBebidaTotal);

// Loop para a exibição do pedido completo            
System.out.print("Carregando o pedido da mesa..\n");

for (Pedido pedido1 : lista_pedidos) {
        System.out.println(pedido1.toString());
        }            
    
break;    

// Cadastrar pedido na cozinha

// usar função Queue do ArrayList (lista FIFO, first in - first out)
case 5:    

// Exibindo lista de pedidos feitos:
System.out.print("-- Lista de pedidos em ordem cronológica: --\n");
    
    
    for (int i = 0; i < lista_pedidos.size(); i++) {
            if (lista_pedidos.get(i).getMesa() != null) {
            
                System.out.print("Carregando o pedido da mesa..\n");
                    for (Pedido pedido1 : lista_pedidos) {
                    System.out.println(pedido1.toString());
                    } 
                }
            }
    
    
break;    

// Extrair próximo pedido a ser preparado e levado ao cliente  
case 6:    

int m = 0;

pedido = lista_pedidos.get(0);

System.out.print("Preparando o pedido da mesa: " + pedido.getMesa());

m = pedido.getMesa();
    
lista_pedidos.remove(m);
    
System.out.print("Deseja preparar o próximo pedido?");
        
break;    

// Encerrar aplicação
case 7:    
    
System.out.print("Encerrando o programa..\n");    
System.exit(0);

// Default para input impróprio ou errado
default:
System.out.println("Você precisa escolher um dos 7 números para as opções do menu!");
}
    }
    }


 // Metodo para pesquisar itens em Pizza
//public float pesquisarPizzar (String pedidoPizza) {
//    float valorPizza = 0.0f;
//    Pizza pizza;
//    
//    for (int i = 0; i < lista_pizzas.size(); i++) {
//        if (lista_pizzas.get(i).getNomePizza().contains(pedidoPizza)) {
//        valorPizza = lista_pizzas.get(i).getPrecoPizza();
//        }
//    }
//    return valorPizza;
//    
//}

}
