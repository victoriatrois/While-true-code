import java.util.ArrayList;
import java.util.List;

class Filial {
    private String codigo;
    private String nome;
    private String endereco;
    private String contato;
    private List<Livro> livros;

    public Filial(String codigo, String nome, String endereco, String contato) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
        this.livros = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getContato() {
        return contato;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Não há livros cadastrados nesta filial.");
        } else {
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    public List<Livro> buscarLivroPorNome(String nome) {
        List<Livro> livrosEncontrados = new ArrayList<>();

        for (Livro livro : livros) {
            if (livro.getTitulo().toLowerCase().contains(nome.toLowerCase())) {
                livrosEncontrados.add(livro);
            }
        }

        return livrosEncontrados;
    }

    public List<Livro> buscarLivrosPorCategoria(String categoria) {
        List<Livro> livrosEncontrados = new ArrayList<>();

        for (Livro livro : livros) {
            if (livro.getArea().equalsIgnoreCase(categoria)) {
                livrosEncontrados.add(livro);
            }
        }

        return livrosEncontrados;
    }

    public List<Livro> buscarLivrosPorPreco(double precoMinimo, double precoMaximo) {
        List<Livro> livrosEncontrados = new ArrayList<>();

        for (Livro livro : livros) {
            if (livro.getValor() >= precoMinimo && livro.getValor() <= precoMaximo) {
                livrosEncontrados.add(livro);
            }
        }

        return livrosEncontrados;
    }

    public List<Livro> buscarLivrosPorEstoque(int quantidadeMinima, int quantidadeMaxima) {
        List<Livro> livrosEncontrados = new ArrayList<>();

        for (Livro livro : livros) {
            if (livro.getEstoque() >= quantidadeMinima && livro.getEstoque() <= quantidadeMaxima) {
                livrosEncontrados.add(livro);
            }
        }

        return livrosEncontrados;
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;

        for (Livro livro : livros) {
            valorTotal += livro.getValor() * livro.getEstoque();
        }

        return valorTotal;
    }

    public List<Livro> buscarLivrosPorCodigo(String codigoLivro) {
        List<Livro> livrosEncontrados = new ArrayList<>();

        for (Livro livro : livros) {
            if (livro.getCodigo().equals(codigoLivro)) {
                livrosEncontrados.add(livro);
            }
        }

        return livrosEncontrados;
    }
}