import java.io.*;
import java.util.ArrayList;
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

    public ArrayList<String[]> carregaEstoque() {
        ArrayList<String[]> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoDoArquivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] elements = line.split(",");
                for (int i = 0; i < elements.length; i++) {
                    if (elements[i].startsWith("R$")) {
                        elements[i] = elements[i].substring(2);
                    }
                }
                lines.add(elements);
            }

            if (lines.size() > 0) {
                System.out.println("Estoque carregado:");
                this.exibeEstoque();
            } else {
                System.out.println("ERRO");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    public void atualizaArquivoDoEstoque(ArrayList<String[]> lines, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            for (String[] elements : lines) {
                StringBuilder line = new StringBuilder();

                line.append(elements[0]).append(",")
                        .append(elements[1]).append(",")
                        .append(elements[2]).append(",")
                        .append(elements[3]).append(",")
                        .append(elements[4]).append(",R$")
                        .append(elements[5]).append(",")
                        .append(elements[6]);

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

