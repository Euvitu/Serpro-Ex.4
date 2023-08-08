
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de primos que você deseja somar: ");
        int n = scanner.nextInt();

        System.out.println("A soma dos primeiros " + n + " números primos é: " + NumeroPrimo.sumOfPrimes(n));

        scanner.close();
    }
}