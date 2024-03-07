import java.util.Scanner;
public class At16 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos KM o automovel percorreu: ");
        double km = scanner.nextDouble();
        System.out.println("Digite quantos litros de combustivel o automovel utilizou: ");
        double litros = scanner.nextDouble();

        double media = km/litros;

        System.out.println("A media de consumo do automovel foi de " + media + " KM por litro");

        scanner.close();
    }
}