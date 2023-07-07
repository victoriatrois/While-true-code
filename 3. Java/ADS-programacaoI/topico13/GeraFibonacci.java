public class GeraFibonacci {
    public static void main (String[] args) {
//        int [] fibo = new int[10]; //vetor de tamanho 10
//        fibo[0] = 0; //primeira posição e valor
//        fibo[1] = 1; //segunda posição e valor
//
//        System.out.println(fibo[0] + "\n" + fibo[1]); //mostrar duas primeiras posições
//
//        //calculo fibonacci
//        for (int i = 2; i <= 8; i++) {
//            for(int j = fibo[0]; j < fibo.length; j++){
//                int soma +=
//
//            }
//        }
        
        int[] fibonacci = new int[10];
        
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        for(int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        for(int i = 0; i < fibonacci.length; i++) {
            System.out.print (fibonacci[i] + " ");
        }
    }
}