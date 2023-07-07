import java.util.ArrayList;

public class Pessoa {
    private String nomeCompleto;
    private int CPF;
    private String endereco;
    private ArrayList<Integer> telefones;
    private String email;

    public Pessoa(String nomeCompleto, int CPF, String endereco, String email, Integer... telefones) {
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.endereco = endereco;
        this.email = email;
        this.telefones = new ArrayList<Integer>();
        for (Integer telefone : telefones) {
            this.telefones.add(telefone);
        }
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Integer> getTelefones() {
        return this.telefones;
    }

    public void setTelefones(int[] telefones) {
        for (int telefone : telefones) {
            this.telefones.add(telefone);
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibeTelefones() {
        for (int i = 0; i < this.telefones.size(); i++) {
            System.out.println("\tTelefone " + (i + 1) + ": " + this.telefones.get(i));
        }
    }

    public void exibeInformacoesDaPessoa() {
        System.out.println("*** Informações pessoais ***");
        System.out.println("Nome: " + this.getNomeCompleto());
        System.out.println("CPF : " + this.getCPF());
        System.out.println();
    }
    public void exibeInformacoesDeContato() {
        System.out.println("*** Informações de Contato de " + this.getNomeCompleto() + " ***");
        System.out.println("Endereço : " + this.getEndereco());
        System.out.println("E-mail : " + this.getEmail());
        System.out.println("Telefones: ");
        this.exibeTelefones();
        System.out.println();
    }
}
