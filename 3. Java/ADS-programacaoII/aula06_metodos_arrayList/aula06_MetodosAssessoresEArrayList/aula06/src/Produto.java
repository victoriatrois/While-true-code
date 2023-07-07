import java.util.Scanner;
public class Produto {
    Scanner entrada = new Scanner(System.in);
    String nome;
    String descricao;
    int codigo;
    int estoque;
    double valor;

    Produto (String nome, int codigo, double valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;

        this.descricao = "---";
        System.out.println("Digite o valor de "+ this.nome + " disponível em estoque: ");
        this.estoque = entrada.nextInt();
    }

    Produto (String nome, int codigo, double valor, String descricao, int estoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.descricao = descricao;
        this.estoque = estoque;
    }

    public void exibeInformacoes() {
        System.out.println("+++ Produto nº " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrição : " + this.descricao);
        System.out.println("Valor: " + this.valor);
        System.out.println("Estoque: " + this.estoque);

        if (this.calculaValorTotalDeEstoque() > 10000) {
            System.out.println("Produto em excesso. Fazer promo!");
            System.out.println(this.calculaValorTotalDeEstoque()); // Que no nosso caso, podemos/devemos usar o exibeValorTotalDeEstoque();
        }
    }

    public void exibeValorTotalDeEstoque() {
        System.out.println("Valor total em estoque: " + this.estoque * this.valor);;
    }

    public double calculaValorTotalDeEstoque() {
        double valorTotal = this.estoque * this.valor;

        return valorTotal;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void incrementaValor(int recebidoEmEstoque) {
        this.estoque += recebidoEmEstoque;
    }
}
