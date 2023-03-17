public class Estudante {
    private String nome;
    private String sobrenome;
    private float nota;

    // Construtor
    public Estudante(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    // Acessores
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

    public float nota() {
        return nota;
    }

    public void setSobrenome(float nota) {
        this.nota = nota;
    }
}
