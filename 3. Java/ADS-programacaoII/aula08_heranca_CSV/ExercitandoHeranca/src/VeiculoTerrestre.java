public class VeiculoTerrestre extends Veiculo {
    private String placa;
    private String dono;

    public VeiculoTerrestre(String fabricante, String modelo, String pais, int posicaoEixoX, int posicaoEixoY, float valor, int passageiros, String placa, String dono) {
        super(fabricante, modelo, pais, posicaoEixoX, posicaoEixoY, valor, passageiros);
        this.placa = placa;
        this.dono = dono;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void emplaca(String placa) {
        this.setPlaca(placa);
    }
}
