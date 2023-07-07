import java.util.ArrayList;

public class Tutor extends Pessoa {
    private ArrayList<Pet> pets;

    public Tutor(String nomeCompleto, int CPF, String endereco, String email, Integer... telefones) {
        super(nomeCompleto, CPF, endereco, email, telefones);
        this.pets = new ArrayList<>();
    }

    public Tutor(String nomeCompleto, int CPF, String endereco, String email, Pet... pets) {
        super(nomeCompleto, CPF, endereco, email);
        this.pets = new ArrayList<>();
        for (Pet pet : pets) {
            this.pets.add(pet);
        }
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(String[]... pets) {
        for (String[] pet : pets) {
            if (pet.length != 4) {
                throw new IllegalArgumentException("Informe exatamente nesta ordem as informações de: espécie, raça, nome e idade.");
            }

            String especie = pet[0];
            String raca = pet[1];
            String nome = pet[2];
            int idade = Integer.parseInt(pet[3]);

            Pet novoPet = new Pet(especie, raca, nome, idade);
            this.pets.add(novoPet);
        }
    }
}
