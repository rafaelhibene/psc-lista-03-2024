import java.util.Scanner;
public class At13 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da hora trabalhada: ");
        double valorHora = scanner.nextDouble();
        System.out.println("Digite quantas horas o colaborador trabalhou: ");
        double hora = scanner.nextDouble();

        double salario = valorHora * hora;

        System.out.println("Digite de quantos % é o valor do desconto do INSS: ");
        double percentual = scanner.nextDouble();

        double desconto = salario * (percentual /100);

        double salarioliq = salario - desconto;

        System.out.println("O salario liquido é de R$ " + salarioliq + " reais");




        scanner.close();
    }
}