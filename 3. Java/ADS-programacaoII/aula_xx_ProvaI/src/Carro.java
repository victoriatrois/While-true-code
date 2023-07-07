import java.util.Scanner;

public class Carro {
    Scanner entrada = new Scanner(System.in);
    private String modelo;
    private int ano;
    private Pessoa proprietario;
    private String observacoes;

    public Carro() {

    }

    public Carro(String modelo, int ano, Pessoa proprietario, String observacoes) {
        this.modelo = modelo;
        this.ano = ano;
        this.proprietario = new Pessoa();
        this.setProprietario(proprietario);
        this.observacoes = observacoes;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
        this.proprietario.setNomeCompleto(proprietario.getNomeCompleto());
        this.proprietario.setTelefone(proprietario.getTelefone());
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void alteraObservacoes() {
        System.out.print("Digite a nova observação: ");
        String novaObservacao = entrada.nextLine();

        this.setObservacoes(novaObservacao);
    }

    public void exibeInformacoes() {
        System.out.println("*** Informações do Veículo ***");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Observações: " + this.getObservacoes());
        System.out.println();
    }
}
