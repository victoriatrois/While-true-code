public class Submarino extends VeiculoMaritmo {
    private int posicaoEixoZ;
    private float profundidadeMaxima;

    public Submarino(String fabricante, String modelo, String pais, int posicaoEixoX, int posicaoEixoY, float valor, int passageiros, String codigo, String empresa, int posicaoEixoZ, float profundidadeMaxima) {
        super(fabricante, modelo, pais, posicaoEixoX, posicaoEixoY, valor, passageiros, codigo, empresa);
        this.posicaoEixoZ = posicaoEixoZ;
        this.profundidadeMaxima = profundidadeMaxima;
    }

    public int getPosicaoEixoZ() {
        return posicaoEixoZ;
    }

    public void setPosicaoEixoZ(int posicaoEixoZ) {
        this.posicaoEixoZ = posicaoEixoZ;
    }

    public float getProfundidadeMaxima() {
        return profundidadeMaxima;
    }

    public void setProfundidadeMaxima(float profundidadeMaxima) {
        this.profundidadeMaxima = profundidadeMaxima;
    }

    public void desloca(int incrementoDoEixoX, int incrementoDoEixoY, int incrementoDoEixoZ) {
        super.desloca(incrementoDoEixoX, incrementoDoEixoY);
        this.posicaoEixoZ += incrementoDoEixoZ;
    }
}
