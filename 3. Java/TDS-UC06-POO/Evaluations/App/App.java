
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leia = new Scanner(System.in);
        PizzaGoldCardapio[] cadCardapio = new PizzaGoldCardapio[50];
        List<Pizza> listaDeSabores = new ArrayList<>();
        List<Bebida> listaDeBebidas = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("#,###.00");

        int opcao;
        String resposta;
        String nomePizza;
        int tamanhoPizza;
        double precoPizza;
        String descricaoPizza;
        String nomeBebida;
        float quantidadeBebida;
        double precoBebida;
        int count1 = 1;
        int count2 = 1;
        int i = 0;

        System.out.println("-----------------------------------------");
        System.out.println("## BEM VINDO A APLICAÇÃO DO PIZZA GOLD ##");
        System.out.println("-----------------------------------------");
        System.out.println();

        while (true) {

            System.out
                    .println(
                            "Que operação deseja fazer? \n\n[1] - Cadastrar cardápio\n[2] - Fazer pedido\n[3] - Listar pedidos\n[4] - Sair");
            opcao = leia.nextInt();
            if (opcao == 4)
                break;
            switch (opcao) {

                case 1:
                    System.out.println("O que deseja cadastrar? \n[1] - pizza\n[2] - Bebida");
                    opcao = leia.nextInt();

                    if (opcao == 1) {
                        System.out.println("Qual sabor da pizza?");
                        nomePizza = leia.nextLine();
                        nomePizza = leia.nextLine();
                        System.out.println("Tamanho: ");
                        tamanhoPizza = leia.nextInt();
                        System.out.println("Qual será seu valor? ");
                        precoPizza = leia.nextFloat();
                        System.out.println("Descrição e ingredientes: ");
                        descricaoPizza = leia.nextLine();
                        descricaoPizza = leia.nextLine();
                        Pizza p = new Pizza();
                        p.setPizzaID(count1);
                        p.setNomePizza(nomePizza);
                        p.setTamanhoPizza(tamanhoPizza);
                        p.setPrecoPizza(precoPizza);
                        p.setDescricaoPizza(descricaoPizza);
                        listaDeSabores.add(p);
                        count1 += 1;

                    } else if (opcao == 2) {
                        System.out.println("Qual nome da bebida?");
                        nomeBebida = leia.nextLine();
                        nomeBebida = leia.nextLine();
                        System.out.println("Quantos ml? ");
                        quantidadeBebida = leia.nextInt();
                        System.out.println("Qual será seu valor? ");
                        precoBebida = leia.nextFloat();
                        Bebida b = new Bebida();
                        b.setBebidaID(count2);
                        b.setNomeBebida(nomeBebida);
                        b.setQuantidadeBebida(quantidadeBebida);
                        b.setPrecoBebida(precoBebida);
                        listaDeBebidas.add(b);
                        count2 += 1;

                    } else {
                        System.out.println("Opção inválida!");
                        System.out.println();
                        System.out.println("O que deseja cadastrar ? \n[1] - pizza\n[2] - Bebida");
                        opcao = leia.nextInt();
                    }
                    break;

                case 2:

                    System.out.println("==================== CARDÁPIO ====================");
                    System.out.println();
                    System.out.println();
                    System.out.println("--------------------- PIZZAS ---------------------");
                    System.out.println();
                    System.out.println();
                    for (Pizza pp : listaDeSabores) {
                        System.out.println("----------------------------------");
                        System.out.println();

                        System.out.println("Pizza - " + pp.getPizzaID());
                        System.out.println("Pizza de " + pp.getNomePizza());
                        System.out.println(pp.getTamanhoPizza() + "cm");
                        System.out.println("R$" + df.format(pp.getPrecoPizza()));
                        System.out.println("Ingredientes: " + pp.getDescricaoPizza());
                        System.out.println();
                    }

                    System.out.println("--------------------- BEBIDAS --------------------");
                    System.out.println();
                    System.out.println();

                    for (Bebida bb : listaDeBebidas) {
                        System.out.println("----------------------------------");
                        System.out.println();
                        System.out.println("Bebida - " + bb.getBebidaID());
                        System.out.println(bb.getNomeBebida());
                        System.out.println(bb.getQuantidadeBebida() + " ml");
                        System.out.println("R$" + df.format(bb.getPrecoBebida()));
                        System.out.println();
                    }

                    System.out.println();
                    System.out.println();
                    System.out.println("Número da mesa: ");
                    opcao = leia.nextInt();
                    cadCardapio[i] = new PizzaGoldCardapio();
                    cadCardapio[i].setNumeroMesa(opcao);
                    System.out.println("Primeiro escolha o que vai comer\nOBS: digite 0 para pular");

                    while (true) {
                        System.out.print("ID: ");
                        opcao = leia.nextInt();
                        if (opcao == 0)
                            break;
                        for (Pizza pp : listaDeSabores) {
                            if (pp.getPizzaID() == opcao) {
                                cadCardapio[i].armazenaPizza(pp);
                            }
                        }
                        System.out.println("Deseja mais algum sabor? S ou N");
                        resposta = leia.next();
                        if (resposta.equalsIgnoreCase("n"))
                            break;
                    }

                    System.out.println("Agora escolha o que vai beber\nOBS: digite 0 para pular");

                    while (true) {
                        System.out.print("ID: ");
                        opcao = leia.nextInt();
                        if (opcao == 0)
                            break;
                        for (Bebida bb : listaDeBebidas) {
                            if (bb.getBebidaID() == opcao) {
                                cadCardapio[i].armazenaBebida(bb);
                            }
                        }

                        System.out.println("Deseja mais algum sabor? S ou N");
                        resposta = leia.next();
                        if (resposta.equalsIgnoreCase("n"))
                            break;
                    }

                    System.out.println("Pedido feito com sucesso!");
                    System.out.println();
                    System.out.println("Pedido:");
                    cadCardapio[i].listarPedido();
                    i++;
                    break;

                case 3:

                    System.out.println("Pedidos para serem feitos:");

                    for (int aux = 0; aux < i; aux++) {
                        cadCardapio[aux].listarPedido();
                        aux++;

                    }

                    break;

                default:
                    if (opcao < 1 || opcao >= 3) {
                        System.out.println("Opção inválida!");
                    }
            }
        }
    }
}
