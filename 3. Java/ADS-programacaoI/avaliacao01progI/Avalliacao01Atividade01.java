import java.util.Scanner;

public class Avalliacao01Atividade01 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pri, seg, ter, res;
        System.out.println("Prova 01 - Questão 01");
        System.out.println("Informe um valor inteiro positivo: ");
        pri = keyboard.nextInt();
        System.out.println("Informe um valor inteiro positivo: ");
        seg = keyboard.nextInt();
        System.out.println("Informe um valor inteiro positivo: ");
        ter = keyboard.nextInt();
        if (seg < pri) {
            pri = pri + seg;
            seg = pri - seg;
            pri = pri - seg;
        }
        res = seg + ter;
        
        if (ter < seg) {
           seg = ter;
           ter = res - ter;
        }
        res = seg;
        
        if (pri > seg) {
           seg = pri;
           pri = res;
        }
        
        if (ter > seg + pri) {
            seg = seg + pri;
            if (seg < ter - pri) {
                pri = seg - pri;
            }
        }
        res = ter % seg;
        res = res * pri;
        System.out.println("Resultado: " + res);
    }
}