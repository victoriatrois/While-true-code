import java.util.Scanner;
import java.util.Random;

public class Main {
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
        System.out.println("8 - Preenche aleatóriamente.");
        System.out.println("9 - Buscar valor (busca iterativa).");
        System.out.println("10 - Buscar valor (busca binária).");
        System.out.println("11 - Exibir lista completa.");
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
        int numeroAleatorio = sorteador.nextInt(100);

        for (int i = 0; i < lista.length; i++) {
            if (i == 0) {
                lista[i] = numeroAleatorio;
            } else {
                lista[i] = lista[i-1] + numeroAleatorio + 1;
            }
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
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] lista;
        int opcao;
        int posicao;
        int quantidade;

        lista = new int[20];

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
                    System.out.println("8 - Preenche aleatóriamente.");

                    preencheAleatoriamente(lista);

                    exibeListaCompleta(lista);
                }

                case 9 -> {
                    int valorABuscar;

                    System.out.println("9 - Buscar valor (busca iterativa).");

                    System.out.print("Digite o valor que deseja buscar: ");
                    valorABuscar = entrada.nextInt();

                    while (valorABuscar < 0) {
                        System.out.print("Digite um valor positivo: ");
                        valorABuscar = entrada.nextInt();;
                    }

                    buscaValorIte(lista, valorABuscar);
                }

                case 10 -> {
                    int valorABuscar;
                    int resultado;

                    System.out.println("10 - Buscar valor (busca binária).");

                    System.out.print("Digite o valor que deseja buscar: ");
                    valorABuscar = entrada.nextInt();

                    while (valorABuscar < 0) {
                        System.out.print("Digite um valor positivo: ");
                        valorABuscar = entrada.nextInt();;
                    }

                    resultado = buscaValorBi(lista, valorABuscar);

                    if (resultado == -1) {
                        System.out.println("O valor " + valorABuscar + " não foi encontrado na lista.");
                    } else {
                        System.out.println("O valor " + valorABuscar + " foi encontrado na posição: " + resultado + ".");
                    }
                }

                case 11 -> {
                    System.out.println("8 - Exibir lista completa.");

                    if (contaValoresSignificativos(lista) == 0) {
                        System.out.println("Não há valores a mostrar.");
                    } else {
                        System.out.println("Lista completa: ");
                        exibeListaCompleta(lista);
                    }
                }
                default -> geraMenu();
            }
        } while (opcao != 0);
    }
}