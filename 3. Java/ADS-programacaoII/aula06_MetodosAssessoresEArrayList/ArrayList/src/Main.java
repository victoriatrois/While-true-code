import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Usuario> cadastroDeUsuarios = new ArrayList<Usuario>();
        int opcao;

        opcao = -1;

//        do {
//            System.out.println("Cadastro de usuário: ");
//            Usuario usuario = new Usuario();
//            cadastroDeUsuarios.add(usuario);
//            System.out.println("Deseja cadastrar um novo usuário? Digite 1 para sim e 0 para não.");
//            opcao = entrada.nextInt();
//        } while (opcao != 0);

        Usuario usuario1 = new Usuario(
                "v3gc",
                "kkk",
                "hhhh",
                LocalDate.of(1993, 03, 03));
        cadastroDeUsuarios.add(usuario1);

        Usuario usuario2 = new Usuario(
                "v3gc",
                "kkk",
                "hhhh",
                LocalDate.of(2013, 03, 03));
        cadastroDeUsuarios.add(usuario1);

        if(!cadastroDeUsuarios.isEmpty()) {
            for (Usuario usuario : cadastroDeUsuarios) {
                if(usuario.validaMaioridade()){
                    System.out.println("Usuários MAIORES de idade: \n");
                    usuario.exibeInformacoesDeUsuario();
                } else {
                    System.out.print("Usuários menores de idade: \n");
                    usuario.exibeInformacoesDeUsuario();
                }
            }
        }
    }
}