import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int j = scanner.nextInt();
        if(n == j)
        {
            System.out.println("The numbers are equal");
        }
        else
        {
            System.out.println("The numbers are NOT equal");
        }

        scanner.close();
    }
}