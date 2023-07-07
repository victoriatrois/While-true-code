public class Funcionario {
    private String nome;
    private String sobrenome;
    private String CPF;
    private float salario;
    private String cargo;

    public Funcionario() {
        this.nome = this.getNome();
        this.sobrenome = this.getSobrenome();
        this.CPF = getCPF();
        this.salario = this.getSalario();
        this.cargo = this.getCargo();
    }
    Funcionario(String nome, String sobrenome, String CPF, float salario, String cargo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void exibeInformacoes() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Sobrenome: " + this.getSobrenome());
        System.out.println("CPF: " + this.getCPF());
        System.out.printf("Salário: R$%.2f%n", this.getSalario());
        System.out.println("Cargo: " + this.getCargo() + "\n");
    }
}
