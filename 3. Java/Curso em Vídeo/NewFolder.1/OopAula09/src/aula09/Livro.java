/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09;

/**
 *
 * @author v3gc
 */
public class Livro implements Publicacao{
    //atributos
    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //método construtor
    public Livro(String titulo, String autor, int totalPag, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    
    //métodos acessores
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public int getTotalPag(){
        return totalPag;
    }
    public void setTotalPag(int totalPag){
        this.totalPag = totalPag;
    }
    
    public int getPagAtual(){
        return pagAtual;
    }
    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }
    
    public boolean isAberto(){
        return aberto;
    }
    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    
    //métodos especiais
    public String detalhes(){
        return "Livro{" + "titulo: " + titulo + ", autor: " + autor + ",\ntotal de páginas: " + totalPag + ", página atual: " + pagAtual + ",\nestá aberto: " + aberto + ",\nleitor: " + leitor.getNome() + ", idade: " + leitor.getIdade() + ", sexo: " + leitor.getSexo() + '}';
    }

    @Override
    public void abrir() {
        if (this.isAberto() == false){
            this.setAberto(true);
        }
    }
    @Override
    public void fechar() {
        if (this.isAberto()){
            this.setAberto(false);
        }
    }

    @Override
    public void folhear(int p) {
        if (this.isAberto()){
            if (p <= this.getTotalPag()) {
            this.pagAtual = p;
            } else {
                System.out.println("Este livro tem apenas " + this.getTotalPag() + " páginas. Folheie no máximo até ela.");
            }
        } else {
            System.out.println("Para folhear o livro, abra-o.");
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual()>0){
            this.setPagAtual(this.getPagAtual() - 1);
        }
    }
    
    
    
}
