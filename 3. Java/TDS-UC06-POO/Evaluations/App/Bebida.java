public class Bebida extends Link {

    public int bebidaID;
    public String nomeBebida;
    public float quantidadeBebida;
    public double precoBebida;

    @Override
    public String toString() {
        return "ID: " + this.bebidaID + "\nNome: " + this.nomeBebida + "\n" + this.quantidadeBebida + " ml"
                + "\nPreço: R$"
                + this.precoBebida;
    }

    public String getNomeBebida() {
        return nomeBebida;
    }

    public void setNomeBebida(String nomeBebida) {
        this.nomeBebida = nomeBebida;
    }

    public float getQuantidadeBebida() {
        return quantidadeBebida;
    }

    public void setQuantidadeBebida(float quantidadeBebida) {
        this.quantidadeBebida = quantidadeBebida;
    }

    public double getPrecoBebida() {
        return precoBebida;
    }

    public void setPrecoBebida(double precoBebida) {
        this.precoBebida = precoBebida;
    }

    public int getBebidaID() {
        return bebidaID;
    }

    public void setBebidaID(int bebidaID) {
        this.bebidaID = bebidaID;
    }

}
