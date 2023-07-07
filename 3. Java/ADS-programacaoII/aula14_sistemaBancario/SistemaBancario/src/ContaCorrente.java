public class ContaCorrente extends ContaBancaria {
    private double taxaMensal;

    public ContaCorrente(Pessoa titular, Banco banco, int numeroDaConta, String senha, double taxaMensal) {
        super(titular, banco, numeroDaConta, senha);
        this.setTipo("corrente");
        this.setSaldo(0.0);
        this.taxaMensal = taxaMensal;
        titular.setContas(this);
    }

    public ContaCorrente(ContaCorrente contaCorrente) {
        super(contaCorrente.getTitular(), contaCorrente.getBanco(), contaCorrente.numeroDaConta, contaCorrente.getSenha());
        this.tipo = contaCorrente.getTipo();
        this.taxaMensal = contaCorrente.getTaxaMensal();

    }

    public double getTaxaMensal() {
        return taxaMensal;
    }

    public void setTaxaMensal(double taxaMensal) {
        this.taxaMensal = taxaMensal;
    }

    public void exibeInformacoes() {
        System.out.println("\t*** Conta " + this.getTipo() + " número "+ this.getNumeroDaConta() + " ***");
        System.out.println("\tBanco: " + this.getBanco().getNome());
        System.out.println("\tTitular: " + this.getTitular().getNome() + " " + this.getTitular().getSobrenome());
        System.out.println("\tSaldo: " + this.getSaldo());
        System.out.println("\tTaxa mensal: " + this.getTaxaMensal());
        System.out.println();
    }

    public void viraMes() {
        this.setSaldo(this.getSaldo() - this.getTaxaMensal());
    }
}
