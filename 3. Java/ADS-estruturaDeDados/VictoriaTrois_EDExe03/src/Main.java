import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static int[] lista;
    public static int comparacoesMerge;
    public static void geraMenu() {
        System.out.println("\nDigite uma opção válida:");
        System.out.println("0 - Finalizar programa.");
        System.out.println("1 - Criar vetor / Zerar vetor.");
        System.out.println("2 - Inserir valor.");
        System.out.println("3 - Apagar valor.");
        System.out.println("4 - Procurar valor.");
        System.out.println("5 - Contar valores significativos.");
        System.out.println("6 - Exibir maior valor.");
        System.out.println("7 - Exibir menor valor.");
        System.out.println("8 - Preencher aleatoriamente.");
        System.out.println("9 - Ordenação Bubble.");
        System.out.println("10 - Ordenação Insertion.");
        System.out.println("11 - Ordenação Shell");
        System.out.println("12 - Ordenação Selection.");
        System.out.println("13 - Ordenação Rápida.");
        System.out.println("14 - Comparar métodos de ordenação.");
        System.out.println("15 - Buscar valor (busca iterativa).");
        System.out.println("16 - Buscar valor (busca binária).");
        System.out.println("17 - Exibir lista completa.");
    }

    public static void exibeListaCompleta(int[] lista) {
        for (int item : lista) {
            if (item == 0) {
                System.out.print("[ ] ");
            } else {
                System.out.print("[" + item + "] ");
            }
        }
        System.out.println("\n");
    }

    public static void insereValor(int[] lista, int posicao, int valor) {
        lista[posicao] = valor;
    }

    public static int retornaExtremos(int[] lista, boolean retornaMaior) {
        int maior;
        int menor;

        if(contaValoresSignificativos(lista) == 0) return 0;

        // Maior valor que um valor Integer pode ter (32 bits: 0111 1111 1111 1111 1111 1111 1111 1111 = 2.147.483.647)
        maior = 0;
        menor = 2147483647;

        for (int item : lista) {
            if (item != 0 && item > maior) {
                maior = item;
            } else if (item != 0 && item < menor) {
                menor = item;
            }
        }

        if(contaValoresSignificativos(lista) == 1) return maior;

        return (retornaMaior) ? maior : menor;
    }

    public static int contaValoresSignificativos(int[] lista) {
        int quantidade = 0;

        for (int item : lista) {
            if (item != 0) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static void preencheAleatoriamente(int[] lista) {
        Random sorteador = new Random();

        for (int i = 0; i < lista.length; i++) {
            int numeroAleatorio = sorteador.nextInt(100);
            lista[i] = numeroAleatorio + 1;
        }
        exibeListaCompleta(lista);
    }

    public static int buscaValorBi(int[] lista, int valorABuscar, int posicaoInicial, int posicaoFinal) {
        if (posicaoInicial > posicaoFinal) {
            return -1;
        }

        int meio = (posicaoInicial + posicaoFinal) / 2;

        if (lista[meio] == valorABuscar) {
            return meio;
        } else if (lista[meio] < valorABuscar) {
            return buscaValorBi(lista, valorABuscar, meio + 1, posicaoFinal);
        } else {
            return buscaValorBi(lista, valorABuscar, posicaoInicial, meio - 1);
        }
    }

    private static int buscaValorBi(int[] lista, int valorABuscar) {
        return buscaValorBi(lista, valorABuscar, 0, (lista.length - 1));
    }

    private static void buscaValorIte(int[] lista, int valorABuscar) {
        int estahContido;
        int repetiu;

        estahContido = -1;
        repetiu = 0;

        for (int i = 0; i< lista.length; i++) {
            if (lista[i] == valorABuscar) {
                estahContido = 1;
                repetiu = i + 1;
            }
        }
        if (estahContido == -1) {
            System.out.println("Este valor não existe na lista.");
        } else {
            System.out.println("O valor " + valorABuscar + " foi encontrado na posição: " + (repetiu - 1) + ".");
            System.out.println("A busca percorreu o laço " + repetiu + " vezes.");
        }
    }

    public static int bubbleSort(int[] lista) {
        exibeListaCompleta(lista);
        int tamanho;
        int comparacoes;
        boolean troca;

        tamanho = lista.length;
        comparacoes = 0;

        do {
            troca = false;
            for (int i = 0; i < tamanho - 1; i++) {
                comparacoes++;
                if (lista[i] > lista[(i + 1)]){
                    int auxiliar = lista[i];
                    lista[i] = lista[(i + 1)];
                    lista[(i + 1)] = auxiliar;
                    troca = true;
                    exibeListaCompleta(lista);
                }
            }
            tamanho--;
        } while (troca);
        return comparacoes;
    }

    public static int insertionSort(int[] lista) {
        exibeListaCompleta(lista);
        int comparacoes;
        comparacoes = 0;

        for (int i = 1; i < lista.length; i++) {
            int key = lista[i];
            int j = i - 1;
            while (j >= 0 && lista[j] > key) {
                lista[j + 1] = lista[j];
                j--;
                comparacoes++;
            }
            lista[j + 1] = key;
            exibeListaCompleta(lista);
        }
        return comparacoes;
    }

    public static int shellSort(int[] lista) {
        int tamanho;
        int comparacoes;

        tamanho = lista.length;
        comparacoes = 0;

        for (int intervalo = tamanho/2; intervalo > 0; intervalo /= 2) {
            for (int i = intervalo; i < tamanho; i++) {
                int subLista = lista[i];
                int j;

                for (j = i; j >= intervalo && lista[j - intervalo] > subLista; j -= intervalo) {
                    lista[j] = lista[j - intervalo];
                    comparacoes++;
                }
                lista[j] = subLista;
            }
            exibeListaCompleta(lista);
        }
        return comparacoes;
    }

    public static int selectionSort(int[] lista) {
        int subLista;
        int comparacoes;

        subLista = lista.length;
        comparacoes = 0;

        for (int i = 0; i < subLista - 1; i++) {
            int posicaoMenorValor = i;
            for (int j = i + 1; j < subLista; j++) {
                comparacoes++;
                if (lista[j] < lista[posicaoMenorValor]) {
                    posicaoMenorValor = j;
                }
            }
            int auxiliar = lista[posicaoMenorValor];
            lista[posicaoMenorValor] = lista[i];
            lista[i] = auxiliar;
            exibeListaCompleta(lista);
        }
        return comparacoes;
    }

    public static int quickSort(int[] lista, int posicaoInicial, int posicaoFinal) {
        int comparacoes = 0;
        if (posicaoInicial < posicaoFinal) {
            int posicaoPivo = divideLista(lista, posicaoInicial, posicaoFinal);
            comparacoes += (posicaoFinal - posicaoInicial); // add comparisons made in partition() to total
            comparacoes += quickSort(lista, posicaoInicial, posicaoPivo - 1);
            comparacoes += quickSort(lista, posicaoPivo + 1, posicaoFinal);
        }
        return comparacoes;
    }

    public static int divideLista(int[] lista, int posicaoInicial, int posicaoFinal) {
        int pivo = lista[posicaoFinal];
        int i = posicaoInicial - 1;
        for (int j = posicaoInicial; j < posicaoFinal; j++) {
            if (lista[j] <= pivo) {
                i++;
                troca(lista, i, j);
            }
        }
        troca(lista, i + 1, posicaoFinal);
        exibeListaCompleta(lista);
        return i + 1;
    }

    public static void troca(int[] lista, int posicaoInicial, int posicaoFinal) {
        int listaAuxiliar = lista[posicaoInicial];
        lista[posicaoInicial] = lista[posicaoFinal];
        lista[posicaoFinal] = listaAuxiliar;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int posicao;
        int quantidade;

        lista = new int[10];

        do {
            geraMenu();
            opcao = entrada.nextInt();

            switch (opcao) {
                case 0 -> System.out.println("0 - Programa finalizado.");

                case 1 -> {
                    System.out.println("1 - Criar vetor / Zerar vetor.");

//                    Arrays.fill(lista, 0);
                    for (int i = 0; i < lista.length; i++) {
                        lista[i] = 0;
                    }

                    System.out.println("Lista criada / zerada com sucesso: ");
                    exibeListaCompleta(lista);
                }
                case 2 -> {
                    int valorAInserir;

                    System.out.println("2 - Inserir valor.");

                    System.out.println("Digite o valor que você deseja inserir: ");
                    valorAInserir = entrada.nextInt();

                    while (valorAInserir < 1) {
                        System.out.println("Digite um valor positivo: ");
                        valorAInserir = entrada.nextInt();
                    }

                    System.out.println("Digite a posição em que você deseja inserir o valor\nPosição inicia em ZERO: ");
                    posicao = entrada.nextInt();
                    entrada.nextLine();

                    while (posicao > lista.length || posicao < 0) {
                        System.out.println("Digite um valor de 0 a 19");
                        posicao = entrada.nextInt();
                    }

                    // escolhe a posição onde inserir.
                    insereValor(lista, posicao, valorAInserir);

                    // insere na próxima posição vazia.
//                    for (int i = 0; i < lista.length; i++) {
//                        if (lista[i] == 0) {
//                            lista[i] = valorAInserir;
//                            break;
//                        }
//                    }
                    System.out.println("Lista atualizada: ");
                    exibeListaCompleta(lista);
                }
                case 3 -> {
                    int valorAApagar;

                    System.out.println("3 - Apagar valor.");

                    System.out.println("Digite o valor que deseja apagar: ");
                    valorAApagar = entrada.nextInt();

                    System.out.println("Todos os valores repetidos serão apagados.");

                    for (int i = 0; i < lista.length; i++) {
                        if (valorAApagar == lista[i]) {
                            lista[i] = 0;
                        }
                    }
                    System.out.println("\nLista atualizada: ");
                    exibeListaCompleta(lista);
                }
                case 4 -> {
                    int valorAProcurar;
                    posicao = 0;

                    System.out.println("4 - Procurar valor.");

                    System.out.println("Digite o valor que deseja procurar: ");
                    valorAProcurar = entrada.nextInt();

                    for (int i = 0; i < lista.length; i++) {
                        int item = lista[i];

                        if (item == valorAProcurar) {
                            posicao = i;
                        }
                    }

                    if (posicao == 0 && lista[posicao] == 0) {
                        System.out.println("Valor não encontrado.");
                    } else {
                        System.out.println("Valor encontrado na posição: " + posicao + ".");
                    }
                }
                case 5 -> {
                    System.out.println("5 - Contar valores significativos.");

                    quantidade = contaValoresSignificativos(lista);

                    if (quantidade > 0) {
                        System.out.println("Há " + quantidade + " valor(es) significativo(s) na lista.");
                    } else {
                        System.out.println("Não há valores significativos na lista.");
                    }
                }

                case 6 -> {
                    int maior;

                    System.out.println("6 - Maior valor.");

                    if(contaValoresSignificativos(lista) == 0) {
                        System.out.println("Não há valores na lista.");
                        break;
                    }
                    maior = retornaExtremos(lista, true);
                    System.out.println("Maior valor: " + maior);
                }

                case 7 -> {
                    int menor;
                    System.out.println("7 - Menor valor.");

                    if(contaValoresSignificativos(lista) == 0) {
                        System.out.println("Não há valores na lista.");
                        break;
                    }
                    menor = retornaExtremos(lista, false);
                    System.out.println("Menor: " + menor);
                }

                case 8 -> {
                    System.out.println("8 - Preencher aleatoriamente.");

                    preencheAleatoriamente(lista);

                    exibeListaCompleta(lista);
                }

                case 9 -> {
                    System.out.println("9 - Ordenação Bubble.");
                    preencheAleatoriamente(lista);
                    bubbleSort(lista);
                }

                case 10 -> {
                    System.out.println("10 - Ordenação Insertion.");
                    preencheAleatoriamente(lista);
                    insertionSort(lista);
                }

                case 11 -> {
                    System.out.println("11 - Ordenação Shell");
                    preencheAleatoriamente(lista);
                    shellSort(lista);
                }

                case 12 -> {
                    System.out.println("13 - Ordenação Selection.");
                    preencheAleatoriamente(lista);
                    selectionSort(lista);
                }

                case 13 -> {
                    System.out.println("14 - Ordenação Rápida.");
                    preencheAleatoriamente(lista);
                    quickSort(lista, lista[0], lista.length - 1);
                }

                case 14 -> {
                    int bubbleSort;
                    int insertionSort;
                    int shellSort;
                    int selectionSort;
                    int quickSort;

                    System.out.println("15 - Comparar métodos de ordenação.");

                    System.out.println("Dado um vetor tal qual: ");
                    preencheAleatoriamente(lista);

                    int[] listaParaBubble = Arrays.copyOf(lista, lista.length);
                    int[] listaParaInsertion = Arrays.copyOf(lista, lista.length);
                    int[] listaParaShell = Arrays.copyOf(lista, lista.length);
                    int[] listaParaSelection = Arrays.copyOf(lista, lista.length);
                    int[] listaParaQuick = Arrays.copyOf(lista, lista.length);

                    System.out.println("A ordenação Bubble... ");
                    bubbleSort = bubbleSort(listaParaBubble);
                    System.out.println("terá um total de: " + bubbleSort + " comparações.\n");

                    System.out.println("A ordenação Insertion...");
                    insertionSort = insertionSort(listaParaInsertion);
                    System.out.println("um total de: " + insertionSort + " comparações.\n");

                    System.out.println("A ordenação Shell...");
                    shellSort = shellSort(listaParaShell);
                    System.out.println("um total de: " + shellSort + " comparações.\n");

                    System.out.println("A ordenação Selection...");
                    selectionSort = selectionSort(listaParaSelection);
                    System.out.println("Com um total de: " + selectionSort + " comparações.\n");

                    System.out.println("E a ordenação Rápida...");
                    quickSort = quickSort(listaParaQuick, 0, lista.length - 1);
                    System.out.println("um total de: " + quickSort + " comparações.\n");
                }

                case 15 -> {
                    int valorABuscar;

                    System.out.println("16 - Buscar valor (busca iterativa).");

                    System.out.print("Digite o valor que deseja buscar: ");
                    valorABuscar = entrada.nextInt();

                    while (valorABuscar < 0) {
                        System.out.print("Digite um valor positivo: ");
                        valorABuscar = entrada.nextInt();;
                    }

                    buscaValorIte(lista, valorABuscar);
                }

                case 16 -> {
                    int valorABuscar;
                    int resultado;

                    System.out.println("17 - Buscar valor (busca binária).");

                    System.out.print("Digite o valor que deseja buscar: ");
                    valorABuscar = entrada.nextInt();

                    while (valorABuscar < 0) {
                        System.out.print("Digite um valor positivo: ");
                        valorABuscar = entrada.nextInt();
                    }

                    resultado = buscaValorBi(lista, valorABuscar);

                    if (resultado == -1) {
                        System.out.println("O valor " + valorABuscar + " não foi encontrado na lista.");
                    } else {
                        System.out.println("O valor " + valorABuscar + " foi encontrado na posição: " + resultado + ".");
                    }
                }

                case 17 -> {
                    System.out.println("18 - Exibir lista completa.");

                    if (contaValoresSignificativos(lista) == 0) {
                        System.out.println("Não há valores a mostrar.");
                    } else {
                        System.out.println("Lista completa: ");
                        exibeListaCompleta(lista);
                    }
                }

//                case x -> {
//
//                }
                default -> geraMenu();
            }
        } while (opcao != 0);
    }
}