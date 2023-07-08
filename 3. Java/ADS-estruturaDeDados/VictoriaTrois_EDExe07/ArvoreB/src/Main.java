import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o grau mínimo da árvore B: ");
        int grauMinimo = scanner.nextInt();
        ArvoreB arvoreB = new ArvoreB(grauMinimo);

        boolean executando = true;
        while (executando) {
            System.out.println("\nÁrvore B:");
            System.out.println("1. Inserir nó");
            System.out.println("2. Exibir árvore");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o valor do nó a ser inserido: ");
                    int valorInserir = scanner.nextInt();
                    arvoreB.insereNoh(valorInserir);
                    System.out.println("Nó inserido com sucesso!");
                }
                case 2 -> arvoreB.exibirArvore();
                case 3 -> executando = false;
                default -> System.out.println("Opção inválida!");
            }
        }

        System.out.println("Programa encerrado.");
    }
}