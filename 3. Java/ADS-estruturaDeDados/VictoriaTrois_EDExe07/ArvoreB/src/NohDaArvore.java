import java.util.ArrayList;
import java.util.List;

class NohDaArvore {
    List<Integer> chaves;
    List<NohDaArvore> filhos;
    boolean folha;

    public NohDaArvore() {
        chaves = new ArrayList<>();
        filhos = new ArrayList<>();
        folha = true;
    }
}