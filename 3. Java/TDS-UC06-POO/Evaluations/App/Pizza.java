public class Pizza extends Link {

    public int pizzaID;
    public String nomePizza;
    public int tamanhoPizza;
    public double precoPizza;
    public String descricaoPizza;

    @Override
    public String toString() {
        return "ID: " + this.pizzaID + "\nSabor: " + this.nomePizza + "\nTamanho: " + this.tamanhoPizza + "\nPreço: R$"
                + this.precoPizza + "\nDescrição: " + this.descricaoPizza;
    }

    public String getNomePizza() {
        return nomePizza;
    }

    public void setNomePizza(String nomePizza) {
        this.nomePizza = nomePizza;
    }

    public int getTamanhoPizza() {
        return tamanhoPizza;
    }

    public void setTamanhoPizza(int tamanhoPizza) {
        this.tamanhoPizza = tamanhoPizza;
    }

    public double getPrecoPizza() {
        return precoPizza;
    }

    public void setPrecoPizza(double precoPizza) {
        this.precoPizza = precoPizza;
    }

    public String getDescricaoPizza() {
        return descricaoPizza;
    }

    public void setDescricaoPizza(String descricaoPizza) {
        this.descricaoPizza = descricaoPizza;
    }

    public int getPizzaID() {
        return pizzaID;
    }

    public void setPizzaID(int pizzaID) {

        this.pizzaID = pizzaID;
    }

}
