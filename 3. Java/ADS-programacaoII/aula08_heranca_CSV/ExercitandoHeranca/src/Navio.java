public class Navio extends VeiculoMaritmo{
    String nome;

    public Navio(String fabricante, String modelo, String pais, int posicaoEixoX, int posicaoEixoY, float valor, int passageiros, String codigo, String empresa, String nome) {
        super(fabricante, modelo, pais, posicaoEixoX, posicaoEixoY, valor, passageiros, codigo, empresa);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
