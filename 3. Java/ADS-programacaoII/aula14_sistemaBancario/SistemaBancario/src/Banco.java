import java.util.ArrayList;

public class Banco {
    private String nome;
    private String CNPJ;
    private int numeroDoBanco;
    private ArrayList<ContaBancaria> contaBancarias;

    public Banco(String nome, String CNPJ, int numeroDoBanco) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroDoBanco = numeroDoBanco;
        this.contaBancarias = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getNumeroDoBanco() {
        return numeroDoBanco;
    }

    public void setNumeroDoBanco(int numeroDoBanco) {
        this.numeroDoBanco = numeroDoBanco;
    }

    public ArrayList<ContaBancaria> getContaBancarias() {
        return contaBancarias;
    }

    public void setContaBancarias(ContaBancaria... contaBancarias) {
        for (ContaBancaria contaBancaria : contaBancarias) {
            this.contaBancarias.add(contaBancaria);
        }
    }

    public void exibeInformacoes() {
        System.out.println("\tBanco: " + this.getNome());
        System.out.println("\tCNPJ: " + this.getCNPJ());
        System.out.println("\tNúmero: " + this.getNumeroDoBanco());
        System.out.println();
    }
}
