public class Moto extends VeiculoTerrestre {
    private int cilindradas;

    public Moto(String fabricante, String modelo, String pais, int posicaoEixoX, int posicaoEixoY, float valor, int passageiros, String placa, String dono, int cilindradas) {
        super(fabricante, modelo, pais, posicaoEixoX, posicaoEixoY, valor, passageiros, placa, dono);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
