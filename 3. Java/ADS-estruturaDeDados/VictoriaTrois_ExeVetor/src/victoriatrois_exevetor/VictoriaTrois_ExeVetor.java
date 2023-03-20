

            // TODO: percorrer o vetor e verificar se o valor informado é encontrado (item 4)
            case 4:
                System.out.println("opcao 4.");
                break;

            // TODO: identificar quantos valores significativos existem no vetor (item 5)
            case 5:
                System.out.println("opcao 5.");
                break;

            // TODO: identificar e exibir o maior valor do vetor e sua posição (item 6)
            case 6:
                System.out.println("opcao 6.");
                break;

            // TODO: identificar e exibir o menor valor do vetor e sua posição (item 7)
            case 7:
                System.out.println("opcao 7.");
                break;

            // TODO: exibir todos os elementos do vetor (item 8)
            case 8:
                System.out.println("opcao 8.");
                break;

            default:
                System.out.println("Digite uma opção válida.");
                break;

        }
    }
    geraMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Finalizar programa");
        System.out.println("1 - Criar vetor");
        System.out.println("2 - Adicionar valor");
        System.out.println("3 - Apagar valor");
        System.out.println("4 - Procurar valor");
        System.out.println("5 - Identificar valores significativos");
        System.out.println("6 - Exibir maior valor");
        System.out.println("7 - Exibir menor valor");
        System.out.println("8 - Exibir todos os elementos");
    }
}
