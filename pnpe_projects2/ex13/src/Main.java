import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        do
        {
            System.out.println("Write a number lower than 20: ");

            n = scanner.nextInt();

        }
        while(n > 20);

        if(isPrime(n))
        {

            System.out.println(n + " prime number");
        }
        else
        {
            System.out.println(n + "  not a prime number");
        }

        scanner.close();
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        return true;
    }
}