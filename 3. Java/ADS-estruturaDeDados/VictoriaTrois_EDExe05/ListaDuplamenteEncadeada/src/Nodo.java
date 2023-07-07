public class Nodo<T> {
    private T valor;
    private Nodo<T> proximoNo;
    private Nodo<T> noAnterior;

    public Nodo() {
    }

    public Nodo(T valor) {
        this.valor = valor;
        this.proximoNo = null;
        this.noAnterior = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(Nodo<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public Nodo<T> getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(Nodo<T> noAnterior) {
        this.noAnterior = noAnterior;
    }
}
