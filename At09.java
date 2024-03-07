import java.text.DecimalFormat;
import java.util.Scanner;
public class At09 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.println("Digite o raio do circulo: ");
         double raio = scanner.nextDouble();

         double area = Math.PI * Math.pow(raio,2);

         DecimalFormat df = new DecimalFormat("#.##");
        String areaFormat = df.format(area);

         System.out.println("A area do circulo é " + areaFormat);


        scanner.close();
    }
}