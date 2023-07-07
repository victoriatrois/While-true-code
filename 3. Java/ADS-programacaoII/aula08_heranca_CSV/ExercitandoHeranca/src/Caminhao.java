public class Caminhao extends VeiculoTerrestre {
    private int eixos;
    private float peso;

    public Caminhao(String fabricante, String modelo, String pais, int posicaoEixoX, int posicaoEixoY, float valor, int passageiros, String placa, String dono, int eixos, float peso) {
        super(fabricante, modelo, pais, posicaoEixoX, posicaoEixoY, valor, passageiros, placa, dono);
        this.eixos = eixos;
        this.peso = peso;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void incrementaCarga(int incremento) {
        this.peso += incremento;
    }

    public void decrementaCarga(int decremento) {
        this.peso -= decremento;
    }
}
