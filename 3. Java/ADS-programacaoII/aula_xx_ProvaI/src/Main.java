import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Fulano", "5199887766");
        pessoa1.exibeInformacoes();

        Pessoa pessoa2 = new Pessoa("Ciclano", "5199776655");
        pessoa2.exibeInformacoes();

        pessoa1.alteraContato("5199112233");
        pessoa1.exibeInformacoes();

        Carro carro1 = new Carro("Toyota Corolla", 2022, pessoa1, "Sem problemas");
        carro1.exibeInformacoes();

        Carro carro2 = new Carro("Honda Civic", 2021, pessoa2, "Sem observações");
        carro2.exibeInformacoes();

        carro1.alteraObservacoes();
        carro1.exibeInformacoes();

        ArrayList<Servico> filaDeServicosMecanico1 = new ArrayList<>();
        Mecanico mecanico1 = new Mecanico("João", "5188776655", "Mecânica Geral", filaDeServicosMecanico1, 3000);
        mecanico1.exibeInformacoes();

        ArrayList<Servico> filaDeServicosMecanico2 = new ArrayList<>();
        Mecanico mecanico2 = new Mecanico("Maria", "5188665577", "Funilaria e Pintura", filaDeServicosMecanico2, 3500);
        mecanico2.exibeInformacoes();

        mecanico1.alteraEspecialidade("Eletricidade Automotiva");
        mecanico1.exibeInformacoes();

        Servico servico1 = new Servico(1, 250.0, mecanico1, carro1, "Troca de óleo");
        servico1.exibeInformacoes();

        Servico servico2 = new Servico(2, 500.0, mecanico2, carro2, "Reparo na lataria");
        servico2.exibeInformacoes();

        servico1.atualizaServico(300.0, "Troca de óleo e filtro");
        servico1.exibeInformacoes();
    }
}

