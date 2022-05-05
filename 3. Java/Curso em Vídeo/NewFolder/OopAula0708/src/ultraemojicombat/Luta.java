/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author v3gc
 */
public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;
    
    //Métodos públicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && (l1!=l2)){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            /* se der ruim no código atualizar as linhas do if e do else para:
             * this.aprovada = true; this.desafiado = l1; this.desafiante = l2; e
             * this.aprofada = false; this desafiado = null; this.desafiante = null;
             */
        }
    }
    
    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            switch(vencedor){
                case 0:
                    System.out.println("Temos um empate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.perderLuta();
                    break;
                    
                case 1:
                    System.out.println(desafiado.getNome() + " é o vencedor!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                    
                case 2:
                    System.out.println(desafiante.getNome() + " é o vencedor!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
            
            }
                
        } else {
            System.out.println("A luta não pode acontecer.");
        }
    }
    
    //Métodos acessores
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }
    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
