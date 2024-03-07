import java.util.Scanner;
public class At12 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double numero = scanner.nextDouble();
        double antecessor = numero - 1;
        double sucessor = numero + 1;

        System.out.println("O antecessor de " + numero + " è " + antecessor + " e seu sucessor é " + sucessor);

        scanner.close();
    }
}