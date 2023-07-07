import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Usuario> cadastroDeUsuarios = new ArrayList<Usuario>();
        ArrayList<Usuario> usuariosMenoresDeIdade = new ArrayList<Usuario>();
        ArrayList<Usuario> usuariosMaioresDeIdade = new ArrayList<Usuario>();

        int opcao;

        opcao = -1;

        do {
            System.out.println("Cadastro de usuário: ");
            Usuario usuario = new Usuario();
            cadastroDeUsuarios.add(usuario);
            System.out.println("Deseja cadastrar um novo usuário? Digite 1 para sim e 0 para não.");
            opcao = entrada.nextInt();
        } while (opcao != 0);

        Usuario usuario1 = new Usuario(
                "Victoria Trois",
                "333",
                "v3gc@outlook.com",
                LocalDate.of(1992, 10, 6));
        cadastroDeUsuarios.add(usuario1);

        Usuario usuario2 = new Usuario(
                "Pedro",
                "888",
                "pedrosilveira@gmail.com",
                LocalDate.of(2018, 11, 28));
        cadastroDeUsuarios.add(usuario2);

        // ArrayList<Usuario> maioresDeIdade = cadastroDeUsuarios.stream().filter(usuario -> usuario.validaMaioridade() == true).collect(Collectors.toList());
        for (Usuario usuario:
             cadastroDeUsuarios) {
            if(usuario.validaMaioridade()){
                usuariosMaioresDeIdade.add(usuario);
            } else {
                usuariosMenoresDeIdade.add(usuario);
            }
        }

        if (usuariosMaioresDeIdade.size() > 0) {
            System.out.println("Usuários MAIORES de idade: \n");
            for (Usuario usuario:
                    usuariosMaioresDeIdade) {
                usuario.exibeInformacoesDeUsuario();
            }
        }

        if (usuariosMenoresDeIdade.size() > 0) {
            System.out.println("Usuários menores de idade: \n");
            for (Usuario usuario:
                    usuariosMenoresDeIdade) {
                usuario.exibeInformacoesDeUsuario();
            }
        }
    }
}
