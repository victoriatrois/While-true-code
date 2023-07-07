public class Aresta {
    private Vertice origem;
    private Vertice destino;
    private float distancia;

    public Aresta(Vertice origem, Vertice destino, float distancia) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public Vertice getOrigem() {
        return origem;
    }

    public Vertice getDestino() {
        return destino;
    }

    public float getDistancia() {
        return distancia;
    }
}
