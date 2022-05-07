/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopaula1011;

/**
 *
 * @author v3gc
 */
public class Bolsista extends Estudante{
    //atributos
    private float bolsa;
    
    //métodos acessores
    public void setBolsa(float bolsa){
        this.bolsa = bolsa;
    }
    
    public float getBolsa(){
        return bolsa;
    }
    
    //métodos próprios
    public void renovarBolsa(){
        System.out.println("Bolsa de " + this.getNome() + "renovada.");
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Bolsa de " + this.getNome() + " recebida.");
    }
}
