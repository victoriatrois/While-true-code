package oopaula12;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author v3gc
 */
public class OopAula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        /*m.setPeso(35.5f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        r.setPeso(2.7f);
        r.setCorEscama("Verde");
        r.alimentar();
        r.locomover();
        r.emitirSom();
        
        p.setPeso(0.1f);
        p.setCorEscama("Dourada");
        p.alimentar();
        p.locomover();
        p.emitirSom();
        p.soltarBolha();*/
        
        Mamifero cangu = new Canguru();
        Mamifero doguinho = new Cachorro();
        Reptil cobra = new Cobra();
        Reptil tata = new Tartaruga();
        Peixe pxDourado = new PeixeDourado();
        Ave arara = new Ave();
        
        cangu.locomover();
        doguinho.locomover();
        cobra.locomover();
        tata.locomover();
        pxDourado.alimentar();
        arara.alimentar();
        tata.alimentar();
    }
    
}
