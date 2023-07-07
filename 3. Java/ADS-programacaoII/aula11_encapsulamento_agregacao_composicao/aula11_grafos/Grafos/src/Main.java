import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Vertice portoAlegre = new Vertice("Porto Alegre");
        Vertice canoas = new Vertice("Canoas");
        Vertice guaiba = new Vertice("Guaíba");
        Vertice alvorada = new Vertice("Alvorada");
        Vertice viamao = new Vertice("Viamão");

        Aresta portoAlegre_canoas = new Aresta(portoAlegre, canoas, 18.9f);
        Aresta portoAlegre_alvorada = new Aresta(portoAlegre, alvorada, 16.9f);
        Aresta portoAlegre_viamao = new Aresta(portoAlegre, viamao, 14.9f);
        Aresta portoAlegre_guaiba = new Aresta(portoAlegre, guaiba, 30.6f);

        Aresta canoas_portoAlegre = new Aresta(canoas, portoAlegre, 18.9f);
        Aresta canoas_Alvorada = new Aresta(canoas, alvorada, 20.9f);
        Aresta canoas_guaiba = new Aresta(canoas, guaiba, 35.8f);

        Aresta alvorada_portoAlegre = new Aresta(alvorada, portoAlegre, 16.9f);
        Aresta alvorada_canoas = new Aresta(alvorada, canoas, 20.9f);
        Aresta alvorada_viamao = new Aresta(alvorada, viamao, 10.8f);

        Aresta viamao_portoAlegre = new Aresta(viamao, portoAlegre, 14.9f);
        Aresta viamao_alvorada = new Aresta(viamao, alvorada, 10.8f);

        Aresta guaiba_portoAlegre = new Aresta(guaiba, portoAlegre, 30.6f);
        Aresta guaiba_canoas = new Aresta(guaiba, canoas, 35.8f);

        Vertice[] vizinhancaPoA = new Vertice[4];
        vizinhancaPoA[0] = canoas;
        vizinhancaPoA[1] = guaiba;
        vizinhancaPoA[2] = alvorada;
        vizinhancaPoA[3] = viamao;

        Vertice[] vizinhancaCanoas = new Vertice[3];
        vizinhancaCanoas[0] = portoAlegre;
        vizinhancaCanoas[1] = guaiba;
        vizinhancaCanoas[2] = alvorada;

        Vertice[] vizinhancaGuaiba = new Vertice[2];
        vizinhancaGuaiba[0] = portoAlegre;
        vizinhancaGuaiba[1] = canoas;

        Vertice[] vizinhancaAlvorada = new Vertice[3];
        vizinhancaAlvorada[0] = portoAlegre;
        vizinhancaAlvorada[1] = canoas;
        vizinhancaAlvorada[2] = viamao;

        Vertice[] vizinhancaViamao = new Vertice[2];
        vizinhancaViamao[0] = portoAlegre;
        vizinhancaViamao[1] = alvorada;

        Aresta[] conexoesPoA = new Aresta[4];
        conexoesPoA[0] = portoAlegre_canoas;
        conexoesPoA[1] = portoAlegre_alvorada;
        conexoesPoA[2] = portoAlegre_viamao;
        conexoesPoA[3] = portoAlegre_guaiba;

        Aresta[] conexoesCanoas = new Aresta[3];
        conexoesCanoas[0] = canoas_portoAlegre;
        conexoesCanoas[1] = canoas_Alvorada;
        conexoesCanoas[2] = canoas_guaiba;

        Aresta[] conexoesAlvorada = new Aresta[3];
        conexoesAlvorada[0] = alvorada_portoAlegre;
        conexoesAlvorada[1] = alvorada_canoas;
        conexoesAlvorada[2] = alvorada_viamao;

        Aresta[] conexoesViamao = new Aresta[2];
        conexoesViamao[0] = viamao_portoAlegre;
        conexoesViamao[1] = viamao_alvorada;

        Aresta[] conexoesGuaiba = new Aresta[2];
        conexoesGuaiba[0] = guaiba_portoAlegre;
        conexoesGuaiba[1] = guaiba_canoas;

        portoAlegre.setVizinhanca(vizinhancaPoA);
        canoas.setVizinhanca(vizinhancaCanoas);
        guaiba.setVizinhanca(vizinhancaGuaiba);
        alvorada.setVizinhanca(vizinhancaAlvorada);
        viamao.setVizinhanca(vizinhancaViamao);

        portoAlegre.setConexoes(conexoesPoA);
        canoas.setConexoes(conexoesCanoas);
        guaiba.setConexoes(conexoesGuaiba);
        alvorada.setConexoes(conexoesAlvorada);
        viamao.setConexoes(conexoesViamao);

