import java.util.Scanner;
public class At07 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        
        double reajuste, total;
        reajuste = salario * 0.07;
        total = salario + reajuste;

        System.out.println("O salario após um reajuste de 7% é de R$ " + total + " reais");

        scanner.close();
    }
}
