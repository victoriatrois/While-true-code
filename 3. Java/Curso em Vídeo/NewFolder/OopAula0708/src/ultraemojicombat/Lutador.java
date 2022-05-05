/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombat;

/**
 *
 * @author v3gc
 */
public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Métodos públicos
    public void apresentar(){
        System.out.println("----------------------------------------------------");
        System.out.println("Chegou a hora! Apresentamos o lutador " + this.getNome() + "!");
        System.out.println("Diretamente do(a) " + this.getNacionalidade() + ",");
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " de altura,");
        System.out.println("pesando " + this.getPeso() + "Kg com um cartel de:");
        System.out.println(this.getVitorias() + " vitórias,");
        System.out.println(this.getDerrotas() + " derrotas e");
        System.out.println(this.getEmpates() + "empates!");
    }
    
    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria() + ".");
        System.out.println("Ganhou " + this.getVitorias() + " vezes,");
        System.out.println("perdeu " + this.getDerrotas() + " vezes e");
        System.out.println("empatou " + this.getEmpates() + " vezes.");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
        //esse comando anterior equivale a this.vitorias = this.vitorias + 1;
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() +1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    //Métodos Especiais
    //Método construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    //Métodos acessores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválida";
        } else if (this.peso <= 70.3){
            this.categoria = "Leve";
        } else if (this.peso <= 83.9){
            this.categoria = "Médio";
        } else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválida";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
