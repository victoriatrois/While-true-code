import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Livro> livroCadastrado = new ArrayList<Livro>();
        Livro livro1 = new Livro("nomeLivro1", "editora1", "categoria1", LocalDate.of(2000, 1, 1), 67.5f, 5);
        Livro livro2 = new Livro("nomeLivro2", "editora2", "categoria1", LocalDate.of(1998, 1, 1), 90, 90);
        Livro livro3 = new Livro("nomeLivro3", "editora2", "categoria2", LocalDate.of(2012, 1, 1), 55.61f, 30);

        livroCadastrado.add(livro1);
        livroCadastrado.add(livro2);
        livroCadastrado.add(livro3);
        int opcao;

        opcao = -1;

        do {
            System.out.println("Escolha uma opcao: ");
            geraMenu();
            System.out.print("Opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 0 -> {
                    System.out.println("Programa encerrado.");
                }
                case 1 -> {
                    String titulo;
                    String editora;
                    String categoria;
                    float valor;
                    int quantidadeEmEstoque;

                    System.out.println("1 - Cadastrar novo livro");
                    System.out.print("\nDigite o título do livro: ");
                    titulo = entrada.nextLine();

                    System.out.print("\nDigite a editora do livro: ");
                    editora = entrada.nextLine();

                    System.out.print("\nDigite a categoria do livro: ");
                    categoria = entrada.nextLine();

                    System.out.print("\nDigite o ano de publicação: ");
                    LocalDate ano = LocalDate.of(entrada.nextInt(), 1, 1);
                    LocalDate anoDePublicacao = ano.withYear(ano.getYear());

                    System.out.print("\nDigite o valor do livro: ");
                    valor = entrada.nextFloat();

                    System.out.print("\nDigite a quantidade sendo adicionada em estoque: ");
                    quantidadeEmEstoque = entrada.nextInt();

                    Livro livro = new Livro(titulo, editora, categoria, anoDePublicacao, valor, quantidadeEmEstoque);
                    livroCadastrado.add(livro);

                    for (Livro novoLivro : livroCadastrado) {
                        novoLivro.exibeInformacoes();
                    }
                }
                case 2 -> {
                    System.out.println("2 - Listar livros");
                    for (Livro livro : livroCadastrado) {
                        livro.exibeInformacoes();
                    }
                }
                case 3 -> {
                    String busca;
                    boolean haResultados;

                    haResultados = false;

                    System.out.println("3 - Buscar livros por título");
                    System.out.print("Digite o título do livro: ");
                    busca = entrada.nextLine();

                    for (Livro livro : livroCadastrado) {
                        if (livro.getTitulo().equals(busca)) {
                            System.out.println("Livro encontrado.");
                            livro.exibeInformacoes();

                            haResultados = true;
                        }
                    }
                    if (!haResultados) {
                        System.out.println("Não há livros com esse título.");
                    }
                }
                case 4 -> {
                    String busca;
                    boolean haResultados;

                    haResultados = false;

                    System.out.println("4 - Buscar livros por categoria");
                    System.out.print("Digite a categoria do livro: ");
                    busca = entrada.nextLine();

                    for (Livro livro : livroCadastrado) {
                        if (livro.getCategoria().equals(busca)) {
                            System.out.println("Livro encontrado.");
                            livro.exibeInformacoes();

                            haResultados = true;
                        }
                    }
                    if (!haResultados) {
                        System.out.println("Não há livros com esse título.");
                    }
                }
                case 5 -> {
                    float busca;
                    boolean haResultados;

                    haResultados = false;

                    System.out.println("5 - Burcar livros por preço");
                    System.out.print("Digite o preço do livro: ");
                    busca = entrada.nextFloat();

                    for (Livro livro : livroCadastrado) {
                        if (livro.getValor() == busca) {
                            System.out.println("Livro encontrado.");
                            livro.exibeInformacoes();

                            haResultados = true;
                        }
                    }
                    if (!haResultados) {
                        System.out.println("Não há livros com esse título.");
                    }
                }
                case 6 -> {
                    int busca;
                    boolean haResultados;

                    haResultados = false;

                    System.out.println("6 - Buscar livros por quantidade no estoque");
                    System.out.print("Digite quantidade em estoque do livro: ");
                    busca = entrada.nextInt();

                    for (Livro livro : livroCadastrado) {
                        if (livro.getQuantidadeEmEstoque() == (busca)) {
                            System.out.println("Livro encontrado.");
                            livro.exibeInformacoes();
                            haResultados = true;
                        }
                    }
                    if (!haResultados) {
                        System.out.println("Não há livros com esse título.");
                    }
                }
                case 7 -> {
                    float estoqueTotal;
                    estoqueTotal = 0;

                    System.out.println("7 - Exibir total em estoque");
                    for (Livro novoLivro : livroCadastrado) {
                        estoqueTotal += novoLivro.getTotalEmEstoque();
                    }
                    System.out.print("Total em estoque: " + estoqueTotal);
                }

                default -> geraMenu();
            }
        } while (opcao != 0);
    }

    public static void geraMenu() {
        System.out.println("1 - Cadastrar novo livro");
        System.out.println("2 - Listar livros");
        System.out.println("3 - Buscar livros por nome");
        System.out.println("4 - Buscar livros por categoria");
        System.out.println("5 - Burcar livros por preço");
        System.out.println("6 - Buscar livros por quantidade no estoque");
        System.out.println("7 - Exibir total em estoque");
        System.out.println("0 - Encerrar atividades");
    }
}