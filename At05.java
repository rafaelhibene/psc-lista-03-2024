import java.util.Scanner;

public class At05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        


        System.out.println("Digite quantos dolares quer converter para reais: ");
        double valor = scanner.nextDouble();

        double dolar, resultado;
        dolar = 4.95;
        resultado = valor * dolar;

        System.out.println("O valor de US$" + valor + "em reais é " + resultado);
        

        scanner.close(); 
    }
}