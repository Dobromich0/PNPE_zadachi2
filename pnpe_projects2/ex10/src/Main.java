import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        if(x > 0 )
        {
            System.out.println(x + " Positive");
        }
        else
        {
            System.out.println(x + " Negative");
        }

        scanner.close();
    }
}