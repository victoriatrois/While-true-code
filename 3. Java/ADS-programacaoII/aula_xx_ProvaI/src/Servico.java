import java.util.Scanner;

public class Servico {
    Scanner entrada = new Scanner(System.in);
    protected int codigo;
    protected double valor;
    protected Mecanico mecanicoResponsavel;
    protected Carro carroEmServico;
    protected String descricaoDoServico;

    public Servico(int codigo, double valor, Mecanico mecanicoResponsavel, Carro carroEmServico, String descricaoDoServico) {
        this.codigo = codigo;
        this.valor = valor;
        this.mecanicoResponsavel = mecanicoResponsavel;
        this.carroEmServico = carroEmServico;
        this.descricaoDoServico = descricaoDoServico;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Mecanico getMecanicoResponsavel() {
        return mecanicoResponsavel;
    }

    public void setMecanicoResponsavel(Mecanico mecanicoResponsavel) {
        this.mecanicoResponsavel = mecanicoResponsavel;
    }

    public Carro getCarroEmServico() {
        return carroEmServico;
    }

    public void setCarroEmServico(Carro carroEmServico) {
        this.carroEmServico = carroEmServico;
    }

    public String getDescricaoDoServico() {
        return descricaoDoServico;
    }

    public void setDescricaoDoServico(String descricaoDoServico) {
        this.descricaoDoServico = descricaoDoServico;
    }

    public void atualizaServico() {
        double novoValor;
        String novaDescricao;

        System.out.print("Digite o novo valor para esse serviço: ");
        novoValor = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("Digite a nova descrição do serviço: ");
        novaDescricao = entrada.nextLine();


        this.atualizaServico(novoValor, novaDescricao);
    }

    public void atualizaServico(double novoValor, String novaDescricao) {
        this.setValor(novoValor);
        this.setDescricaoDoServico(novaDescricao);
        System.out.println("Serviço atualizado com sucesso.");
    }

    public void exibeInformacoes() {
        System.out.println("*** Ordem de Serviço ***");
        System.out.println("Serviço#" + this.getCodigo() + "/" + this.getCarroEmServico().getProprietario().getNomeCompleto());
        System.out.println("Mecânico: " + this.getMecanicoResponsavel().getNomeCompleto());
        System.out.println("Carro: ");
        this.getCarroEmServico().exibeInformacoes();
        System.out.println("Descrição do serviço:" + this.getDescricaoDoServico());
        System.out.println();
    }
}
