import java.time.LocalDate;

public class Livro {
    private String titulo;
    private int codigo;
    private String editora;
    private String categoria;
    private LocalDate ano;
    private float valor;
    private int quantidadeEmEstoque;
    private float totalEmEstoque;
    private static int proximoCodigo = 1;

    public Livro(String titulo, String editora, String categoria, LocalDate ano, float valor, int quantidadeEmEstoque) {
        this.titulo = titulo;
        this.codigo = proximoCodigo;
        this.editora = editora;
        this.categoria = categoria;
        this.ano = ano;
        this.valor = valor;
        this.totalEmEstoque = this.incrementaEstoque(quantidadeEmEstoque);
        proximoCodigo++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return String.format("%04d", codigo);
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public float getTotalEmEstoque() {
        return totalEmEstoque;
    }

    public void setTotalEmEstoque(float totalEmEstoque) {
        this.totalEmEstoque = totalEmEstoque;
    }

    public int incrementaEstoque(int recebidoEmEstoque) {
        this.quantidadeEmEstoque += recebidoEmEstoque;

        return this.getQuantidadeEmEstoque();
    }

    public int decrementaEstoque(int retiradoDoEstoque) {
        this.quantidadeEmEstoque -= retiradoDoEstoque;

        return this.getQuantidadeEmEstoque();
    }

    public float calculaTotalEmEstoque() {
        this.totalEmEstoque = this.getQuantidadeEmEstoque() * this.getValor();

        return totalEmEstoque;
    }

    public void exibeInformacoes() {
        System.out.print(">>>>>Cod#" + this.getCodigo());
        System.out.print("\nTítulo / Editora: " + this.getTitulo() + " / " + this.getEditora());
        System.out.print("\nCategoria: " + this.getCategoria());
        System.out.print("\nAno: " + this.getAno());
        System.out.printf("Valor: R$ %.2f%n", this.getValor());
        System.out.print("Unidades em estoque: " + this.getQuantidadeEmEstoque());
        System.out.printf("\nTotal em estoque: R$ %.2f%n", this.calculaTotalEmEstoque());
    }
}
