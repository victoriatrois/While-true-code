public class Main {
    public static void main(String[] args) {
        ListaFixa lista = new ListaFixa(10);

        lista.insereValores();

        lista.exibeListaCompleta();
    }

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
}