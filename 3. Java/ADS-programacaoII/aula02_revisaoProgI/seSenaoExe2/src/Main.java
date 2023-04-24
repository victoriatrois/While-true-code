public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(00000001);
        conta1.passarNoDebito(50);
        conta1.temSaldo();
        conta1.passarNoDebito(1000);
        conta1.temSaldo();
        conta1.passarNoCredito(1000);
        System.out.println(conta1.getCredito());
        System.out.println(conta1.getDebito());
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.getSaldoAtual());
        System.out.println(conta1.getLimite());
        conta1.temSaldo();
    }
}