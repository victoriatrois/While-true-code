import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Lista lista = new Lista(10);

        int opcao;

        do {
            geraMenu();
            opcao = entrada.nextInt();
            switch (opcao) {
                case 0 -> {
                    System.out.println("Programa finalizado.");
                }
                case 1 -> {
                    System.out.println("1. Preenche com pseudo-randômicos;");
                    lista.preencheAleatoriamente();
                    lista.exibeListaCompleta();
                }
                case 2 -> {
                    System.out.println("2. Preenche com pseudo-randômicos (crescente);");
                    lista.preencheAleatoriamente();
                    lista.bubbleSort();
                    lista.exibeListaCompleta();
                }
                case 3 -> {
                    System.out.println("3. Conta valores significativos (diferentes de zero);");
                    System.out.println(lista.contaValoresSignificativos());
                }
                case 4 -> {
                    int maior;
                    int menor;

                    System.out.println("4. Informa valores extremos;");

                    lista.exibeValoresExtremos();
                }
                case 5 -> {
                    System.out.println("5. Exibe lista completa;");
                    lista.exibeListaCompleta();
                }
                case 6 -> {
                    int valorAInserir;
                    int posicao;

                    System.out.println("6. Insere valor na posição…");

                    System.out.println("Digite a posição em que deseja inserir: ");
                    posicao = entrada.nextInt();

                    while (posicao > lista.tamanho || posicao < 0) {
                        System.out.println("Digite um valor de 0 a 19");
                        posicao = entrada.nextInt();
                    }

                    System.out.println("Digite o valor que você deseja inserir: ");
                    valorAInserir = entrada.nextInt();

                    while (valorAInserir < 1) {
                        System.out.println("Digite um valor positivo: ");
                        valorAInserir = entrada.nextInt();
                    }

                    lista.setElemento(posicao, valorAInserir);

                    System.out.println("Lista atualizada: ");
                    lista.exibeListaCompleta();
                }
                case 7 -> {
                    int[] copiaLista = lista.getLista();
                    int valorAApagar;

                    System.out.println("7. Remove de toda a lista o valor…");

                    System.out.println("Digite o valor que deseja apagar: ");
                    valorAApagar = entrada.nextInt();

                    System.out.println("Todos os valores repetidos serão apagados.");

                    for (int i = 0; i < lista.tamanho; i++) {
                        if (valorAApagar == copiaLista[i]) {
                            copiaLista[i] = 0;
                        }
                    }
                    System.out.println("\nLista atualizada: ");
                    lista.exibeListaCompleta();
                }
                case 8 -> {
                    int posicao;

                    System.out.println("8. Remove o valor na posição…");

                    System.out.print("Digite a posição que deseja zerar: ");
                    posicao = entrada.nextInt();

                    lista.setElemento(posicao, 0);
                }
                case 9 -> {
                    int valorABuscar;

                    System.out.println("9. Realiza busca sequencial;");

                    System.out.print("Digite o valor que deseja buscar: ");
                    valorABuscar = entrada.nextInt();

                    lista.buscaValorIte(valorABuscar);
                }
                case 10 -> {
                    int valorABuscar;

                    System.out.println("10. Realiza busca binária;");

                    System.out.print("Digite o valor que deseja buscar: ");
                    valorABuscar = entrada.nextInt();

                    lista.buscaValorBi(lista.getLista(), valorABuscar, 0, lista.tamanho-1);
                }
                case 11 -> {
                    System.out.println("11. Ordena lista com Bubblesort;");
                    lista.bubbleSort();
                    lista.exibeListaCompleta();
                }
                case 12 -> {
                    System.out.println("12. Ordena lista com Insertionsort;");
                    lista.insertionSort();
                    lista.exibeListaCompleta();
                }
                case 13 -> {
                    System.out.println("13. Ordena lista com Selectionsort;");
                    lista.selectionSort(lista.getLista());
                    lista.exibeListaCompleta();
                }
                case 14 -> {
                    System.out.println("14. Ordena lista com Quicksort.");
                    lista.quickSort(lista.getLista(), 0, lista.tamanho-1);
                    lista.exibeListaCompleta();
                }
                default -> geraMenu();
            }
        } while (opcao != 0);
    }

    public static void geraMenu() {
        System.out.println("\nDigite uma opção válida:");
        System.out.println("1. Preenche com pseudo-randômicos;");
        System.out.println("2. Preenche com pseudo-randômicos (crescente);");
        System.out.println("3. Conta valores significativos (diferentes de zero);");
        System.out.println("4. Informa valores extremos;");
        System.out.println("5. Exibe lista completa;");
        System.out.println("6. Insere valor na posição…");
        System.out.println("7. Remove de toda a lista o valor…");
        System.out.println("8. Remove o valor na posição…");
        System.out.println("9. Realiza busca sequencial;");
        System.out.println("10. Realiza busca binária;");
        System.out.println("11. Ordena lista com Bubblesort;");
        System.out.println("12. Ordena lista com Insertionsort;");
        System.out.println("13. Ordena lista com Selectionsort;");
        System.out.println("14. Ordena lista com Quicksort.");
        System.out.println("Para sair digite zero.");
    }


}