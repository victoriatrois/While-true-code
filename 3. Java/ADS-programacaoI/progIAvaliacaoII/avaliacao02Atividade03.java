public class avaliacao02Atividade03 {
    public static void main(String[] args) {
        int A;
        int B;
        int C;
        int D;
        int X;
        int I;
        
        System.out.println("Questão 03");
        
        A = 4;
        B = 3;
        C = 2;
        D = 1;
        I = 1;
        
        while (I != 0) {
            I = 0;
            if ((A % 2) > (B % 3)) {
                System.out.println("Início do if \nA => " + A + " - B => " + B + " - C => " + C+ " - D => " + D);
                X = A;
                A = B;
                B = X;
                I--;
                System.out.println("Fim do if \nA => " + A + " - B => " + B + " - C => " + C+ " - D => " + D);
            } else if ((C % 3) > (D % 2)) {
               System.out.println("Início do else if \nA => " + A + " - B => " + B + " - C => " + C+ " - D => " + D);
               X = C;
               C = D;
               D = X;
               ++I;
               System.out.println("Fim do else if \nA => " + A + " - B => " + B + " - C => " + C+ " - D => " + D);
            }
            A++;
            C++;
            System.out.println("Resultado parcial do while" + I + "ª volta\nA => " + A + " - B => " + B + " - C => " + C+ " - D => " + D);
        }
        System.out.println("Resultado final\nA => " + A + " - B => " + B + " - C => " + C+ " - D => " + D);
    }
}