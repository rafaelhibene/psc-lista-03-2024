import java.util.Scanner;
public class At08 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de metros que quer converter para centimetros: ");
        double metros = scanner.nextDouble();

        double centimetros;
        centimetros = metros * 100;

        System.out.println(metros + " metros são " + centimetros + " centimetros");


        scanner.close();
    }
}
