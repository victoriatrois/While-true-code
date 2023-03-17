import java.util.Scanner;

public class SistemaMatriculas {
    public static void geraMenu() {
        System.out.println("Digite o número de uma opção válida:");
        System.out.println("1 - Cadastro de alunos");
        System.out.println("2 - Informações de alunos");
        System.out.println("3 - Modificar note");
        System.out.println("4 - Média de notas");
        System.out.println("0 - Sair do sistema");
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        geraMenu();


        switch (opcao) {
            case 0:
                System.out.println("Programa encerrado.");
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                geraMenu();
        }
    }
}