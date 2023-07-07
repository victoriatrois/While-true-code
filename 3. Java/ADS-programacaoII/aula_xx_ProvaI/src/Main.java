public class Main {
    public static void main(String[] args) {
        Pessoa robertoCarvalho = new Pessoa("Roberto Carvalho", "51992234131");
        robertoCarvalho.exibeInformacoes();
        robertoCarvalho.alteraContato("543339986744");

        Pessoa angelin = new Pessoa("Angelin Castagnoli", "51972534181");

        Carro kazinho = new Carro("Ford Ka", 2020, robertoCarvalho, "Sem débitos em aberto.");
        kazinho.exibeInformacoes();
        Carro audi = new Carro("Audi véio", 1997, angelin, "Sem débitos em aberto.");
        audi.exibeInformacoes();

        Servico escaneamentoDoSistema = new Servico(1, 0);
        Servico trocaDeBateria = new Servico(2, 450);

        Servico[] servicosDoJoao = new Servico[2];
        servicosDoJoao[0] = escaneamentoDoSistema;
        servicosDoJoao[1] = trocaDeBateria;

        Mecanico joao = new Mecanico("João Silveira", "51890234566", "elétrica", 5000, servicosDoJoao);
        joao.getFilaDeServicos().get(0).setCarroEmServico(kazinho);
        joao.exibeInformacoes();
        joao.getFilaDeServicos().get(1).setCarroEmServico(audi);
        joao.alteraContato();
        joao.exibeInformacoes();

        joao.alteraEspecialidade("Especialista em elétrica de ar-condicionado");
        joao.exibeInformacoes();
        joao.alteraEspecialidade();
        joao.exibeInformacoes();

        Servico revisaoEletrica = new Servico(3, 569.90, joao, kazinho, "Revisão de 20.000Km");
        joao.atribuiServico(revisaoEletrica);

        servicosDoJoao[0].atualizaServico();
        servicosDoJoao[0].exibeInformacoes();
        servicosDoJoao[0].atualizaServico(5000, "Sistema elétrico com perda total");
        servicosDoJoao[0].exibeInformacoes();


    }
}

