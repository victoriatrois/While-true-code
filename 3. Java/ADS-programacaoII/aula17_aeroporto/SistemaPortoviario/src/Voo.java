public class Voo {
    private String codigoDoVoo;
    private String origem;
    private String destino;
    private Piloto comandante;
    private Aviao aeronave;

    public Voo(String codigoDoVoo, String origem, String destino, Piloto comandante, Aviao aeronave) {
        this.codigoDoVoo = codigoDoVoo;
        this.origem = origem;
        this.destino = destino;
        this.comandante = comandante;
        this.aeronave = aeronave;
    }

    public String getCodigoDoVoo() {
        return codigoDoVoo;
    }

    public void setCodigoDoVoo(String codigoDoVoo) {
        this.codigoDoVoo = codigoDoVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Piloto getComandante() {
        return comandante;
    }

    public void setComandante(Piloto comandante) {
        this.comandante = comandante;
    }

    public Aviao getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aviao aeronave) {
        this.aeronave = aeronave;
    }

    public void exibeInformacoes() {
        System.out.println("*** Informações do Voo ***");
        System.out.println("Código: " + this.getCodigoDoVoo());
        System.out.println("Empresa: " + this.getAeronave().getEmpresa());
        System.out.println("Origem: " + this.getOrigem());
        System.out.println("Destino: " + this.getDestino());
        System.out.println();

        System.out.println("Comandante:");
        this.getComandante().exibeInformacoes();
        System.out.println();

        System.out.println("Aeronave: ");
        this.getAeronave().exibeInformacoes();
    }
}
