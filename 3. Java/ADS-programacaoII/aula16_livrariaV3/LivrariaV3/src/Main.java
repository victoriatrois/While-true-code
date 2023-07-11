import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, Filial> filiais = new HashMap<>();
    private static final String NOME_ARQUIVO = "src/estoque.txt";

    public static void main(String[] args) {
//        carregarFiliaisDoArquivo();

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    cadastrarFilial(scanner);
                    break;
                case 2:
                    cadastrarLivro(scanner);
                    break;
                case 3:
                    listarLivros();
                    break;
                case 4:
                    buscarLivroPorNome(scanner);
                    break;
                case 5:
                    buscarLivrosPorCategoria(scanner);
                    break;
                case 6:
                    buscarLivrosPorPreco(scanner);
                    break;
                case 7:
                    buscarLivrosPorEstoque(scanner);
                    break;
                case 8:
                    calcularValorTotalEstoque();
                    break;
                case 9:
                    carregarFiliaisDoArquivo();
                    break;
                case 10:
                    atualizarArquivoFiliais();
                    break;
                case 11:
                    listarEstoqueFilial(scanner);
                    break;
                case 12:
                    buscarLivrosPorCodigo(scanner);
                    break;
                case 0:
                    encerrarAtividade(scanner);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("=========== Menu ===========");
        System.out.println("1 - Criar filial");
        System.out.println("2 - Cadastrar novo livro");
        System.out.println("3 - Listar livros");
        System.out.println("4 - Buscar livros por nome");
        System.out.println("5 - Buscar livros por categoria");
        System.out.println("6 - Buscar livros por preço");
        System.out.println("7 - Buscar livros por quantidade em estoque");
        System.out.println("8 - Valor total no estoque");
        System.out.println("9 - Carregar filiais");
        System.out.println("10 - Atualizar arquivo de filiais");
        System.out.println("11 - Listagem de estoque por filial");
        System.out.println("12 - Buscar livro por código");
        System.out.println("0 - Encerrar atividade");
        System.out.println("============================");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarFilial(Scanner scanner) {
        System.out.print("Digite o código da filial: ");
        String codigo = scanner.nextLine();
        System.out.print("Digite o nome da filial: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o endereço da filial: ");
        String endereco = scanner.nextLine();
        System.out.print("Digite o contato da filial: ");
        String contato = scanner.nextLine();

        Filial filial = new Filial(codigo, nome, endereco, contato);
        filiais.put(codigo, filial);

        System.out.println("Filial criada com sucesso!");
    }

    private static void cadastrarLivro(Scanner scanner) {
        System.out.print("Digite o código da filial: ");
        String codigoFilial = scanner.nextLine();
        Filial filial = filiais.get(codigoFilial);

        if (filial == null) {
            System.out.println("Filial não encontrada.");
            return;
        }

        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o código do livro: ");
        String codigo = scanner.nextLine();
        System.out.print("Digite a editora do livro: ");
        String editora = scanner.nextLine();
        System.out.print("Digite a área do livro: ");
        String area = scanner.nextLine();
        System.out.print("Digite o ano do livro: ");
        int ano = scanner.nextInt();
        System.out.print("Digite o valor do livro: ");
        double valor = scanner.nextDouble();
        System.out.print("Digite a quantidade em estoque do livro: ");
        int estoque = scanner.nextInt();

        Livro livro = new Livro(titulo, codigo, editora, area, ano, valor, estoque);
        filial.adicionarLivro(livro);

        System.out.println("Livro cadastrado com sucesso na filial " + filial.getNome() + "!");
    }

    private static void listarLivros() {
        if (filiais.isEmpty()) {
            System.out.println("Não há filiais cadastradas.");
            return;
        }

        for (Filial filial : filiais.values()) {
            System.out.println("Filial: " + filial.getNome());
            filial.listarLivros();
        }
    }

    private static void buscarLivroPorNome(Scanner scanner) {
        if (filiais.isEmpty()) {
            System.out.println("Não há filiais cadastradas.");
            return;
        }

        System.out.print("Digite o código da filial: ");
        String codigoFilial = scanner.nextLine();
        Filial filial = filiais.get(codigoFilial);

        if (filial == null) {
            System.out.println("Filial não encontrada.");
            return;
        }

        System.out.print("Digite o nome do livro: ");
        String nome = scanner.nextLine();

        boolean livroEncontrado = false;
        List<Livro> livrosEncontrados = filial.buscarLivroPorNome(nome);

        if (!livrosEncontrados.isEmpty()) {
            System.out.println("Livros encontrados na filial " + filial.getNome() + ":");
            for (Livro livro : livrosEncontrados) {
                System.out.println(livro);
            }
            livroEncontrado = true;
        }

        if (!livroEncontrado) {
            System.out.println("Nenhum livro encontrado com o nome informado na filial " + filial.getNome() + ".");
        }
    }

    private static void buscarLivrosPorCategoria(Scanner scanner) {
        if (filiais.isEmpty()) {
            System.out.println("Não há filiais cadastradas.");
            return;
        }

        System.out.print("Digite o código da filial: ");
        String codigoFilial = scanner.nextLine();
        Filial filial = filiais.get(codigoFilial);

        if (filial == null) {
            System.out.println("Filial não encontrada.");
            return;
        }

        System.out.print("Digite a categoria dos livros: ");
        String categoria = scanner.nextLine();

        boolean livrosEncontrados = false;
        List<Livro> livros = filial.buscarLivrosPorCategoria(categoria);

        if (!livros.isEmpty()) {
            System.out.println("Livros encontrados na filial " + filial.getNome() + ":");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
            livrosEncontrados = true;
        }

        if (!livrosEncontrados) {
            System.out.println("Não há livros na categoria especificada na filial " + filial.getNome() + ".");
        }
    }

    private static void buscarLivrosPorPreco(Scanner scanner) {
        if (filiais.isEmpty()) {
            System.out.println("Não há filiais cadastradas.");
            return;
        }

        System.out.print("Digite o código da filial: ");
        String codigoFilial = scanner.nextLine();
        Filial filial = filiais.get(codigoFilial);

        if (filial == null) {
            System.out.println("Filial não encontrada.");
            return;
        }

        System.out.print("Digite o preço mínimo dos livros: ");
        double precoMinimo = scanner.nextDouble();
        System.out.print("Digite o preço máximo dos livros: ");
        double precoMaximo = scanner.nextDouble();

        boolean livrosEncontrados = false;
        List<Livro> livros = filial.buscarLivrosPorPreco(precoMinimo, precoMaximo);

        if (!livros.isEmpty()) {
            System.out.println("Livros encontrados na filial " + filial.getNome() + ":");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
            livrosEncontrados = true;
        }

        if (!livrosEncontrados) {
            System.out.println("Não há livros dentro do intervalo de preço especificado na filial " + filial.getNome() + ".");
        }
    }

    private static void buscarLivrosPorEstoque(Scanner scanner) {
        if (filiais.isEmpty()) {
            System.out.println("Não há filiais cadastradas.");
            return;
        }

        System.out.print("Digite o código da filial: ");
        String codigoFilial = scanner.nextLine();
        Filial filial = filiais.get(codigoFilial);

        if (filial == null) {
            System.out.println("Filial não encontrada.");
            return;
        }

        System.out.print("Digite a quantidade mínima em estoque: ");
        int quantidadeMinima = scanner.nextInt();
        System.out.print("Digite a quantidade máxima em estoque: ");
        int quantidadeMaxima = scanner.nextInt();

        boolean livrosEncontrados = false;
        List<Livro> livros = filial.buscarLivrosPorEstoque(quantidadeMinima, quantidadeMaxima);

        if (!livros.isEmpty()) {
            System.out.println("Livros encontrados na filial " + filial.getNome() + ":");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
            livrosEncontrados = true;
        }

        if (!livrosEncontrados) {
            System.out.println("Não há livros dentro do intervalo de quantidade em estoque especificado na filial " + filial.getNome() + ".");
        }
    }

    private static void calcularValorTotalEstoque() {
        if (filiais.isEmpty()) {
            System.out.println("Não há filiais cadastradas.");
            return;
        }

        for (Filial filial : filiais.values()) {
            double valorTotal = filial.calcularValorTotalEstoque();
            System.out.println("Valor total em estoque da filial " + filial.getNome() + ": R$" + valorTotal);
        }
    }

    private static void atualizarArquivoFiliais() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_ARQUIVO))) {
            for (Filial filial : filiais.values()) {
                writer.write("#FL" + filial.getCodigo());
                writer.newLine();
                writer.write(filial.getNome() + "," + filial.getEndereco() + "," + filial.getContato());
                writer.newLine();

                for (Livro livro : filial.getLivros()) {
                    String linha = livro.getTitulo() + "," +
                            livro.getCodigo() + "," +
                            livro.getAno() + "," +
                            livro.getArea() + "," +
                            livro.getEditora() + ",R$" +
                            livro.getValor() + "," +
                            livro.getEstoque();

                    writer.write(linha);
                    writer.newLine();
                }
            }
            System.out.println("Arquivo de filiais atualizado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao atualizar o arquivo de filiais.");
        }
    }

    private static void carregarFiliaisDoArquivo() {
        filiais.clear();

        try (BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO))) {
            String linha;
            String codigoFilial = null;

            while ((linha = reader.readLine()) != null) {
                if (linha.startsWith("#FL")) {
                    codigoFilial = linha.substring(1);
                    String[] dadosFilial = reader.readLine().split(",");
                    if (dadosFilial.length == 4) {
                        String nome = dadosFilial[0];
                        String endereco = dadosFilial[1];
                        String contato = dadosFilial[2];

                        Filial filial = new Filial(codigoFilial, nome, endereco, contato);
                        filiais.put(codigoFilial, filial);
                    }
                } else {
                    String[] dadosLivro = linha.split(",");
                    if (dadosLivro.length == 7) {
                        String codigoFilialLivro = dadosLivro[0];
                        String titulo = dadosLivro[1];
                        int ano = Integer.parseInt(dadosLivro[2]);
                        String area = dadosLivro[3];
                        String editora = dadosLivro[4];
                        double valor = Double.parseDouble(dadosLivro[5].substring(2)); // Remover o "R$"
                        int estoque = Integer.parseInt(dadosLivro[6]);

                        Filial filial = filiais.get(codigoFilialLivro);
                        if (filial != null) {
                            Livro livro = new Livro(titulo, codigoFilialLivro, editora, area, ano, valor, estoque);
                            filial.adicionarLivro(livro);
                        }
                    }
                }
            }

            System.out.println("Filiais carregadas do arquivo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao carregar o arquivo de filiais.");
        }
    }

    private static void listarEstoqueFilial(Scanner scanner) {
        if (filiais.isEmpty()) {
            System.out.println("Não há filiais cadastradas.");
            return;
        }

        System.out.print("Digite o código da filial: ");
        String codigoFilial = scanner.nextLine();
        Filial filial = filiais.get(codigoFilial);

        if (filial == null) {
            System.out.println("Filial não encontrada.");
            return;
        }

        System.out.println("Estoque da filial " + filial.getNome() + ":");
        filial.listarLivros();
        double valorTotal = filial.calcularValorTotalEstoque();
        System.out.println("Valor total em estoque: R$" + valorTotal);
    }

    private static void buscarLivrosPorCodigo(Scanner scanner) {
        if (filiais.isEmpty()) {
            System.out.println("Não há filiais cadastradas.");
            return;
        }

        System.out.print("Digite o código do livro: ");
        String codigoLivro = scanner.nextLine();

        boolean livroEncontrado = false;

        for (Filial filial : filiais.values()) {
            List<Livro> livrosEncontrados = filial.buscarLivrosPorCodigo(codigoLivro);

            if (!livrosEncontrados.isEmpty()) {
                System.out.println("Livros encontrados na filial " + filial.getNome() + ":");
                for (Livro livro : livrosEncontrados) {
                    System.out.println(livro + " >>> Filial " + filial.getNome() + ", estoque: " + livro.getEstoque() + " unidades");
                }
                livroEncontrado = true;
            }
        }

        if (!livroEncontrado) {
            System.out.println("Não há livros com o código informado.");
        }
    }

    private static void encerrarAtividade(Scanner scanner) {
        System.out.println("Atividade encerrada. Obrigado!");
        System.out.print("Deseja atualizar o arquivo de filiais? (S/N): ");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            atualizarArquivoFiliais();
        }
    }
}
