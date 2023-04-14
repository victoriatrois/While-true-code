public class Livro {
    private String titulo;
    private String ISBN;
    private float valor;
    private String autor;
    private String editora;
    private boolean disponivel; //estoque

    public Livro() {
        this.titulo = this.getTitulo();
        this.ISBN = this.getISBN();
        this.valor = this.getValor();
        this.autor = this.getAutor();
        this.editora = this.getEditora();
        this.disponivel = this.isDisponivel();
    }
    public Livro(String titulo, String ISBN, float valor, String autor, String editora, boolean disponivel) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.valor = valor;
        this.autor = autor;
        this.editora = editora;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void exibeInformacoes() {
        System.out.println("Nome: " + this.getTitulo());
        System.out.println("ISBN: " + this.getISBN());
        System.out.printf("Valor: R$%.2f%n", this.getValor());
        System.out.println("Autor(a): " + this.getAutor());
        System.out.println("Editora: " + this.getEditora());
        System.out.println("Disponível: " + this.isDisponivel() + "\n");
    }
}
