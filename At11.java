import java.util.Scanner;
public class At11 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();

        double media;

        media = (n1 + n2 + n3) / 3;

        System.out.println("A media das três notas é: " + media);

        scanner.close();
    }
}