import java.util.Scanner;
public class At17 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantas canetas foram compradas: ");
        int canetas = scanner.nextInt();

        System.out.println("Digite quanto foi pago o vendedor: ");
        double pagamento = scanner.nextDouble();

        System.out.println("Digite quanto o vendedor devolveu de troco: ");
        double troco = scanner.nextDouble();

        double valor;
        valor = (pagamento - troco) / canetas;

        System.out.println("Cada caneta custou R$ " + valor + " reais");

        scanner.close();
    }
}