import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada;
        String caminhoDoArquivo;
        Estoque estoque;
        int opcao;

        entrada = new Scanner(System.in);
        caminhoDoArquivo = "SistemaLivraria/src/estoque.txt";
        estoque = new Estoque(caminhoDoArquivo);
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
                    int codigo;
                    String titulo;
                    String editora;
                    String categoria;
                    int anoDePublicacao;
                    float valor;
                    int quantidadeEmEstoque;

                    System.out.println("1 - Cadastrar novo livro");
                    System.out.print("\nDigite o código do livro: ");
                    codigo = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("\nDigite o título do livro: ");
                    titulo = entrada.nextLine();

                    System.out.print("\nDigite a editora do livro: ");
                    editora = entrada.nextLine();

                    System.out.print("\nDigite a categoria do livro: ");
                    categoria = entrada.nextLine();

                    System.out.print("\nDigite o ano de publicação: ");
                    anoDePublicacao = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("\nDigite o valor do livro: ");
                    valor = entrada.nextFloat();

                    System.out.print("\nDigite a quantidade sendo adicionada em estoque: ");
                    quantidadeEmEstoque = entrada.nextInt();

                    Livro livro = new Livro(codigo, titulo, editora, categoria, anoDePublicacao, valor, quantidadeEmEstoque);
                    estoque.insereNoEstoque(livro);
                }
                case 2 -> {
                    System.out.println("2 - Listar livros");
                    estoque.exibeEstoque();
                }
                case 3 -> {
                    String busca;
                    boolean haResultados;
                    List<Livro> livros;

                    livros = estoque.getLivros();
                    haResultados = false;

                    System.out.println("3 - Buscar livros por título");
                    System.out.print("Digite o título do livro: ");
                    busca = entrada.nextLine();

                    for (Livro livro : livros) {
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
                    List<Livro> livros;

                    livros = estoque.getLivros();
                    haResultados = false;

                    System.out.println("4 - Buscar livros por categoria");
                    System.out.print("Digite a categoria do livro: ");
                    busca = entrada.nextLine();

                    for (Livro livro : livros) {
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
                    List<Livro> livros;

                    livros = estoque.getLivros();
                    haResultados = false;

                    System.out.println("5 - Burcar livros por preço");
                    System.out.print("Digite o preço do livro: ");
                    busca = entrada.nextFloat();

                    for (Livro livro : livros) {
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
                    List<Livro> livros;

                    livros = estoque.getLivros();
                    haResultados = false;

                    System.out.println("6 - Buscar livros por quantidade no estoque");
                    System.out.print("Digite quantidade em estoque do livro: ");
                    busca = entrada.nextInt();

                    for (Livro livro : livros) {
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
                    List<Livro> livros;

                    livros = estoque.getLivros();
                    estoqueTotal = 0;

                    System.out.println("7 - Exibir total em estoque");
                    for (Livro novoLivro : livros) {
                        estoqueTotal += novoLivro.getTotalEmEstoque();
                    }
                    System.out.print("Total em estoque: " + estoqueTotal + "\n");
                }

                case 8 -> {
                    System.out.println("8 - Carregar estoque");
                    estoque.setItensEmEstoque(estoque.carregaEstoque());
                    estoque.exibeEstoque();

                }

                case 9 -> {
                    System.out.println("9 - Atualizar arquivo de estoque");
                    estoque.registraEstoqueEmArquivo();
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
        System.out.println("8 - Carregar estoque");
        System.out.println("9 - Atualizar arquivo de estoque");
        System.out.println("0 - Encerrar atividades");
    }
}