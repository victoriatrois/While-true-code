import java.util.ArrayList;

public class Pessoa {
    public String nome;
    public String sobrenome;
    private int idade;
    private String CPF;
    private ArrayList<ContaBancaria> contas;

    public Pessoa(String nome, String sobrenome, int idade, String CPF) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.CPF = CPF;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public ArrayList<ContaBancaria> getContas() {
        return contas;
    }

    public void setContas(ContaBancaria... contas) {
        for (ContaBancaria contaBancaria : contas) {
            this.contas.add(contaBancaria);
        }
    }


    public void exibeInformacoesPessoais() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Sobrenome: " + this.getSobrenome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("CPF: " + this.getCPF());
        System.out.println();
    }

    public void exibeContasBancarias() {
        for (int i = 0; i < contas.size(); i++) {
            ContaBancaria conta = contas.get(i);
            System.out.println("\tConta Bancária " + (i + 1) + ": ");

            if (conta instanceof ContaCorrente) {
                ContaCorrente contaCorrente = (ContaCorrente) conta;
                contaCorrente.exibeInformacoes();
            } else if (conta instanceof ContaPoupanca) {
                ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
                contaPoupanca.exibeInformacoes();
            }
        }
    }

    public void exibeInformacoesBancarias() {
        System.out.println("*** Informações bancárias de " + this.getNome() + " " + this.getSobrenome() + " ***");
        System.out.println("Contas: ");
        this.exibeContasBancarias();
    }
}
