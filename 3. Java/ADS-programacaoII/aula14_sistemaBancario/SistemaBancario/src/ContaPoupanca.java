public class ContaPoupanca extends ContaBancaria {
    private double rendimento;
    private int saquesDisponiveis;
    private int variacao;
    public ContaPoupanca(Pessoa titular, Banco banco, int numeroDaConta, int variacao, String senha) {
        super(titular, banco, numeroDaConta, senha);
        this.setTipo("poupança");
        this.setSaldo(0.0);
        this.variacao = variacao;
        this.rendimento = 0.5;
        this.saquesDisponiveis = 3;
        titular.setContas(this);
    }

    public ContaPoupanca(ContaPoupanca contaPoupanca) {
        super(contaPoupanca.getTitular(), contaPoupanca.getBanco(), contaPoupanca.numeroDaConta, contaPoupanca.getSenha());
        this.tipo = contaPoupanca.getTipo();
        this.variacao = contaPoupanca.getVariacao();
        this.rendimento = contaPoupanca.getRendimento();
        this.saquesDisponiveis = contaPoupanca.getSaquesDisponiveis();
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public int getSaquesDisponiveis() {
        return saquesDisponiveis;
    }

    public void setSaquesDisponiveis(int saquesDisponiveis) {
        this.saquesDisponiveis = saquesDisponiveis;
    }

    public int getVariacao() {
        return variacao;
    }

    public void setVariacao(int variacao) {
        this.variacao = variacao;
    }

    public void exibeInformacoes() {
        System.out.println("\t*** Conta " + this.getTipo() + " número "+ this.getNumeroDaConta() + " " + this.getVariacao() + " ***");
        System.out.println("\tBanco: " + this.getBanco().getNome());
        System.out.println("\tTitular: " + this.getTitular().getNome() + " " + this.getTitular().getSobrenome());
        System.out.println("\tSaldo: " + this.getSaldo());
        System.out.println("\tRendimento mensal: " + this.getRendimento());
        System.out.println("\tSaques restantes: " + this.getSaquesDisponiveis());
        System.out.println();
    }

    public void viraMes() {
        this.setSaldo(this.getSaldo() + (this.getSaldo() * this.getRendimento()));
        this.setSaquesDisponiveis(3);
    }

    @Override
    public void sacaQuantia(double saqueAlmejado) {
        if (this.saquesDisponiveis > 0) {
            super.sacaQuantia(saqueAlmejado);
        }
    }

    @Override
    public void depositaQuantia(double depositoAlmejado) {
        super.depositaQuantia(depositoAlmejado);
    }

    @Override
    public void depositaQuantia() {
        super.depositaQuantia();
    }
}
