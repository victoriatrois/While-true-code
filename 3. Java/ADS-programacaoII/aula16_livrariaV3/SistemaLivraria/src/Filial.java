class Filial {
    private int codigo;
    private String nome;
    private String endereco;
    private String contato;
    private Estoque estoque;

    public Filial(int codigo, String nome, String endereco, String contato) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
        this.estoque = new Estoque();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    private Filial buscarFilialPorCodigo(int codigoFilial) {
        if (this.codigo == codigoFilial) {
            return this;
        }
        return null;
    //    public void adicionarLivro(Livro livro) {
//        estoque.insereNoEstoque(livro);
//    }
//
//    public List<Livro> getLivrosEmEstoque() {
//        return estoque.getLivros();
//    }
//
//    public void exibirEstoque() {
//        this.estoque.exibirEstoqueFilial(codigo);
//    }
//
//    public Livro buscarLivroPorCodigo(int codigoLivro) {
//        return estoque.buscarLivroPorCodigo(codigoLivro);
//    }

//    public void buscarLivroPorCodigoFilial(int codigoFilial, int codigoLivro) {
//        Filial filial = buscarFilialPorCodigo(codigoFilial);
//        if (filial != null) {
//            Livro livro = filial.buscarLivroPorCodigo(codigoLivro);
//            if (livro != null) {
//                livro.exibeInformacoes();
//            } else {
//                System.out.println("Livro não encontrado na filial.");
//            }
//        } else {
//            System.out.println("Filial não encontrada.");
//        }
//    }

    }
}