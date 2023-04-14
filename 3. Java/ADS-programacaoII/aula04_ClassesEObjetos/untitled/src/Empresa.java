public class Empresa {
    private String nome;
    private String CNPJ;
    private String endereco;
    private String servico;

    public Empresa() {
        this.nome = this.getNome();
        this.CNPJ = this.getCNPJ();
        this.endereco = this.getEndereco();
        this.servico = this.getEndereco();
    }

    public Empresa(String nome, String CNPJ, String endereco, String servico) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.servico = servico;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public void exibeInformacoes() {
        System.out.println("Empresa: " + this.getNome());
        System.out.println("CNPJ: " + this.getCNPJ());
        System.out.println("Situada em: " + this.getEndereco());
        System.out.println("Oferece: " + this.getServico() + "\n");
    }
}
