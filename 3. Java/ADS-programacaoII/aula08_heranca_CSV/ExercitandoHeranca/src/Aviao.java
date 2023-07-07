public class Aviao extends VeiculoAereo{
    private int quantidadeDeTurbinas;

    public Aviao(String fabricante, String modelo, String pais, float valor, int passageiros, String codigo, String empresa, int posicaoEixoX, int posicaoEixoY, int posicaoEixoZ, int quantidadeDeTurbinas) {
        super(fabricante, modelo, pais, valor, passageiros, codigo, empresa, posicaoEixoX, posicaoEixoY, posicaoEixoZ);
        this.quantidadeDeTurbinas = quantidadeDeTurbinas;
    }

    public int getQuantidadeDeTurbinas() {
        return quantidadeDeTurbinas;
    }

    public void setQuantidadeDeTurbinas(int quantidadeDeTurbinas) {
        this.quantidadeDeTurbinas = quantidadeDeTurbinas;
    }
}
