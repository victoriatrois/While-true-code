public class Main {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("Senac", "8658769/0001", "Avenida Venâncio Aires, 392", "Cursos livres");
        Empresa empresa2 = new Empresa("Up Kids School", "89122769/0001", "Avenida Loureiro da Silva, 743", "Ensino Infantil Bilíngue");
        Empresa empresa3 = new Empresa("Léo Pastel", "5658788/00076", "Avenida Mauá Aires, 1001", "Pastéis e bebidas");

        Remedio remedio1 = new Remedio("Espirolactona", "Vermelha", 37.64f, "Bayer", true);
        Remedio remedio2 = new Remedio("Ibuprofeno", "branca", 29.37f, "Bayer", true);
        Remedio remedio3 = new Remedio("Dipirona", "Azul", 20.40f, "Bayer", true);

        Funcionario funcionario1 = new Funcionario("Denise", "Maia", "99009877432", 3500f, "Secretária");
        Funcionario funcionario2 = new Funcionario("Marli", "Silva", "76533289067", 4600f, "Desenvolvedora júnior");
        Funcionario funcionario3 = new Funcionario("Marcelo", "Costa", "43211256721", 3000f, "Técnico em saúde bucal");

        Livro livro1 = new Livro("Matilda e suas enxaquecas", "829342832030232", 37.64f, "Rainha Terceira", "VMC", true);
        Livro livro2 = new Livro("As Palavras e as Coisas", "203023222456330", 50.78f, "Michel Foucault", "Vozes", true);
        Livro livro3 = new Livro("Redes, Liberdades e Controle", "934283203023288", 79.80f, "Benjamin Loveluck", "Vozes", true);

        empresa1.exibeInformacoes();
        empresa1.setEndereco("Rua Espírito Santo, 218");
        empresa2.exibeInformacoes();
        empresa3.exibeInformacoes();

        remedio1.exibeInformacoes();
        remedio2.exibeInformacoes();
        remedio3.exibeInformacoes();

        funcionario1.exibeInformacoes();
        funcionario2.exibeInformacoes();
        funcionario3.exibeInformacoes();

        livro1.exibeInformacoes();
        livro2.exibeInformacoes();
        livro3.exibeInformacoes();
    }
}