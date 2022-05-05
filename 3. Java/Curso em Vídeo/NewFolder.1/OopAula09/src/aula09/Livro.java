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
    public Livro(String tipo, String autor, int totalPag, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.leitor = leitor;
    }
    
    //métodos acessores
    private String getTitulo(){
        return titulo;
    }
    private void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    private String getAutor(){
        return autor;
    }
    private void setAutor(String autor){
        this.autor = autor;
    }
    
    private int getTotalPag(){
        return totalPag;
    }
    private void setTotalPag(int totalPag){
        this.totalPag = totalPag;
    }
    
    private int getPagAtual(){
        return pagAtual;
    }
    private void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }
    
    private boolean isAberto(){
        return aberto;
    }
    private void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    
    //métodos especiais
    public String detalhes(){
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", totalPag=" + totalPag + ", pagAtual=" + pagAtual + ", aberto=" + aberto + ", leitor=" + leitor + '}';
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
    public void folhear() {
        if (this.isAberto()== false){
            for (int i = this.getPagAtual(); i == 0; i-=1){
            System.out.print(i + ", ");
            }
        } else {
            System.out.println("Para folhear o livro ele precisa estar fechado.");
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