//        portoAlegre.exibeInformacoesCidade();
//        canoas.exibeInformacoesCidade();

        Vertice[] cidades = new Vertice[5];
        cidades[0] = portoAlegre;
        cidades[1] = canoas;
        cidades[2] = guaiba;
        cidades[3] = alvorada;
        cidades[4] = viamao;

        Aresta[][] conexoes = new Aresta[5][1];
        conexoes[0] = conexoesPoA;
        conexoes[1] = conexoesCanoas;
        conexoes[2] = conexoesAlvorada;
        conexoes[3] = conexoesViamao;
        conexoes[4] = conexoesGuaiba;

        Grafo grafo = new Grafo(cidades, conexoes);

        grafo.listaCidades();

        grafo.listaCidadesVizinhas(portoAlegre);
        grafo.listaCidadesVizinhas(canoas);
        grafo.listaCidadesVizinhas(alvorada);
        grafo.listaCidadesVizinhas(viamao);
        grafo.listaCidadesVizinhas(guaiba);

//        grafo.listaConexoes();

        int opcao = 0;
        while (opcao != 5) {
            geraMenu();
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o nome da cidade: ");
                    String nomeCidade = entrada.nextLine();
                    Vertice nomeDaCidade = new Vertice(nomeCidade);
                    grafo.cadastraCidade(nomeDaCidade);
                    System.out.println("Cidade cadastrada com sucesso!");
                }

                case 2 -> {
                    if (grafo.getCidades().length < 2) {
                        System.out.println("É necessário cadastrar pelo menos duas cidades antes de criar uma conexão.");
                        break;
                    }

                    grafo.listaCidades();
                    System.out.println();

                    System.out.print("Digite o nome da cidade de origem: ");
                    String nomeOrigem = entrada.nextLine();
                    Vertice origem = grafo.getCidadePorNome(grafo, nomeOrigem);

                    System.out.print("Digite o nome da cidade de destino: ");
                    String nomeDestino = entrada.nextLine();
                    Vertice destino = grafo.getCidadePorNome(grafo, nomeDestino);

                    if (origem == null || destino == null) {
                        System.out.println("Cidade de origem ou destino não encontrada.");
                        break;
                    }

                    if (origem.equals(destino)) {
                        System.out.println("A cidade de origem não pode ser igual à cidade de destino.");
                        break;
                    }

                    System.out.print("Digite a distância entre as cidades: ");
                    float distancia = entrada.nextFloat();
                    entrada.nextLine();

                    Aresta conexao = new Aresta(origem, destino, distancia);
                    grafo.setConexao(conexao);

                    System.out.println("Conexão cadastrada com sucesso!");
                }

                case 3 -> { grafo.listaCidades(); }
                case 4 -> { grafo.listaConexoes(); }
                case 5 -> { System.out.println("Programa Finalizado."); }
                default -> { System.out.println("Opção inválida!"); }
            }
        }
        entrada.close();
    }

    public static void geraMenu() {
        System.out.println("*** Sistema de Grafos ***");
        System.out.println("Escolha uma opção: ");
        System.out.println("1. Cadastrar cidade");
        System.out.println("2. Cadastrar conexão");
        System.out.println("3. Listar cidades");
        System.out.println("4. Listar conexões");
        System.out.println("5. Sair");
        System.out.print("Opção: ");
    }
}