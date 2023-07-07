import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArvoreAVL arvore = new ArvoreAVL();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("Escolha uma opção válida:");
            System.out.println("1. Inserir elemento");
            System.out.println("2. Excluir elemento");
            System.out.println("3. Exibir árvore completa");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o valor a ser inserido: ");
                    int valorInserir = scanner.nextInt();
                    arvore.raiz = arvore.insereNodo(arvore.raiz, valorInserir);
                    System.out.println("Elemento inserido com sucesso!");
                }
                case 2 -> {
                    System.out.print("Digite o valor a ser excluído: ");
                    int valorExcluir = scanner.nextInt();
                    arvore.raiz = arvore.removeNodo(arvore.raiz, valorExcluir);
                    System.out.println("Elemento excluído com sucesso!");
                }
                case 3 -> {
                    System.out.println("Árvore completa:");
                    arvore.exibirArvore(arvore.raiz, "", true);
                }
                case 4 -> System.out.println("Programa encerrado");
                default -> System.out.println("Opção inválida! Digite uma opção válida.");
            }
            System.out.println();
        }

        scanner.close();
    }
}