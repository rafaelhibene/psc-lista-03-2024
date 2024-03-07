import java.util.Scanner;
public class At14 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double A = scanner.nextDouble();
        System.out.println("Digite o valor de B: ");
        double B = scanner.nextDouble();


        double N;

        N = A;
        A = B;
        B = N;


        System.out.println("VALOR DE A = " + A);
        System.out.println("VALOR DE B = " + B);


        scanner.close();
    }
}