public class Grafo {
    private Vertice[] cidades;
    private Aresta[][] conexoes;

    public Grafo(Vertice[] cidades, Aresta[][] conexoes) {
        this.cidades = cidades;
        this.conexoes = conexoes;
    }

    public Vertice[] getCidades() {
        return cidades;
    }

    public Vertice getCidadePorNome(Grafo grafo, String nomeCidade) {
        for (Vertice cidade : grafo.getCidades()) {
            if (cidade.getNome().equalsIgnoreCase(nomeCidade)) {
                return cidade;
            }
        }
        return null;
    }

    public void setCidades(Vertice[] cidades) {
        this.cidades = cidades;
    }

    public Aresta[][] getConexoes() {
        return conexoes;
    }

    public void setConexoes(Aresta[][] conexoes) {
        this.conexoes = conexoes;
    }
    public void setConexao(Aresta novaConexao) {
        int numeroDeConexoesAtuais = conexoes.length;
        int conexoesAtuais = conexoes[0].length;

        Aresta[][] conexoesAtualizadas = new Aresta[numeroDeConexoesAtuais + 1][conexoesAtuais];

        for (int i = 0; i < numeroDeConexoesAtuais; i++) {
            conexoesAtualizadas[i] = conexoes[i].clone();
        }

        conexoesAtualizadas[numeroDeConexoesAtuais] = new Aresta[conexoesAtuais];
        conexoesAtualizadas[numeroDeConexoesAtuais][0] = novaConexao;

        conexoes = conexoesAtualizadas;
    }

    public void cadastraCidade(Vertice cidade) {
        Vertice[] cidadesAtualizadas = new Vertice[cidades.length + 1];
        for (int i = 0; i < cidades.length; i++) {
            cidadesAtualizadas[i] = cidades[i];
        }

        cidadesAtualizadas[cidades.length] = cidade;

        this.setCidades(cidadesAtualizadas);
    }

    public void listaCidades() {
        Vertice[] cidadesOrdenadas = new Vertice[cidades.length];
        System.arraycopy(cidades, 0, cidadesOrdenadas, 0, cidades.length);

        System.out.println("*** Cidades Cadastradas ***");
        // Bubble Sort
        for (int i = 0; i < cidadesOrdenadas.length - 1; i++) {
            for (int j = 0; j < cidadesOrdenadas.length - i - 1; j++) {
                if (cidadesOrdenadas[j] != null && cidadesOrdenadas[j + 1] != null) {
                    if (cidadesOrdenadas[j].getNome().compareToIgnoreCase(cidadesOrdenadas[j + 1].getNome()) > 0) {
                        Vertice temp = cidadesOrdenadas[j];
                        cidadesOrdenadas[j] = cidadesOrdenadas[j + 1];
                        cidadesOrdenadas[j + 1] = temp;
                    }
                }
            }
        }

        for (Vertice vertice : cidadesOrdenadas) {
            if (vertice != null) {
                System.out.println(vertice.getNome());
            }
        }
        System.out.println();
    }

    public void listaConexoes() {
        System.out.println("*** Conexões cadastradas ***");
        System.out.printf("%-20s %-20s %-20s\n", "Origem", "Destino", "Distância (km)");
        for (int i = 0; i < conexoes.length; i++) {
            for (int j = 0; j < conexoes[i].length; j++) {
                Aresta conexao = conexoes[i][j];
                if (conexao != null) {
                    System.out.printf("%-20s %-20s %-20s\n", conexao.getOrigem().getNome(), conexao.getDestino().getNome(), conexao.getDistancia());
                }
            }
        }
        System.out.println();
    }

    public void listaCidadesVizinhas(Vertice cidade) {
        int verticeIndex = identificaPosicaoNaLista(cidade);
        Aresta[] conexoesVizinhas = conexoes[verticeIndex];

        System.out.println("*** Cidades vizinhas de " + cidade.getNome() + " ***");

        for (int i = 0; i < conexoesVizinhas.length - 1; i++) {
            for (int j = i + 1; j < conexoesVizinhas.length; j++) {
                Aresta conexao1 = conexoesVizinhas[i];
                Aresta conexao2 = conexoesVizinhas[j];
                if (conexao1 != null && conexao2 != null && conexao1.getDistancia() > conexao2.getDistancia()) {
                    conexoesVizinhas[i] = conexao2;
                    conexoesVizinhas[j] = conexao1;
                }
            }
        }

        for (Aresta conexao : conexoesVizinhas) {
            if (conexao != null) {
                Vertice destino = conexao.getDestino();
                float distancia = conexao.getDistancia();
                System.out.println(destino.getNome() + ": " + distancia + " km");
            }
        }
        System.out.println();
    }

    private int identificaPosicaoNaLista(Vertice vertice) {
        for (int i = 0; i < cidades.length; i++) {
            if (cidades[i] == vertice) {
                return i;
            }
        }
        return -1;
    }
}
