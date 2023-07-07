public class ListaDuplamenteEncadeada<T> {
    public int tamanho;
    private Nodo<T> inicio;
    private Nodo<T> fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFim() {
        return fim;
    }

    public void setFim(Nodo fim) {
        this.fim = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isEmpty() {
        return this.inicio == null;
    }

    public void insereValorNoInicio (T valor) {
        Nodo<T> novoNo = new Nodo<T>(valor);

        if (isEmpty()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.setProximoNo(inicio);
            inicio.setNoAnterior(novoNo);
            inicio = novoNo;
        }
    }

    public void insereValorNoFim(T valor) {
        Nodo<T> novoNo = new Nodo<T>(valor);

        if (isEmpty()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.setNoAnterior(fim);
            fim.setProximoNo(novoNo);
            fim = novoNo;
        }
    }

    public void removeValorDoInicio() {
        if (isEmpty()) {
            return;
        }

        if (inicio == fim){
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.getProximoNo();
            inicio.setNoAnterior(null);
        }
    }

    public void removeValorDoFim() {
        if (isEmpty()) {
            return;
        }

        if (inicio == fim){
            inicio = null;
            fim = null;
        } else {
            fim = fim.getProximoNo();
            fim.setNoAnterior(null);
        }
    }

    public void insereValorNaPosicao(T valor, int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Invalid position: " + posicao);
        }

        if (posicao == 0) {
            insereValorNoInicio(valor);
        } else if (posicao == tamanho) {
            insereValorNoFim(valor);
        } else {
            Nodo<T> novoNo = new Nodo<T>(valor);
            Nodo<T> noAtual = inicio;

            for (int i = 0; i < posicao - 1; i++) {
                noAtual = noAtual.getProximoNo();
            }

            Nodo<T> proximoNo = noAtual.getProximoNo();

            novoNo.setNoAnterior(noAtual);
            novoNo.setProximoNo(proximoNo);

            noAtual.setProximoNo(novoNo);
            proximoNo.setNoAnterior(novoNo);

            tamanho++;
        }
    }

    public void removeValorNaPosicao(int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Invalid position: " + posicao);
        }

        if (posicao == 0) {
            removeValorDoInicio();
        } else if (posicao == tamanho) {
            removeValorDoFim();
        } else {
            Nodo<T> noAtual = inicio;

            for (int i = 0; i < posicao; i++) {
                noAtual = noAtual.getProximoNo();
            }

            Nodo<T> noAnterior = noAtual.getNoAnterior();
            Nodo<T> proximoNo = noAtual.getProximoNo();

            noAnterior.setProximoNo(proximoNo);
            proximoNo.setNoAnterior(noAnterior);

            tamanho--;
        }
    }

    public void exibeListaDuplamenteEncadeada() {
        Nodo<T> noAtual = inicio;
        while (noAtual != null) {
            System.out.println(noAtual.getValor() + " ");
            noAtual = noAtual.getProximoNo();
        }
        System.out.println();
    }
}
