/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopaula05;

/**
 *
 * @author v3gc
 */
public class OopAula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("cc");
        p1.estadoAtual();
        p1.depositar(300);
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("cp");
        p2.depositar(500);
        p2.sacar(100);
        p2.estadoAtual();
        
    }
    
}
