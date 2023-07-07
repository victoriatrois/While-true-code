public class Carro extends VeiculoTerrestre {
    private int combustivel;
    private String classe;
    private int potencia;

    public Carro(String fabricante, String modelo, String pais, int posicaoEixoX, int posicaoEixoY, float valor, int passageiros, String placa, String dono, int combustivel, String classe, int potencia) {
        super(fabricante, modelo, pais, posicaoEixoX, posicaoEixoY, valor, passageiros, placa, dono);
        this.combustivel = combustivel;
        this.classe = classe;
        this.potencia = potencia;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
