public class VeiculoAereo extends Veiculo{
    String codigo;
    int posicaoEixoZ;
    String empresa;

    public VeiculoAereo(String fabricante, String modelo, String pais, float valor, int passageiros, String codigo, String empresa, int posicaoEixoX, int posicaoEixoY, int posicaoEixoZ) {
        super(fabricante, modelo, pais, posicaoEixoX, posicaoEixoY, valor, passageiros);
        this.codigo = codigo;
        this.posicaoEixoZ = posicaoEixoZ;
        this.empresa = empresa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPosicaoEixoZ() {
        return posicaoEixoZ;
    }

    public void setPosicaoEixoZ(int posicaoEixoZ) {
        this.posicaoEixoZ = posicaoEixoZ;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void desloca(int incrementoDoEixoX, int incrementoDoEixoY, int incrementoDoEixoZ) {
        super.desloca(incrementoDoEixoX, incrementoDoEixoY);
        this.posicaoEixoZ += incrementoDoEixoZ;
    }


}
