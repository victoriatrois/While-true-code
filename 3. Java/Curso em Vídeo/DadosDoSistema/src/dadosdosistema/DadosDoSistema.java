/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dadosdosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author v3gc
 */
public class DadosDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date dataEHora = new Date();
        System.out.println("A data e a hora do sistema é ");
        System.out.println(dataEHora.toString());
        
        Locale local = Locale.getDefault();
        System.out.println("O idioma do sistema é: ");
        System.out.println(local.getDisplayLanguage());
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do seu monitor é: ");
        System.out.println(d.width + "x" + d.height);
        
        
    }
    
}
