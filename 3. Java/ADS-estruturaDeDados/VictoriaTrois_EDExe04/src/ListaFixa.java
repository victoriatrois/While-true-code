import java.util.Scanner;
public class ListaFixa {
    Scanner entrada = new Scanner(System.in);
    private int[] lista;
    public int tamanho;

    public ListaFixa(int tamanho) {
        this.tamanho = tamanho;
        this.lista = new int[tamanho];
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public int getElemento(int posicao) {
        return lista[posicao];
    }

    public void insereValor(int posicao, int valor) {
        lista[posicao] = valor;
    }

    public void insereValores() {
        for (int i = 0; i < this.tamanho; i++) {
            if(i == this.tamanho - 1) {
                System.out.println("Digite o último valor.");
            } else {
                System.out.println("Digite o " + (i+1) + "º valor.");
            }
            this.lista[i] = entrada.nextInt();
        }
    }
    public void exibeListaCompleta() {
        for (int item : this.lista) {
            if (item == 0) {
                System.out.print("[ ] ");
            } else {
                System.out.print("[" + item + "] ");
            }
        }
        System.out.println("\n");
    }


}
