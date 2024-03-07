import java.util.Scanner;
public class At20 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos % de IPI deve ser acrescentado nas peças? ");
        double ipi = scanner.nextDouble();

        System.out.println("Digite o codigo da primeira peca: ");
        int cod1 = scanner.nextInt();
        System.out.println("Digite o valor unitario da primeira peca: ");
        double valor1 = scanner.nextDouble();
        System.out.println("Digite a quantidade dessa peca que deseja: ");
        int quant1 = scanner.nextInt();
        
        double total1 = valor1 * quant1;

        System.out.println("Digite o codigo da segunda peca: ");
        int cod2 = scanner.nextInt();
        System.out.println("Digite o valor unitario da segunda peca: ");
        double valor2 = scanner.nextDouble();
        System.out.println("Digite a quantidade dessa peca que deseja: ");
        int quant2 = scanner.nextInt();
        
        double total2 = valor2 * quant2;

        double soma = total1 + total2;

        double valorFinal = soma + ((ipi / 100) * soma);
        
        
        System.out.println("As pecas de codigo " + cod1 + " custaram R$ " + total1);
        System.out.println("As pecas de codigo " + cod2 + " custaram R$ " + total2);
        System.out.println("O valor total da compra com o acrescimo do IPI será de R$ " + valorFinal );
        scanner.close();
    }
}
