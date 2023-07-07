public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();

        lista.insereValorNoInicio(9);
        lista.exibeListaDuplamenteEncadeada();
        lista.insereValorNoFim(88);
        lista.exibeListaDuplamenteEncadeada();
        lista.insereValorNoFim(43);
        lista.exibeListaDuplamenteEncadeada();
        lista.insereValorNoInicio(10);
        lista.exibeListaDuplamenteEncadeada();
    }
}