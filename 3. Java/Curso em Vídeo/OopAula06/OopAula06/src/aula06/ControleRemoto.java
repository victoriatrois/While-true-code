/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06;

/**
 *
 * @author v3gc
 */
public class ControleRemoto implements Controlador{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //método construtor
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    //métodos acessores
    private int getVolume(){
        return volume;
    }
    private void setVolume(int volume){
        this.volume = volume;
    }
    
    private boolean isLigado(){
        return ligado;
    }
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    
    private boolean isTocando(){
        return tocando;
    }
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }
    
    //Métodos abstratos
    @Override
    public void ligar() {
        if(this.isLigado() == false){
            this.setLigado(true);
        }
    }
    @Override
    public void desligar() {
        if (this.isLigado()){
            this.setLigado(false);
        }
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()){
            System.out.println("Está ligado? " + this.isLigado());
            System.out.println("Está tocando? "+ this.isTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
        }
        System.out.println("");
    }
    @Override
    public void fecharMenu() {
        if (this.isLigado()){
            System.out.println("Fechando menu...");
        }
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume()+1);
        }
    }
    @Override
    public void menosVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume()-1);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume()>0){
            this.setVolume(0);
        }
    }
    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
       if (this.isLigado() && !(this.isTocando())){
           this.setTocando(true);
       } 
    }
    @Override
    public void pause() {
        if (this.isLigado() && (this.isTocando())){
            this.setTocando(false);
        }
    }
}
