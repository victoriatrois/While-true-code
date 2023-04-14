public class Remedio {
    private String nome;
    private String tarja;
    private float valor;
    private String laboratorio;
    private boolean disponivel;

    public Remedio() {
        this.nome = this.getNome();
        this.tarja = this.getTarja();
        this.valor = this.getValor();
        this.laboratorio = this.getLaboratorio();
        this.disponivel = this.isDisponivel();
    }

    public Remedio(String nome, String tarja, float valor, String laboratorio, boolean disponivel) {
        this.nome = nome;
        this.tarja = tarja;
        this.valor = valor;
        this.laboratorio = laboratorio;
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTarja() {
        return tarja;
    }

    public void setTarja(String tarja) {
        this.tarja = tarja;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void exibeInformacoes() {
        System.out.println("Medicamento: " + this.getNome());
        System.out.println("Tarja: " + this.getTarja());
        System.out.printf("Valor: R$%.2f%n", this.getValor());
        System.out.println("Laboratório responsável: " + this.getLaboratorio());
        System.out.println("Em estoque: " + this.isDisponivel() + "\n");
    }
}
