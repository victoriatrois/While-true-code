public class ListaFixa<Tipo> {
    public int tamanho;
    private Tipo[] elemento;

    public ListaFixa(int tamanho) {
        this.tamanho = tamanho;
        this.elemento = (Tipo[]) new Object[tamanho];
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public Tipo getElemento(int posicao) {
        return elemento[posicao];
    }

    public void setElemento(int posicao, Tipo valor) {
        elemento[posicao] = valor;
    }

    public String
}
