import java.util.Scanner;

public class Funcionario {
    Scanner entrada = new Scanner(System.in);
    protected String nome;
    protected String cargo;
    protected double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibeInformacoes() {
        System.out.println("\t*** Informações de funcionário ***");
        System.out.println("\tNome: " + this.getNome());
        System.out.println("\tCargo: " + this.getCargo());
        System.out.println("\tSalario: " + this.getSalario());
        System.out.println();
    }

    public void atualizaSalario(double novoSalario) {
        this.setSalario(novoSalario);
    }

    public void atualizaSalario() {
        System.out.print("Digite o novo salário de " + this.getNome() + ": ");
        this.setSalario(entrada.nextDouble());
    }
}
