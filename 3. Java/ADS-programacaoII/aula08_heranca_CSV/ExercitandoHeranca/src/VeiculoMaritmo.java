public class VeiculoMaritmo extends Veiculo {
    String codigo;
    String empresa;

    public VeiculoMaritmo(String fabricante, String modelo, String pais, int posicaoEixoX, int posicaoEixoY, float valor, int passageiros, String codigo, String empresa) {
        super(fabricante, modelo, pais, posicaoEixoX, posicaoEixoY, valor, passageiros);
        this.codigo = codigo;
        this.empresa = empresa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
