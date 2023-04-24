public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(
                "chocolate",
                123,
                5.45,
                "chocolate amargo",
                1000);

        Produto p2 = new Produto(
                "panetone",
                553,
                19.45);
        p1.exibeInformacoes();
        p2.exibeInformacoes();
    }
}