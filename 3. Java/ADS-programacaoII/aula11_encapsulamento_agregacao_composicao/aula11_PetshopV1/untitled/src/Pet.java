import java.util.ArrayList;

public class Pet {
    private String especie;
    private String raca;
    private String nome;
    private int idade;
    private ArrayList<Tutor> tutores;

    public Pet(String especie, String raca, String nome, int idade, Tutor... tutores) {
        this.especie = especie;
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
        this.tutores = new ArrayList<Tutor>();
        for (Tutor tutor : tutores) {
            this.tutores.add(tutor);
        }
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<Tutor> getTutores() {
        return tutores;
    }

    public void setTutores(String[]... tutores) {
        for (String[] tutor : tutores) {
            if (tutor.length < 5) {
                throw new IllegalArgumentException("Informe exatamente nesta ordem as informações de: nome (completo), CPF, endereço, e-maill e pelo menos um telefone.");
            }

            String nomeCompleto = tutor[0];
            int CPF = Integer.parseInt(tutor[1]);
            String endereco = tutor[2];
            String email = tutor[3];
            Integer[] telefones = new Integer[tutor.length-4];
            for (int i = 4; i < tutor.length; i++) {
                telefones[i] = Integer.valueOf(tutor[i]);
            }

            Tutor novoTutor = new Tutor(nomeCompleto, CPF, endereco, email, telefones);
            this.tutores.add(novoTutor);
        }
    }

    public void exibeTutores() {
        for (int i = 0; i < this.tutores.size(); i++) {
            System.out.println("\tTutor " + (i + 1) + ": " + this.tutores.get(i));
        }
    }

    public void exibeInformacoesDoPet() {
        System.out.println("*** Informações do Pet ***");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Espécie : " + this.getEspecie());
        System.out.println("Raça : " + this.getRaca());
        System.out.println("Idade : " + this.getIdade());
        System.out.println("Tutores : ");
        this.exibeTutores();
        System.out.println();
    }

    public void exibeInformacoesDosTutores() {
        System.out.println("*** Informações dos Tutores ***");
        for (int i = 0; i < this.tutores.size(); i++) {
            System.out.println("\tTutor " + (i + 1) + ": " + this.tutores.get(i));
            System.out.println();
        }

    }
}
