public class Conta {
    private int numeroDaConta = this.getNumeroDaConta();
    private float debito = this.getDebito();
    private float credito = this.getCredito();
    private float saldo = this.getSaldo();
    private float limite = this.getLimite();
    private float saldoAtual = saldo - (debito + credito);

    public Conta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.debito = 0;
        this.credito = 0;
        this.saldo = 100;
        this.limite = saldo * 10;
        this.saldoAtual = saldo - (debito + credito);
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public float getDebito() {
        return debito;
    }

    public void passarNoDebito(float debito) {
        if (this.getSaldoAtual() > debito) {
            this.debito += debito;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public float getCredito() {
        return credito;
    }

    public void passarNoCredito(float credito) {
        if (this.getLimite() >= credito) {
            this.credito += credito;
        } else {
            System.out.println("Sem limite de crédito.");
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldoAtual() {
        return this.saldoAtual - (getCredito() + getDebito());
    }

    public void setSaldoAtual(float saldoAtual) {
        this.setSaldoAtual(saldoAtual);
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void temSaldo() {
        if (this.getSaldoAtual() > 0) {
            System.out.println("Saldo positivo.");
        } else {
            System.out.println("Saldo negativo.");
        }
    }
}
