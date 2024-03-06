import java.util.Scanner;
public class At04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("Digite seu numero de telefone: ");
        String numeroTelefone = scanner.nextLine();

        System.out.println("Seu nome e: " + nome);
        System.out.println("Seu endereço e: " + endereco);
        System.out.println("Seu numero de telefone e: " + numeroTelefone);

        scanner.close(); 
    }
}