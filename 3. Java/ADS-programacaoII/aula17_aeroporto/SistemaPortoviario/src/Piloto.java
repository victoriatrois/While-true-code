public class Piloto extends Funcionario{
    protected String brevet;
    protected int horasDeVoo;
    public Piloto(String nome, String cargo, double salario, String brevet, int horasDeVoo) {
        super(nome, cargo, salario);
        this.brevet = brevet;
        this.horasDeVoo = horasDeVoo;
    }

    public String getBrevet() {
        return brevet;
    }

    public void setBrevet(String brevet) {
        this.brevet = brevet;
    }

    public int getHorasDeVoo() {
        return horasDeVoo;
    }

    public void setHorasDeVoo(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    @Override
    public void exibeInformacoes() {
        super.exibeInformacoes();
        System.out.println("\tBrevet: " + this.getBrevet());
        System.out.println("\tHoras de Voo: " + this.getHorasDeVoo());
        System.out.println();
    }

    @Override
    public void atualizaSalario(double novoSalario) {
        super.atualizaSalario(novoSalario);
    }

    @Override
    public void atualizaSalario() {
        super.atualizaSalario();
    }

    public void incrementaHorasDeVoo(int incremento) {
        this.setHorasDeVoo(this.getHorasDeVoo() + incremento);
    }
}
