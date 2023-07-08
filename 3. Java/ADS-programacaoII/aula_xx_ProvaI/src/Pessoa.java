import java.util.Scanner;

public class Pessoa {
    Scanner entrada = new Scanner(System.in);
    protected String nomeCompleto;
    protected String telefone;

    public Pessoa(String nomeCompleto, String telefone) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
    }

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void alteraContato() {
        String novoTelefone;

        System.out.print("Digite o novo numero de telefone: ");
        novoTelefone = entrada.nextLine();

        this.alteraContato(novoTelefone);
    }

    public void alteraContato(String novoTelefone) {
        this.setTelefone(novoTelefone);
    }

    public void exibeInformacoes() {
        System.out.println("Nome completo: " + this.getNomeCompleto());
        System.out.println("Contatos:");
        System.out.println("\tTelefone: " + this.getTelefone());
        System.out.println();
    }
}
