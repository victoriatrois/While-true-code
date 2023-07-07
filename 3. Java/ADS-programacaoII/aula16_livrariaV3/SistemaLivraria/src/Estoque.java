import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Estoque {
    private ArrayList<String[]> itensEmEstoque;
    private String caminhoDoArquivo;

    public Estoque(String caminhoDoArquivo) {
        this.itensEmEstoque = new ArrayList<>();
        this.caminhoDoArquivo = caminhoDoArquivo;
    }

    public Estoque() {
        this.itensEmEstoque = new ArrayList<>();
        this.caminhoDoArquivo = null;
    }

    public List<Livro> getLivros() {
        List<Livro> livros = new ArrayList<>();

        for (String[] elements : itensEmEstoque) {
            Livro livro = converteParaLivro(elements);
            livros.add(livro);
        }

        return livros;
    }

    public void setItensEmEstoque(ArrayList<String[]> itensEmEstoque) {
        this.itensEmEstoque = itensEmEstoque;
    }

    public String getCaminhoDoArquivo() {
        return caminhoDoArquivo;
    }

    public void setCaminhoDoArquivo(String caminhoDoArquivo) {
        this.caminhoDoArquivo = caminhoDoArquivo;
    }

    public void insereNoEstoque(Livro novoLivro) {
        String[] novoLivroVetorizado = novoLivro.getLivroComoVetor(novoLivro);
        this.itensEmEstoque.add(novoLivroVetorizado);
    }

    public List<Filial> carregaEstoque(String caminhoDoArquivo) {
        List<Filial> filiais = new ArrayList<>();
        Filial filialAtual = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoDoArquivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("#FL")) {
                    String[] filialInfo = line.split(",");
                    int codigo = Integer.parseInt(filialInfo[0].substring(3));
                    String nome = filialInfo[1];
                    String endereco = filialInfo[2];
                    String contato = filialInfo[3];

                    filialAtual = new Filial(codigo, nome, endereco, contato);
                    filiais.add(filialAtual);
                } else if (filialAtual != null) {
                    String[] livroInfo = line.split(",");
                    if (livroInfo.length >= 7) {
                        int codigo = livroInfo[0].trim().isEmpty() ? 0 : Integer.parseInt(livroInfo[0]);
                        String titulo = livroInfo[1];
                        int anoDePublicacao = Integer.parseInt(livroInfo[2]);
                        String categoria = livroInfo[3];
                        String editora = livroInfo[4];
                        float valor = Float.parseFloat(livroInfo[5].substring(2));
                        int quantidadeEmEstoque = Integer.parseInt(livroInfo[6]);

                        Livro livro = new Livro(codigo, titulo, editora, categoria, anoDePublicacao, valor, quantidadeEmEstoque);
                        filialAtual.getEstoque().insereNoEstoque(livro);
                    } else {
                        System.out.println("Formato inválido da linha: " + line);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return filiais;
    }




    public void atualizaArquivoDoEstoque(List<String[]> lines, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            for (String[] elements : lines) {
                StringBuilder line = new StringBuilder();

                if (elements.length >= 4 && elements[0].startsWith("#FL")) {
                    line.append(elements[0]).append(",")
                            .append(elements[1]).append(",")
                            .append(elements[2]).append(",")
                            .append(elements[3]);
                } else if (elements.length >= 7) {
                    line.append(elements[0]).append(",")
                            .append(elements[1]).append(",")
                            .append(elements[2]).append(",")
                            .append(elements[3]).append(",")
                            .append(elements[4]).append(",R$")
                            .append(elements[5]).append(",")
                            .append(elements[6]);
                } else {
                    System.out.println("Formato inválido da linha: " + Arrays.toString(elements));
                    continue;
                }

                writer.write(line.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    public void extraiLinhasDeArquivo() {
//        itensEmEstoque = carregaEstoque(caminhoDoArquivo);
//    }

    public void registraEstoqueEmArquivo() {
        atualizaArquivoDoEstoque(itensEmEstoque, caminhoDoArquivo);
    }

    public Livro converteParaLivro(String[] attributes) {
        int codigo = Integer.parseInt(attributes[0]);
        String titulo = attributes[1];
        int ano = Integer.parseInt(attributes[2]);
        String categoria = attributes[3];
        String editora = attributes[4];
        float valor;
        if (attributes[5].startsWith("R$")) {
            valor = Float.parseFloat(attributes[5].substring(2));
        } else {
            valor = Float.parseFloat(attributes[5]);
        }
        int quantidadeEmEstoque = Integer.parseInt(attributes[6]);

        return new Livro(codigo, titulo, editora, categoria, ano, valor, quantidadeEmEstoque);
    }

    public void exibeEstoque() {
        for (Livro livro : this.getLivros()) {
            livro.exibeInformacoes();
            System.out.println();
        }
        System.out.println();
    }
}
