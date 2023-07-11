//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.*;
//
//class Livraria {
//    private Map<String, Filial> filiais;
//    private List<Livro> livros;
//
//    public Livraria() {
//        filiais = new HashMap<>();
//        livros = new ArrayList<>();
//    }
//
//    public void cadastrarFilial(String codigo, String nome, String endereco, String contato) {
//        Filial filial = new Filial(codigo, nome, endereco, contato);
//        filiais.put(codigo, filial);
//    }
//
//    public void cadastrarLivro(String titulo, String codigo, String editora, String area, int ano, double valor, int quantidadeEstoque, String codigoFilial) {
//        Livro livro = new Livro(titulo, codigo, editora, area, ano, valor, quantidadeEstoque);
//        livros.add(livro);
//
//        if (filiais.containsKey(codigoFilial)) {
//            Filial filial = filiais.get(codigoFilial);
//            filial.adicionarLivro(livro);
//        }
//    }
//
//    public void listarEstoqueFilial(String codigoFilial) {
//        if (filiais.containsKey(codigoFilial)) {
//            Filial filial = filiais.get(codigoFilial);
//            System.out.println("Estoque da Filial " + filial.getNome() + ":");
//            for (Livro livro : filial.getLivrosEmEstoque()) {
//                System.out.println(">>>>>> Cod#" + livro.getCodigo());
//                System.out.println(livro.toString());
//                System.out.println();
//            }
//            System.out.println("Valor total em estoque: R$ " + filial.getValorTotalEstoque());
//        } else {
//            System.out.println("Filial não encontrada.");
//        }
//    }
//
//    public void buscarLivrosPorCodigo(String codigoLivro) {
//        boolean encontrado = false;
//        for (Filial filial : filiais.values()) {
//            Map<String, Livro> livrosEmEstoque = filial.getEstoque(); // Corrigido para getEstoque()
//            if (livrosEmEstoque.containsKey(codigoLivro)) {
//                Livro livro = livrosEmEstoque.get(codigoLivro);
//                System.out.println(">>>>> Cod#" + livro.getCodigo());
//                System.out.println(livro.toString());
//                System.out.println(">>> Filial " + filial.getNome() + ", estoque: " + livro.getQuantidadeEstoque() + " unidades");
//                encontrado = true;
//            }
//        }
//        if (!encontrado) {
//            System.out.println("Livro não encontrado em nenhuma filial.");
//        }
//    }
//
//
//    public void buscarLivrosPorNome(String nomeLivro) {
//        boolean encontrado = false;
//        for (Livro livro : livros) {
//            if (livro.getTitulo().equalsIgnoreCase(nomeLivro)) {
//                System.out.println(">>>>> Cod#" + livro.getCodigo());
//                System.out.println(livro.toString());
//                for (Filial filial : filiais.values()) {
//                    Map<String, Livro> livrosEmEstoque = filial.getEstoque();
//                    if (livrosEmEstoque.containsKey(livro.getCodigo())) {
//                        System.out.println(">>> Filial " + filial.getNome() + ", estoque: " + livrosEmEstoque.get(livro.getCodigo()).getQuantidadeEstoque() + " unidades");
//                        encontrado = true;
//                    }
//                }
//            }
//        }
//        if (!encontrado) {
//            System.out.println("Livro não encontrado.");
//        }
//    }
//
//    public void buscarLivrosPorCategoria(String categoriaLivro) {
//        boolean encontrado = false;
//        for (Livro livro : livros) {
//            if (livro.getArea().equalsIgnoreCase(categoriaLivro)) {
//                System.out.println(">>>>> Cod#" + livro.getCodigo());
//                System.out.println(livro.toString());
//                for (Filial filial : filiais.values()) {
//                    Map<String, Livro> livrosEmEstoque = filial.getEstoque();
//                    if (livrosEmEstoque.containsKey(livro.getCodigo())) {
//                        System.out.println(">>> Filial " + filial.getNome() + ", estoque: " + livrosEmEstoque.get(livro.getCodigo()).getQuantidadeEstoque() + " unidades");
//                        encontrado = true;
//                    }
//                }
//            }
//        }
//        if (!encontrado) {
//            System.out.println("Livro não encontrado.");
//        }
//    }
//
//    public void buscarLivrosPorPreco(double precoMaximo) {
//        boolean encontrado = false;
//        for (Livro livro : livros) {
//            if (livro.getValor() < precoMaximo) {
//                System.out.println(">>>>> Cod#" + livro.getCodigo());
//                System.out.println(livro.toString());
//                for (Filial filial : filiais.values()) {
//                    Map<String, Livro> livrosEmEstoque = filial.getEstoque();
//                    if (livrosEmEstoque.containsKey(livro.getCodigo())) {
//                        System.out.println(">>> Filial " + filial.getNome() + ", estoque: " + livrosEmEstoque.get(livro.getCodigo()).getQuantidadeEstoque() + " unidades");
//                        encontrado = true;
//                    }
//                }
//            }
//        }
//        if (!encontrado) {
//            System.out.println("Livro não encontrado.");
//        }
//    }
//
//    public void buscarLivrosPorQuantidadeEstoque(int quantidadeMinima) {
//        boolean encontrado = false;
//        for (Livro livro : livros) {
//            if (livro.getQuantidadeEstoque() > quantidadeMinima) {
//                System.out.println(">>>>> Cod#" + livro.getCodigo());
//                System.out.println(livro.toString());
//                for (Filial filial : filiais.values()) {
//                    Map<String, Livro> livrosEmEstoque = filial.getEstoque();
//                    if (livrosEmEstoque.containsKey(livro.getCodigo())) {
//                        System.out.println(">>> Filial " + filial.getNome() + ", estoque: " + livrosEmEstoque.get(livro.getCodigo()).getQuantidadeEstoque() + " unidades");
//                        encontrado = true;
//                    }
//                }
//            }
//        }
//        if (!encontrado) {
//            System.out.println("Livro não encontrado.");
//        }
//    }
//
//
//    public void carregarLivrosDoArquivo(String nomeArquivo) {
//        try {
//            File arquivo = new File(nomeArquivo);
//            Scanner scanner = new Scanner(arquivo);
//
//            while (scanner.hasNextLine()) {
//                String linha = scanner.nextLine().trim();
//                if (!linha.startsWith("#FL")) {
//                    String[] dadosLivro = linha.split(",");
//                    if (dadosLivro.length == 7) {
//                        String codigo = dadosLivro[0].trim();
//                        String titulo = dadosLivro[1].trim();
//                        int ano = Integer.parseInt(dadosLivro[2].trim());
//                        String area = dadosLivro[3].trim();
//                        String editora = dadosLivro[4].trim();
//                        double valor = Double.parseDouble(dadosLivro[5].substring(2).trim());
//                        int quantidadeEstoque = Integer.parseInt(dadosLivro[6].trim());
//
//                        Livro livro = new Livro(titulo, codigo, editora, area, ano, valor, quantidadeEstoque);
//                        livros.add(livro);
//
//                        // Aloca o livro em uma filial se houver código de filial na linha
//                        if (dadosLivro.length == 8) {
//                            String codigoFilial = dadosLivro[7].trim();
//                            if (filiais.containsKey(codigoFilial)) {
//                                Filial filial = filiais.get(codigoFilial);
//                                filial.adicionarLivro(livro);
//                            }
//                        }
//                    }
//                }
//            }
//
//            scanner.close();
//            System.out.println("Estoque carregado do arquivo com sucesso.");
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Arquivo não encontrado.");
//        } catch (NumberFormatException e) {
//            System.out.println("Erro ao converter número.");
//        }
//    }
//
//    public void atualizarArquivoDeLivros(String nomeArquivo) {
//        try {
//            FileWriter writer = new FileWriter(nomeArquivo);
//
//            // Escreve as filiais no arquivo
//            for (Filial filial : filiais.values()) {
//                writer.write("#FL" + filial.getCodigo() + "," + filial.getNome() + "," + filial.getEndereco() + "," + filial.getContato() + "\n");
//                Map<String, Livro> livrosEmEstoque = filial.getEstoque();
//                for (Livro livro : livrosEmEstoque.values()) {
//                    writer.write(livro.getCodigo() + "," + livro.getTitulo() + "," + livro.getAno() + "," + livro.getArea() + "," + livro.getEditora() + ",R$" + livro.getValor() + "," + livro.getQuantidadeEstoque() + "," + filial.getCodigo() + "\n");
//                }
//            }
//
//            // Escreve os livros não alocados em filiais no arquivo
//            for (Livro livro : livros) {
//                boolean livroAlocado = false;
//                for (Filial filial : filiais.values()) {
//                    if (filial.getEstoque().containsKey(livro.getCodigo())) {
//                        livroAlocado = true;
//                        break;
//                    }
//                }
//                if (!livroAlocado) {
//                    writer.write(livro.getCodigo() + "," + livro.getTitulo() + "," + livro.getAno() + "," + livro.getArea() + "," + livro.getEditora() + ",R$" + livro.getValor() + "," + livro.getQuantidadeEstoque() + "\n");
//                }
//            }
//
//            writer.close();
//            System.out.println("Arquivo de estoque atualizado com sucesso.");
//
//        } catch (IOException e) {
//            System.out.println("Erro ao escrever no arquivo.");
//        }
//    }
//}