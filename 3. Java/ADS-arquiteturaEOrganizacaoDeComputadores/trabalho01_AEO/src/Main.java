public class Main {
    static String[] memoriaPrincipal = {"A", "B", "C", "D", "E", "F"};
    static String[] primeiraListaDeRequisicoes = {"A", "B", "C", "A", "A", "B", "B", "C", "A", "D", "E", "F", "B", "A", "B", "C", "D"};
    static String[] segundaListaDeRequisicoes = {"A", "D", "C", "B", "A", "B", "D", "C", "A", "D", "E", "F", "B", "A", "F", "C", "D"};
    static String[] terceiraListaDeRequisicoes = {"A", "D", "C", "B", "A", "B", "D", "C", "A", "D", "E", "F", "B", "A", "F", "C", "D", "A", "B", "C", "A", "A", "B", "B", "C", "A", "D", "E", "F", "B", "C", "D", "C", "D"};
    static String[] cache = new String[4];
    static int proximaPosicaoASubstituir = 0;

    public static void main(String[] args) {
        String[] requisicoesRevisao = {"A", "B", "C", "A", "B", "D", "D", "A", "E", "B", "C", "F", "G", "C", "B", "D", "A", "E"};
        String[] requisicoesProva = {"A", "B", "C", "A", "B", "D", "D", "A", "E", "B", "A", "C", "F", "A", "G", "C", "B", "D", "A", "E", "A", "G", "D"};

        System.out.println("FIFO");
        FIFO(memoriaPrincipal, primeiraListaDeRequisicoes, cache);
        cache = new String[cache.length];
        FIFO(memoriaPrincipal, segundaListaDeRequisicoes, cache);
        cache = new String[cache.length];
        FIFO(memoriaPrincipal, terceiraListaDeRequisicoes, cache);
        cache = new String[cache.length];

        System.out.println("LRU");
        LRU(memoriaPrincipal, primeiraListaDeRequisicoes, cache);
        cache = new String[cache.length];
        LRU(memoriaPrincipal, segundaListaDeRequisicoes, cache);
        cache = new String[cache.length];
        LRU(memoriaPrincipal, terceiraListaDeRequisicoes, cache);
        cache = new String[cache.length];


        System.out.println("LFU");
        LFU(memoriaPrincipal, primeiraListaDeRequisicoes, cache);
        cache = new String[cache.length];
        LFU(memoriaPrincipal, segundaListaDeRequisicoes, cache);
        cache = new String[cache.length];
        LFU(memoriaPrincipal, terceiraListaDeRequisicoes, cache);
        cache = new String[cache.length];


    }

    public static void FIFO(String[] memoriaPrincipal, String[] listaDeRequisicoes, String[] cache) {

        int proximaPosicaoASubstituir = 0;
        int hits = 0;

        int posicao = 1;
        for (String requisicao : listaDeRequisicoes) {
            boolean encontradoNaCache = false;

            for (String data : cache) {
                if (requisicao.equals(data)) {
                    encontradoNaCache = true;
                    break;
                }
            }

            if (encontradoNaCache) {
                hits++;
            } else {
                cache[proximaPosicaoASubstituir] = requisicao;
                proximaPosicaoASubstituir = (proximaPosicaoASubstituir + 1) % cache.length;
            }

            System.out.print("Passo ");
            System.out.print(posicao + ": ");
            posicao++;
            for (int i = 0; i < cache.length; i++) {
                if (cache[i] != null) {
                    System.out.print(cache[i]);
                }
                if (i < cache.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        double taxaEficiencia = (double) hits / listaDeRequisicoes.length * 100;
        System.out.printf("Taxa de Eficiência: %.2f%%\n", taxaEficiencia);
        System.out.println();
    }

    public static void LRU(String[] memoriaPrincipal, String[] listaDeRequisicoes, String[] cache) {

        int posicao = 1;
        int hits = 0;

        for (String requisicao : listaDeRequisicoes) {
            boolean encontradoNaCache = false;
            int entradaEncontrada = -1;

            // Verifica se a página já está na cache e guarda sua posição
            for (int i = 0; i < cache.length; i++) {
                if (requisicao.equals(cache[i])) {
                    encontradoNaCache = true;
                    entradaEncontrada = i;
                    break;
                }
            }

            if (encontradoNaCache) {
                hits++;

                for (int i = entradaEncontrada; i > 0; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                for (int i = cache.length - 1; i > 0; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = requisicao; // cache[0] é sempre a mais recentemente usada

            System.out.print("Passo ");
            System.out.print(posicao + ": ");
            posicao++;
            for (int i = 0; i < cache.length; i++) {
                if (cache[i] != null) {
                    System.out.print(cache[i]);
                }
                if (i < cache.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        double taxaEficiencia = (double) hits / listaDeRequisicoes.length * 100;
        System.out.printf("Taxa de Eficiência: %.2f%%\n", taxaEficiencia);
        System.out.println();
    }

    public static void LFU(String[] memoriaPrincipal, String[] listaDeRequisicoes, String[] cache) {

        int hits = 0;
        int posicao = 1;
        int tamanhoDaCache = cache.length;
        int[] frequencias = new int[tamanhoDaCache];
        int[] posicoes = new int[tamanhoDaCache];

        String[] entradas = new String[tamanhoDaCache];
        for (int i = 0; i < tamanhoDaCache; i++) {
            entradas[i] = null;
            frequencias[i] = 0;
            posicoes[i] = 0;
        }

        for (String requisicao : listaDeRequisicoes) {
            boolean encontradoNaCache = false;

            for (int i = 0; i < tamanhoDaCache; i++) {
                if (requisicao.equals(entradas[i])) {
                    encontradoNaCache = true;
                    hits++;
                    frequencias[i]++;
                    break;
                }
            }

            if (!encontradoNaCache) {
                int menorFrequencia = Integer.MAX_VALUE;
                int posicaoDaMenorFrequencia = -1;
                int menorPosicao = Integer.MAX_VALUE;
                for (int i = 0; i < tamanhoDaCache; i++) {
                    if (entradas[i] == null) {
                        posicaoDaMenorFrequencia = i;
                        break;
                    } else {
                        int frequencia = frequencias[i];
                        if (frequencia < menorFrequencia) {
                            menorFrequencia = frequencia;
                            posicaoDaMenorFrequencia = i;
                            menorPosicao = posicoes[i];
                        } else if (frequencia == menorFrequencia) {
                            if (posicoes[i] < menorPosicao) {
                                posicaoDaMenorFrequencia = i;
                                menorPosicao = posicoes[i];
                            }
                        }
                    }
                }

                entradas[posicaoDaMenorFrequencia] = requisicao;
                frequencias[posicaoDaMenorFrequencia] = 1;
                posicoes[posicaoDaMenorFrequencia] = posicao;
            }

            posicao++;
            System.out.print("Passo " + (posicao - 1) + ": \t");
            for (int i = 0; i < tamanhoDaCache; i++) {
                if (entradas[i] != null) {
                    System.out.print(entradas[i]);
                }
                if (i < tamanhoDaCache - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        double taxaEficiencia = (double) hits / listaDeRequisicoes.length * 100;
        System.out.printf("Taxa de Eficiência: %.2f%%\n", taxaEficiencia);
        System.out.println();
    }
}