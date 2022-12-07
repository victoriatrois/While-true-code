import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PizzaGoldCardapio extends Bebida {

    DecimalFormat df = new DecimalFormat("#,###.00");
    List<Link> pedido = new ArrayList<>();

    public int numeroMesa;

    double soma = 0;

    public void armazenaPizza(Pizza p) {
        pedido.add(p);
        soma += p.getPrecoPizza();
    }

    public void armazenaBebida(Bebida b) {
        pedido.add(b);
        soma += b.getPrecoBebida();
    }

    public void listarPedido() {

        System.out.println("Numero da mesa: " + this.numeroMesa);
        System.out.println();
        for (Link i : pedido) {
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println(i.toString());
        }
        System.out.println();
        System.out.println("Valor Total: " + df.format(soma));
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

}
