/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc06atividade04;

import java.text.Normalizer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/**
 *
 * @author v3gc
 */
public class Historico {
    
    public static String removeDiacriticos(String s) {
	    s = Normalizer.normalize(s, Normalizer.Form.NFD);
	    s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
	    return s;
	}
    
    Queue<Float> tributos;
    
    public Historico() {
        tributos = new LinkedList<>();
    }
    
    public void armazenaTributo(Float calculo) {
        Scanner entrada = new Scanner(System.in);

        
        if (tributos.size() > 9) {
            System.out.println("Número máximo de cálculos cadastrados. Continuar implica na exclusão do cálculo mais antigo.");
            System.out.println("Deseja continuar? Digite Sim ou Não.");
                String exclusaoCalculoMaisAntigo = removeDiacriticos(entrada.nextLine().toLowerCase());
                
                while(! exclusaoCalculoMaisAntigo.equals("sim") || ! exclusaoCalculoMaisAntigo.equals("nao")) {
                    System.out.println("Entrada inv[alida. Digite Sim ou Não.");
                }
                
                if (exclusaoCalculoMaisAntigo.equals("sim")) {
                    tributos.remove();
                    
                } else {
                    System.out.println("Operação cancelada.");
                }
                
        } else {
            tributos.add(calculo);
        }
    }
    
    public void exibeCalculos() {
        for (Float calculo : tributos) {
            System.out.println(calculo);
        }
    }
    
    public boolean estaVazio() {
        if (tributos.isEmpty()){
        }
        return true;
    }
}
