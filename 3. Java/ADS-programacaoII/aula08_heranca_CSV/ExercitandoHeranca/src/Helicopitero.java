public class Helicopitero extends VeiculoAereo{
    private int rotores;

    public Helicopitero(String fabricante, String modelo, String pais, float valor, int passageiros, int rotores, String codigo, String empresa, int posicaoEixoX, int posicaoEixoY, int posicaoEixoZ) {
        super(fabricante, modelo, pais, valor, passageiros, codigo, empresa, posicaoEixoX, posicaoEixoY, posicaoEixoZ);
        this.rotores = rotores;
    }

    public int getRotores() {
        return rotores;
    }

    public void setRotores(int rotores) {
        this.rotores = rotores;
    }
}
