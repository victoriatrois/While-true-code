public class Veiculo {
    private String fabricante;
    private String modelo;
    private String pais;
    private int posicaoEixoX;
    private int posicaoEixoY;
    private float valor;
    private int passageiros;

    public Veiculo(String fabricante, String modelo, String pais, int posicaoEixoX, int posicaoEixoY, float valor, int passageiros) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.pais = pais;
        this.posicaoEixoX = posicaoEixoX;
        this.posicaoEixoY = posicaoEixoY;
        this.valor = valor;
        this.passageiros = passageiros;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getPosicaoEixoX() {
        return posicaoEixoX;
    }

    public void setPosicaoEixoX(int posicaoEixoX) {
        this.posicaoEixoX = posicaoEixoX;
    }

    public int getPosicaoEixoY() {
        return posicaoEixoY;
    }

    public void setPosicaoEixoY(int posicaoEixoY) {
        this.posicaoEixoY = posicaoEixoY;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public void desloca(int incrementoDoEixoX, int incrementoDoEixoY) {
        this.posicaoEixoX += incrementoDoEixoX;
        this.posicaoEixoY += incrementoDoEixoY;
    }

    public void exibeInformacoes(){
        System.out.println("Fabricante: " + this.getFabricante());
        System.out.println("Modelo): " + this.getModelo());
        System.out.println("País: " + this.getPais());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Total de passageiros: " + this.getPassageiros());
    }
}
