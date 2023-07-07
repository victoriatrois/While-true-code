import java.util.Scanner;

public class Servico {
    Scanner entrada = new Scanner(System.in);
    public int codigo;
    public double valor;
    public Mecanico mecanicoResponsavel;
    public Carro carroEmServico;
    public String descricaoDoServico;

    public Servico(int codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
        this.mecanicoResponsavel = new Mecanico();
        this.carroEmServico = new Carro();
        this.descricaoDoServico = "Esperando avaliação.";
    }

    public Servico(int codigo, double valor, Mecanico mecanicoResponsavel, Carro carroEmServico, String descricaoDoServico) {
        this.codigo = codigo;
        this.valor = valor;
        this.mecanicoResponsavel = mecanicoResponsavel;
        this.mecanicoResponsavel.setNomeCompleto(mecanicoResponsavel.getNomeCompleto());
        this.carroEmServico = carroEmServico;
        this.carroEmServico.setProprietario(carroEmServico.getProprietario());

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
        this.mecanicoResponsavel.setNomeCompleto(mecanicoResponsavel.getNomeCompleto());
        this.mecanicoResponsavel.setTelefone(mecanicoResponsavel.getTelefone());
        this.mecanicoResponsavel.setEspecialidade(mecanicoResponsavel.getEspecialidade());
        this.mecanicoResponsavel.setFilaDeServicos(mecanicoResponsavel.getFilaDeServicos());
        this.mecanicoResponsavel.setSalario(mecanicoResponsavel.getSalario());
    }

    public Carro getCarroEmServico() {
        return carroEmServico;
    }

    public void setCarroEmServico(Carro carroEmServico) {
        this.carroEmServico = carroEmServico;
        this.carroEmServico.setModelo(carroEmServico.getModelo());
        this.carroEmServico.setAno(carroEmServico.getAno());
        this.carroEmServico.setProprietario(carroEmServico.getProprietario());
        this.carroEmServico.setObservacoes(carroEmServico.getObservacoes());
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
        System.out.println("Serviço#" + this.getCodigo() + "/" + this.carroEmServico.getProprietario().getNomeCompleto());
        System.out.println("Mecânico: " + this.mecanicoResponsavel.getNomeCompleto());
        System.out.println("Carro: ");
        this.carroEmServico.exibeInformacoes();
        System.out.println("Descrição do serviço:" + this.descricaoDoServico);
        System.out.println();
    }
}
