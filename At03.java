import java.util.Scanner;
public class At03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome? ");
        String nome = scanner.nextLine();
        System.out.print("Saudacoes meu caro " + nome);


        scanner.close(); 
    }
}