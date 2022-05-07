/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09;

/**
 *
 * @author v3gc
 */
public class Aula09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro [3];
        
        p[0] = new Pessoa ("Pedro", 22, "M");
        p[1] = new Pessoa ("Maria", 25, "F");
        
        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Cândido", 800, p[0]);
        
        l[1].abrir();
        l[1].folhear(60);
        l[1].avancarPag();
        System.out.println(l[1].detalhes());
    }
    
}
