import java.util.Scanner;

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
        System.out.println("8 - Exibir lista completa.");
    }

    public static void exibeListaCompleta(int[] lista) {
        for (int item : lista) {
            System.out.print("[" + item + "] ");
        }
        System.out.println("\n");
    }

    public static void insereValor(int[] lista, int posicao, int valor) {
          lista[posicao] = valor;
    }

    public static int retornaExtremos(int[] lista, boolean retornaMaior) {
          int maior;
          int menor;

          maior = 0;
          menor = 0;

        for (int i = 0; i < lista.length; i++) {
            if(lista[i] > lista[maior]){
                maior = i;
            } else if (lista[i] < lista[menor] && lista[i] != 0 && lista[i] != 0) {
                menor = i;
            }
        }
        System.out.println("======> Maior " + maior);
        System.out.println("======> Menor " + menor);

        if (retornaMaior) {
            return lista[maior];
        } else {
            return lista[menor];
        }
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
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] lista;
        int opcao;
        int posicao;
        int quantidade;

        lista = new int[20];
        quantidade = 0;

        do {
            geraMenu();
            opcao = entrada.nextInt();

            switch (opcao) {
                case 0 -> System.out.println("0 - Programa finalizado.");

                case 1 -> {
                    System.out.println("1 - Criar vetor / Zerar vetor.");

                    System.out.println("Lista criada com sucesso: ");
                    exibeListaCompleta(lista);
                }
                case 2 -> {
                    int valorAInserir;
                    System.out.println("2 - Inserir valor.");

                    System.out.println("Digite o valor que você deseja inserir: ");
                    valorAInserir = entrada.nextInt();

                    System.out.println("Digite a posição em que você deseja inserir o valor\nPosição inicia em ZERO: ");
                    posicao = entrada.nextInt();
                    entrada.nextLine();

                    if (posicao > lista.length || posicao < 0) {
                        System.out.println("Digite um valor de 0 a 19");
                        posicao = entrada.nextInt();
                    }

                    insereValor(lista, posicao, valorAInserir);
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
                    System.out.println("6 - Maior valor.");

                    int maior = retornaExtremos(lista, true);

                    if(maior == 0) {
                        System.out.println("Não há valores na lista.");
                    } else {
                        System.out.println("Maior valor: " + maior);
                    }
                }

                case 7 -> {
                    System.out.println("7 - Menor valor.");

                    int maior = retornaExtremos(lista, true);
                    int totalSignificativos = contaValoresSignificativos(lista);
                    int menor = retornaExtremos(lista, false);

                    if(totalSignificativos == 0) {
                        System.out.println("Não há valores na lista.");
                    } else if (totalSignificativos == 1) {
                        menor = maior;
                        System.out.println("Menor valor: " + menor);
                    } else {
                        System.out.println("Menor: " + menor);
                    }
                }
                case 8 -> {
                    System.out.println("8 - Exibir lista completa.");
                    if (lista[0] == 0) {
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