public class Nota {
    int referencia;
    float valor;

    public Nota(int referencia, float valor) {
        this.referencia = referencia;
        this.valor = valor;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
