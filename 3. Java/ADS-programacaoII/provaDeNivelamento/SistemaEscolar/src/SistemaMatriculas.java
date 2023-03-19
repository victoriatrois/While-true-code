import java.util.Scanner;

public class SistemaMatriculas {
    public static void geraMenu() {
        System.out.println("\nDigite o número de uma opção válida:");
        System.out.println("1 - Cadastro de alunos");
        System.out.println("2 - Informações de alunos");
        System.out.println("3 - Modificar nota");
        System.out.println("4 - Média de notas");
        System.out.println("0 - Sair do sistema");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        Matriculas ano23Sem1 = new Matriculas();

        do {
            geraMenu();
            System.out.print("\nDigite a opção desejada. (Use apenas o número.) ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            switch (opcao) {
                case 0:
                    System.out.println("\n0 - Programa encerrado.");
                    break;
                case 1:
                    String nome;
                    String sobrenome;

                    System.out.println("\n********* 1 - Cadastro de alunos **********");

                    System.out.print("Digite o nome do estudante: ");
                    nome = entrada.nextLine();

                    System.out.print("Digite o sobrenome do estudante: ");
                    sobrenome = entrada.nextLine();

                    Estudante novaMatricula = new Estudante(nome, sobrenome);
                    ano23Sem1.setMatricula(novaMatricula);
                    ano23Sem1.confirmaMatricula();

                    break;
                case 2:
                    System.out.println("\n********* 2 - Informações de alunos *********");

                    ano23Sem1.exibeMatriculas();

                    break;
                case 3:
                    int matricula;
                    int referencia;
                    float notaAtualizada;

                    System.out.println("\n********* 3 - Modificar nota *********");
                    System.out.print("Digite o número de matrícula do estudante: ");
                    matricula = entrada.nextInt();

                    System.out.print("Digite a referência da nota: ");
                    System.out.println("1 para nota 1,\n2 para nota 2,\netc.: ");
                    referencia = entrada.nextInt();

                    System.out.println("Digite a nova nota: ");
                    notaAtualizada = entrada.nextFloat();

                    ano23Sem1.atualizarNotas(matricula, referencia, notaAtualizada);
                    break;
                case 4:
                    System.out.println("\n********* 4 - Média de notas *********");
                    float mediaColetiva = ano23Sem1.calculaMediaColetiva();
                    if(mediaColetiva <= 2.3) {
                        System.out.printf("Média coletiva: %.2f%n", mediaColetiva);
                        System.out.println("Cuidado, há muitas notas ZERO registradas.\nEsta pode uma média coletiva PARCIAL.\nÉ possível que apenas as notas da avaliação 01 foram registradas.");
                    } else if (mediaColetiva <= 4.6) {
                        System.out.printf("Média coletiva: %.2f%n", mediaColetiva);
                        System.out.println("Cuidado, há muitas notas ZERO registradas.\nEsta pode ser a média coletiva PARCIAL.\nÉ possível que apenas as notas das avaliações 01 e 02 foram registradas.");
                    } else {
                        System.out.printf("Média coletiva: %.2f%n", mediaColetiva);
                    }

                    break;
                default:
                    geraMenu();
            }
        } while (opcao != 0);
    }
}