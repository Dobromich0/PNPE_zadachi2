import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if(n > 10)
        {
            System.out.println(n + " is bigger than 10");
        }
        else
        {
            System.out.println(n + " is lower than 10");
        }

        scanner.close();
    }
}