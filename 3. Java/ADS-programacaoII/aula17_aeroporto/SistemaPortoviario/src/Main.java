public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Pamela Anderson", "Aeromoça", 2500);
        Piloto p1 = new Piloto("Samara Jackson", "piloto", 5700, "hhygt", 100);
        Aviao a1 = new Aviao("TF-2014", "QANTAS jet", "Boeing 747=400");
        Voo v1 = new Voo("LA303", "Havaí", "Los Angeles", p1, a1);

        f1.exibeInformacoes();
        a1.exibeInformacoes();
        p1.exibeInformacoes();
        v1.exibeInformacoes();
        f1.atualizaSalario();
        f1.atualizaSalario(3000);
        p1.incrementaHorasDeVoo(1000);
        f1.exibeInformacoes();
        p1.exibeInformacoes();
    }
}