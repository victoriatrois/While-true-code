public class avaliacao02Atividade01 {
    public static void main(String[] args) {
        int a;
        int b;
        
        System.out.println("Questao 01");
        
        a = 27;
        b = 15;
        
        for (int i = 1; i < 10; i++) {
                System.out.println(i + "a volta:");
                System.out.println("i: " + i);
            if((b % 3) == 0) {
                System.out.println("Entrou no if");
                a -= i;
                i++;
                System.out.println("i: " + i);
                System.out.println("a: " + a);
            } else {
                System.out.println("Entrou no else");
                System.out.println("i antes do ++i: " + i);
                ++i;
                System.out.println("i depois do ++i: " + i);
                b += a * i;
                System.out.println("b += a * i: " + b);
            }
        }
        System.out.println("B => " + b);
    }
}