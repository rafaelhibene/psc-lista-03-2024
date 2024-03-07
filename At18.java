import java.util.Scanner;
public class At18 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura do degrau em metros: ");
        double alturaDegrau = scanner.nextDouble();

        System.out.println("Digite quantos metros voce deseja subir: ");
        double objetivo = scanner.nextDouble();

        int numeroDeDeugraus = (int) Math.ceil (objetivo / alturaDegrau);
        
        System.out.println("Voce vai precisar subir " + numeroDeDeugraus + " degraus para alcacar seu objetivo");
        
        scanner.close();
    }
}
