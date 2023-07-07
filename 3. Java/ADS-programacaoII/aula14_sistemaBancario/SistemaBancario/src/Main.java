import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner entrada = new Scanner(System.in);
    private static List<Banco> bancos = new ArrayList<>();
    private static List<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {

        Pessoa cliente = new Pessoa("Marcia", "Dorneles", 38, "998.009.232-12");
        Banco BB = new Banco("BB", "323.33.333/0001", 1);
        ContaCorrente contaPrincipal = new ContaCorrente(cliente, BB, 765501, "senha123", 5.99);
        ContaPoupanca reservaDeEmergencia = new ContaPoupanca(cliente, BB, 432215, 5, "senha123");
        pessoas.add(cliente);
        bancos.add(BB);

        contaPrincipal.depositaQuantia(500);
        contaPrincipal.viraMes();
        contaPrincipal.sacaQuantia(80);
        contaPrincipal.depositaQuantia(100);

        reservaDeEmergencia.depositaQuantia(1000);
        reservaDeEmergencia.viraMes();
        reservaDeEmergencia.sacaQuantia(10);
        reservaDeEmergencia.depositaQuantia(90);

        contaPrincipal.exibeInformacoes();
        reservaDeEmergencia.exibeInformacoes();

        boolean encerraPrograma = false;
        while (!encerraPrograma) {
            System.out.println("*** Sistema Bancário ***");
            System.out.println("Escolha uma opção válida:");
            System.out.println("\t1. Cadastrar Banco");
            System.out.println("\t2. Cadastrar Pessoa");
            System.out.println("\t3. Cadastrar Conta Bancária");
            System.out.println("\t4. Exibir Informações");
            System.out.println("\t0. Sair");
            System.out.print("Opção: ");
            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1 -> cadastraBanco();
                case 2 -> cadastraPessoa();
                case 3 -> cadastraContaBancaria();
                case 4 -> exibeInformacoes();
                case 0 -> encerraPrograma = true;
                default -> System.out.println("Opção inválida. Digite uma opção válida.");
            }
        }
    }

    private static void cadastraBanco() {
        int numeroBanco;

        System.out.println("*** Cadastro de Novo Banco ***");
        System.out.print("\tDigite o nome do Banco: ");
        String nomeDoBanco = entrada.nextLine();

        System.out.print("\tDigite o CNPJ do Banco: ");
        String cnpjDoBanco = entrada.nextLine();

        System.out.print("\tDigite o número do Banco: ");
        numeroBanco = entrada.nextInt();
        entrada.nextLine();

        Banco banco = new Banco(nomeDoBanco, cnpjDoBanco, numeroBanco);
        bancos.add(banco);

        System.out.println("\tBanco cadastrado com sucesso!");
        System.out.println();
    }

    private static void cadastraPessoa() {
        System.out.println("*** Cadastro de Pessoa ***");
        System.out.print("\tDigite o nome da pessoa: ");
        String nome = entrada.nextLine();

        System.out.print("\tDigite o sobrenome da pessoa: ");
        String sobrenome = entrada.nextLine();

        System.out.print("\tDigite a idade da pessoa: ");
        int idade = entrada.nextInt();

        entrada.nextLine();
        System.out.print("\tDigite o CPF da pessoa: ");
        String cpf = entrada.nextLine();

        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, cpf);
        pessoas.add(pessoa);

        System.out.println("\tPessoa cadastrada com sucesso!");
        System.out.println();
    }

    private static void cadastraContaBancaria() {
        if (bancos.isEmpty() || pessoas.isEmpty()) {
            System.out.println("É necessário cadastrar pelo menos um Banco e uma Pessoa antes de criar uma Conta Bancária.");
            return;
        }

        System.out.println("*** Cadastro de Conta Bancária ***");
        System.out.println("\tSelecione o titular da conta:");
        exibePessoas();
        int posicaoDaPessoa = entrada.nextInt();
        entrada.nextLine();

        System.out.println("\tSelecione o Banco:");
        exibeBancos();

        int posicaoDoBanco = entrada.nextInt();
        entrada.nextLine();

        Banco bancoSelecionado = bancos.get(posicaoDoBanco - 1);
        Pessoa pessoaSelecionada = pessoas.get(posicaoDaPessoa - 1);

        System.out.print("\tDigite o número da conta: ");
        int numeroDaConta = entrada.nextInt();

        System.out.print("\tDigite a senha a conta: ");
        String tipoConta = entrada.nextLine();


        System.out.print("\tTipo da Conta (Corrente/Poupança): ");
        String senha = entrada.nextLine();

        ContaBancaria contaBancaria;
        if (tipoConta.equalsIgnoreCase("corrente")) {
            System.out.println("\tDigite a taxa mensal da conta: ");
            Double taxaMensal = entrada.nextDouble();

            contaBancaria = new ContaCorrente(pessoaSelecionada, bancoSelecionado, numeroDaConta, senha, taxaMensal);

        } else if (tipoConta.equalsIgnoreCase("poupança")) {
            System.out.print("\tDigite o número da variação: ");
            int variacao = entrada.nextInt();

            contaBancaria = new ContaPoupanca(pessoaSelecionada, bancoSelecionado, numeroDaConta, variacao, senha);
        } else {
            System.out.println("Tipo de conta inválido. O cadastro foi cancelado.");
            return;
        }

        pessoaSelecionada.getContas().add(contaBancaria);
        System.out.println("Conta Bancária cadastrada com sucesso!");
        System.out.println();
    }

    private static void exibeInformacoes() {
        System.out.println("*** Exibir Informações ***");
        System.out.println("\t1. Exibir Bancos");
        System.out.println("\t2. Exibir Pessoas");
        System.out.println("\t3. Exibir Contas Bancárias");
        System.out.print("Opção: ");
        int opcao = entrada.nextInt();
        entrada.nextLine(); // Consume the newline character

        switch (opcao) {
            case 1:
                exibeBancos();
                break;
            case 2:
                exibePessoas();
                break;
            case 3:
                exibeContasBancarias();
                break;
            default:
                System.out.println("Opção inválida. Digite uma opção válida.");
                break;
        }
        System.out.println();
    }

    private static void exibeBancos() {
        if (bancos.isEmpty()) {
            System.out.println("Não há bancos cadastrados.");
            return;
        }

        System.out.println("*** Bancos Cadastrados ***");
        for (int i = 0; i < bancos.size(); i++) {
            System.out.println("Cadastro " + (i + 1) + ": ");
            bancos.get(i).exibeInformacoes();
        }
        System.out.println();
    }

    private static void exibePessoas() {
        if (pessoas.isEmpty()) {
            System.out.println("Não há pessoas cadastradas.");
            return;
        }

        System.out.println("*** Pessoas Cadastradas ***");
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa pessoa = pessoas.get(i);
            System.out.println("Cadastro " + (i + 1) + ": ");
            pessoa.exibeInformacoesPessoais();
        }
        System.out.println();
    }

    private static void exibeContasBancarias() {
        if (pessoas.isEmpty()) {
            System.out.println("Não há pessoas cadastradas.");
            return;
        }

        System.out.println("\tSelecione a Pessoa:");
        exibePessoas();
        int numeroDeCadastro = entrada.nextInt();
        entrada.nextLine();

        Pessoa pessoaSelecionada = pessoas.get(numeroDeCadastro - 1);

        System.out.print("Peça ao cliente que digite sua senha: ");
        String senha = entrada.nextLine();

        if (pessoaSelecionada.getContas().get(numeroDeCadastro - 1).verificaSenha(senha)) {
            pessoaSelecionada.exibeInformacoesBancarias();
        } else {
            System.out.println("Senha incorreta. Não é possível exibir as informações bancárias.");
        }
    }
}
