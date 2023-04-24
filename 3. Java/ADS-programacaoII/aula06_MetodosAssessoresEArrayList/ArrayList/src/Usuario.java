import java.time.LocalDate;
public class Usuario {
    private String nomeDeUsuario;
    private String senha;
    private String email;
    private LocalDate dataDeNascimento;

    public Usuario(String nomeDeUsuario, String senha, String email, LocalDate dataDeNascimento) {
        this.nomeDeUsuario = nomeDeUsuario;
        this.senha = senha;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void exibeInformacoesDeUsuario() {

    }

    public boolean validaSenha(String senha) {
        boolean senhaCorreta;

        senhaCorreta = false;

        return senhaCorreta;
    }

    public void alteraSenha() {

    }

    public void alteraEmail() {

    }

    public boolean validaMaioridade() {
        boolean ehMaiorDeIdade;

        ehMaiorDeIdade = false;

        return ehMaiorDeIdade;
    }
}
