import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero: ");
        int number = scanner.nextInt();

        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;

            scanner.close();
        }
    }
}
