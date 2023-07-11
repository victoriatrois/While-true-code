class Livro {
    private String titulo;
    private String codigo;
    private String editora;
    private String area;
    private int ano;
    private double valor;
    private int estoque;

    public Livro(String titulo, String codigo, String editora, String area, int ano, double valor, int estoque) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.editora = editora;
        this.area = area;
        this.ano = ano;
        this.valor = valor;
        this.estoque = estoque;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getEditora() {
        return editora;
    }

    public String getArea() {
        return area;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return ">>>>> Cod#" + codigo +
                "\nTitulo/Editora: " + titulo + "/" + editora +
                "\nCategoria: " + area +
                "\nAno: " + ano +
                "\nValor: R$ " + valor +
                "\nEstoque: " + estoque + " unidades" +
                "\nValor total em estoque: " + (getValor() * getEstoque());
    }
}