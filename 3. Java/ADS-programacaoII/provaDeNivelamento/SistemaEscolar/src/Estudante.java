public class Estudante {
    private String nome;
    private String sobrenome;
    private float[] nota;

    // Construtor
    public Estudante(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nota = new float[3];
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

    public float getNota(int referencia) {
        if ((referencia - 1) < this.nota.length && (referencia - 1 >= 0)) {
            return nota[referencia - 1];
        } else {
            return -1;
        }
    }

    public void setNota(int referencia, float nota) {
        this.nota[referencia - 1] = nota;
    }

    public void exibirNotas() {
        for (int i = 0; i < this.nota.length; i++) {
            System.out.println("Nota 0" + (i + 1) + ": " + getNota(i + 1));
        }
    }

    public float calculaMediaIndividual() {
        float mediaIndividual = 0;
        float somaNotas = 0;

        for(float avaliacao : nota) {
            somaNotas += avaliacao;
        }

        mediaIndividual = somaNotas/3;

        return mediaIndividual;
    }
}
