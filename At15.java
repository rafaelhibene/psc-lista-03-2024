import java.util.Scanner;
public class At15 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double A = scanner.nextDouble();
        System.out.println("Digite o valor de B: ");
        double B = scanner.nextDouble();
        System.out.println("Digite o valor de C: ");
        double C = scanner.nextDouble();

        double delta;

        delta = B*B - 4 * A * C;

        double raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
        double raiz2 = (-B - Math.sqrt(delta)) / (2 * A);

        System.out.println("As raízes são: " + raiz1 + " e " + raiz2);

        scanner.close();
    }
}