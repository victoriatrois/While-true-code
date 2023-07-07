import java.util.Scanner;

public abstract class ContaBancaria {
    Scanner entrada = new Scanner(System.in);
    protected Pessoa titular;
    protected Banco banco;
    public String tipo;
    protected int numeroDaConta;
    protected double saldo;
    protected String senha;

    public ContaBancaria(Pessoa titular, Banco banco, int numeroDaConta, String senha) {
        this.titular = titular;
        this.banco = banco;
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0.0;
        this.senha = senha;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean verificaSenha(String senha) {
        if (this.senha.equals(senha)) {
            return true;
        } else {
            System.out.println("Senha incorreta!");
            return false;
        }
    }

    public boolean verificaSenha() {
        System.out.print("Digite sua senha: ");
        String senha = entrada.nextLine();
        return verificaSenha(senha);
    }

    public void sacaQuantia(double saqueAlmejado) {
        if (this.verificaSenha()) {
            if (saqueAlmejado > this.getSaldo()) {
                System.out.println("Saldo insuficiente. Operação cancelada.");
                System.out.println();
            } else {
                this.saldo -= saqueAlmejado;
                System.out.println("Operação realizada com sucesso.");
                System.out.println();
            }
        } else {
            System.out.println("Senha incorreta. Operação cancelada.");
            System.out.println();
        }
    }

    public void sacaQuantia() {
        double saqueAlmejado;

        System.out.print("Digite o valor que deseja sacar: ");
        saqueAlmejado = entrada.nextDouble();
        System.out.print("Digite sua senha para validar a operação: ");
        this.sacaQuantia(saqueAlmejado);
    }

    public void depositaQuantia(double depositoAlmejado) {
        saldo += depositoAlmejado;
        System.out.println("Depósito realizado com sucesso!");
        System.out.println();
    }

    public void depositaQuantia() {
        System.out.print("Digite o valor que deseja depositar: ");
        this.depositaQuantia(entrada.nextDouble());
    }
}
