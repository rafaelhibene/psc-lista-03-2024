import java.util.Scanner; 

public class at01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero01 = scanner.nextDouble();
        System.out.println("Digite o segundo numero");
        double numero02 = scanner.nextDouble();

        double soma = numero01 + numero02; 


        System.out.println("A soma dos numeros é: " + soma);
        scanner.close(); 
    }
}