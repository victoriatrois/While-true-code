public class Main {
    public static void main(String[] args) {
        int valorInicial;
        int valorFinal;
        int resultado;

        valorInicial = 1;
        valorFinal = 5;
        resultado = 0;

        while (valorInicial <= valorFinal) {
            resultado += valorInicial;
            valorInicial++;
        }

        System.out.println(resultado);
    }
}