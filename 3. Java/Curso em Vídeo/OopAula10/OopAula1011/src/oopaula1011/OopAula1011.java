/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopaula1011;

/**
 *
 * @author v3gc
 */
public class OopAula1011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Estudante e1 = new Estudante();
        e1.setNome("Cláudio");
        e1.setMatricula(1111);
        e1.setCurso("Informática");
        e1.setSexo("M");
        System.out.println(e1.toString());
        
        Professore p3 = new Professore();
        Funcionarie p4 = new Funcionarie();
        
                
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        //p1.recebeAumento(2.5);
        //p2.mudaTrabalho();
        //p4.cancelaMatricula();
    }
    
}
