import java.util.ArrayList;

public class Mecanico extends Pessoa {
    protected String especialidade;

    protected ArrayList<Servico> filaDeServicos;
    protected double salario;

    public Mecanico(String nomeCompleto, String telefone, String especialidade, ArrayList<Servico> filaDeServicos, double salario) {
        super(nomeCompleto, telefone);
        this.especialidade = especialidade;
        this.filaDeServicos = filaDeServicos;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public ArrayList<Servico> getFilaDeServicos() {
        return filaDeServicos;
    }

    public void setFilaDeServicos(ArrayList<Servico> filaDeServicos) {
        this.filaDeServicos = filaDeServicos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void listaFilaDeServicos() {
        if (this.getFilaDeServicos().size() > 0) {
            for (Servico servico : this.getFilaDeServicos()) {
                System.out.println("Serviço#" + servico.getCodigo());
                System.out.println("\tCarro: ");
                servico.getCarroEmServico().exibeInformacoes();
                System.out.println("Descrição do serviço:" + servico.getDescricaoDoServico());
                System.out.println();
            }
        } else {
            System.out.println(this.getNomeCompleto() + " não tem serviços atribuidos no momento.");
            System.out.println();
        }
    }

    public void atribuiServico(Servico servico) {
        this.getFilaDeServicos().add(servico);
        this.getFilaDeServicos().get(getFilaDeServicos().size() - 1).setCodigo(servico.getCodigo());
        this.getFilaDeServicos().get(getFilaDeServicos().size() - 1).setValor(servico.getValor());
        this.getFilaDeServicos().get(getFilaDeServicos().size() - 1).setMecanicoResponsavel(servico.getMecanicoResponsavel());
        this.getFilaDeServicos().get(getFilaDeServicos().size() - 1).setCarroEmServico(servico.getCarroEmServico());
        this.getFilaDeServicos().get(getFilaDeServicos().size() - 1).setDescricaoDoServico(servico.getDescricaoDoServico());
    }

    public void alteraEspecialidade() {
        String novaEspecialidade;

        System.out.print("Digite a nova especialidade: ");
        novaEspecialidade = entrada.nextLine();

        this.alteraEspecialidade(novaEspecialidade);
    }

    public void alteraEspecialidade(String novaEspecialidade) {
        this.setEspecialidade(novaEspecialidade);
    }

    @Override
    public void exibeInformacoes() {
        System.out.println("*** Informações de Especialista ***");
        System.out.println("Nome completo: " + this.getNomeCompleto());
        System.out.println("Especialidade: " + this.getEspecialidade());
        System.out.println("*** Ordens do dia ***");
        this.listaFilaDeServicos();
        System.out.println();
    }
}
