public class Vertice {
    public String nome;
    public Vertice[] vizinhanca;
    public Aresta[] conexoes;

    public Vertice(String nome) {
        this.nome = nome;
    }

    public Vertice(Vertice cidade) {
        this.nome = cidade.getNome();
        this.setVizinhanca(cidade.getVizinhanca());
        this.setConexoes(cidade.getConexoes());
    }

    public String getNome() {
        return nome;
    }

    public Vertice[] getVizinhanca() {
        return vizinhanca;
    }

    public void setVizinhanca(Vertice[] vizinhanca) {
        this.vizinhanca = new Vertice[vizinhanca.length];
        int posicao = 0;
        for (Vertice vizinha : vizinhanca) {
            this.vizinhanca[posicao] = vizinha;
            posicao++;
        }
    }

    public Aresta[] getConexoes() {
        return conexoes;
    }

    public void setConexoes(Aresta[] conexoes) {
        this.conexoes = conexoes;
    }

    public void exibeInformacoesDeConexoes() {
        for (Aresta conexao : conexoes) {
            System.out.println("\t*** " + conexao.getOrigem().getNome() + " " + conexao.getDestino().getNome() + " ***");
            System.out.println("\t\tDistância: " + conexao.getDistancia());
        }
        System.out.println();
    }

    public void exibeInformacoesDeVizinhanca() {
        for (Vertice vizinha : vizinhanca) {
            System.out.println("\t" + vizinha.getNome());
        }
        System.out.println();
    }
    public void exibeInformacoesCidade() {
        System.out.println("*** Informações de " + this.getNome() + " ***");
        System.out.println("Vizinhas: ");
        this.exibeInformacoesDeVizinhanca();
        System.out.println("Conexões: ");
        this.exibeInformacoesDeConexoes();
    }
}
