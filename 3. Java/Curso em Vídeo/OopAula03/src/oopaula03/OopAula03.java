/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopaula03;

/**
 *
 * @author v3gc
 */
public class OopAula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta canetaEsferografica = new Caneta(); //instanciar um obj (CRIAR)
        canetaEsferografica.modelo = "BicCrystal"; 
        canetaEsferografica.cor = "azul";

        //canetaEsferografica.ponta = 0.5f;
        canetaEsferografica.carga = 80;
        canetaEsferografica.tampada = true;
        //canetaEsferografica.destampa();
        canetaEsferografica.rabisca();
        canetaEsferografica.mostraInformacoes();
    }
    
}
