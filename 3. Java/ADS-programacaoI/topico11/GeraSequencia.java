public class GeraSequencia {
    public static void main (String[] args) {
        
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}