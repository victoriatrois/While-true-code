public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista(10);

        lista.setElementos();
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
    }
}