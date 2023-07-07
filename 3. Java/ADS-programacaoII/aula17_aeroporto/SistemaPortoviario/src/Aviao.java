public class Aviao {
    protected String prefixo;
    protected String empresa;
    protected String modelo;

    public Aviao(String prefixo, String empresa, String modelo) {
        this.prefixo = prefixo;
        this.empresa = empresa;
        this.modelo = modelo;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void exibeInformacoes() {
        System.out.println("\t*** Informações da Aeronave ***");
        System.out.println("\tPrefixo: " + this.getPrefixo());
        System.out.println("\tEmpresa: " + this.getEmpresa());
        System.out.println("\tModelo: " + this.getModelo());
        System.out.println();
    }
}
