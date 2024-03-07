import java.util.Scanner;
public class At06 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a idade da pessoa: ");
        int idade = scanner.nextInt();
        int total;
        total = idade * 365;
        System.out.println("A pessoa informada ja viveu " + total + " dias.");

        scanner.close();
    }
}
