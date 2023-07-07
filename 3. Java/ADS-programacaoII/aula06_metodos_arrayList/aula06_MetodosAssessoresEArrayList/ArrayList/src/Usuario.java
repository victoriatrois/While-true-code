import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Usuario {
    Scanner entrada = new Scanner(System.in);
    private String nomeDeUsuario;
    private String senha;
    private String email;
    private LocalDate dataDeNascimento;

    public Usuario() {
        System.out.print("Digite o seu nome de usuário: ");
        this.setNomeDeUsuario(entrada.nextLine());
        System.out.print("Digite o seu email: ");
        this.setEmail(entrada.nextLine());
        System.out.print("Digite uma senha: ");
        this.setSenha(entrada.nextLine());
        System.out.print("Digite o seu dia de nascimento (dd/MM/yyyy): ");
        this.setDataDeNascimento(LocalDate.parse(entrada.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

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
        return this.dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void exibeInformacoesDeUsuario() {
        char opcao;

        System.out.println("Informações de " + this.getNomeDeUsuario());
        System.out.println("Data de nascimento: " + this.dataDeNascimento);
        System.out.println("E-mail: " + this.getEmail());
        System.out.print("Senha: ");

        for (int i = 0; i <= (this.getSenha().length()-1); i++) {
            System.out.print("*");
        }

        System.out.println("\nDigite E para exibir a senha.");
        opcao = entrada.nextLine().toUpperCase().charAt(0);

        if (opcao == 'E') {
            System.out.print("Digite a sua senha: ");
            if (entrada.nextLine().equals(this.getSenha())) {
                System.out.println("Senha: " + this.senha);
            }
        }
    }

    public boolean validaSenha(String senha) {
        boolean senhaCorreta;

        senhaCorreta = senha.equals(this.getSenha());

        return senhaCorreta;
    }

    public void alteraSenha() {
        String senhaAntiga;
        String novaSenha;

        System.out.print("Para alterar sua senha, insira sua senha atual: ");
        senhaAntiga = entrada.nextLine();

        if(validaSenha(senhaAntiga)) {
            System.out.print("\nDigite a nova senha: ");
            novaSenha = entrada.nextLine();
            this.setSenha(novaSenha);
        } else {
            System.out.println("Senha incorreta. Tente novamente.");
        }

    }

    public void alteraEmail() {
        String senha;
        String novoEmail;

        System.out.print("Para alterar seu e-mail, insira sua senha: ");
        senha = entrada.nextLine();

        if(validaSenha(senha)) {
            System.out.print("\nDigite o novo e-mail: ");
            novoEmail = entrada.nextLine();
            this.setSenha(novoEmail);
        } else {
            System.out.println("Senha incorreta. Tente novamente.");
        }
    }

    public boolean validaMaioridade() {
        boolean ehMaiorDeIdade;
        LocalDate dataAtual = LocalDate.now();
        Period idade = Period.between(this.getDataDeNascimento(), dataAtual);

        ehMaiorDeIdade = idade.getYears() >= 18;

        return ehMaiorDeIdade;
    }
}
