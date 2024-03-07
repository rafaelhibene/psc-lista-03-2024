import java.util.Scanner;
public class At10 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.println("Digite a temperatura em Fahrenheit: ");
         double fahrenheit = scanner.nextDouble();
          double celsius;
          celsius = (fahrenheit - 32) / 9 * 5;

          System.out.println("A temperatura convertida para celsius é " + celsius + " ºC");




        scanner.close();
    }
}