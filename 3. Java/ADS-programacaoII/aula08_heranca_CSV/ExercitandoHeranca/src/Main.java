import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

        Veiculo veiculoGenerico = new Veiculo("Ford", "Ka", "Brasil", 0, 0, 55000, 4);
        VeiculoTerrestre veiculoTerrestreGenerico = new VeiculoTerrestre("FW", "Gol", "Brasil", 0, 0, 55000, 4, "ixn0h63", "Victoria");
        VeiculoAereo veiculoAereoGenerico = new VeiculoAereo("Ford", "Ka", "Brasil", 0, 250, "jdyya098", "GOL:", 0, 0, 0);
        VeiculoMaritmo veiculoMaritmoGenerico = new VeiculoMaritmo("Ford", "Ka", "Brasil", 0, 0, 609000, 4, "hgyyt5436", "SGC Maritima");
        Carro carro = new Carro("Chevrolet", "Spin", "Brasil", 0, 0, 55000, 7, "IOX5050", "Victoria", 56,"passeio", 56);
        Caminhao caminhao = new Caminhao("GM", "Cargo", "Brasil", 0, 0, 55000, 4, "ixn0h63", "Jasmin", 3, 10000);
        Moto moto = new Moto("Honda", "PCX", "Brasil", 0, 0, 18000, 2, "ixn0h63", "João", 150);
        Aviao aviao = new Aviao("Boing", "B7889hgtt", "Brasil", 890000, 200, "hhjuy778tt", "Varig", 0, 0, 0, 6);
        Helicopitero helicopitero = new Helicopitero("JetPack", "MeetGrinder", "Brasil", 768900, 5, 4, "JKLL909", "HYTT Aviações", 0, 0, 0);
        Navio navio = new Navio("Ford", "Ka", "Brasil", 0, 0, 990870, 560, "oplu87008", "LLPO transportes Aquaticos", "La bonita");
        Submarino submarino = new Submarino("Ford", "Ka", "Brasil", 0, 0, 9908876, 20, "jjuytt6666", "SGC Maritima", 0, 500);

        veiculos.add(veiculoGenerico);
        veiculos.add(veiculoTerrestreGenerico);
        veiculos.add(veiculoAereoGenerico);
        veiculos.add(veiculoMaritmoGenerico);
        veiculos.add(carro);
        veiculos.add(caminhao);
        veiculos.add(moto);
        veiculos.add(aviao);
        veiculos.add(helicopitero);
        veiculos.add(navio);
        veiculos.add(submarino);

        for (Veiculo item:
                veiculos) {
            item.exibeInformacoes();
            System.out.println();
        }
    }
}