public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Vic do cabelo roxo", 999000889, "Rua das flores 1234", "fedgg@mail.com", 9999, 99999, 88888);

        pessoa.exibeInformacoesDaPessoa();
        pessoa.exibeInformacoesDeContato();

        Pet zozo = new Pet("Canino", "Yorkshire", "Zoey", 13);
        Pet teteh = new Pet("Canino", "Yorkshire", "Ted", 8);


        Tutor vic = new Tutor("Victoria Trois", 999888777, "Rua dos doguinhos, 433", "maeDePet@amoPets.com", zozo, teteh);
        vic.setTelefones(new int[]{12333321, 332456772});

        vic.exibeInformacoesDaPessoa();
        vic.exibeInformacoesDeContato();
        for (Pet petsDaVic : vic.getPets()) {
            petsDaVic.exibeInformacoesDoPet();
        }
    }
}