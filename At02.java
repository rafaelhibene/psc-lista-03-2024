import java.util.Scanner;
    public class At02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            int x, y, mod;
            System.out.println("Insira o primeiro numero: ");
            x = scanner.nextInt();
            System.out.println("Insira o segundo numero: ");
            y = scanner.nextInt();
            
            mod = x % y; 

            System.out.println("O resto da divisão e: " + mod);
        scanner.close();        
    }
}
