import java.util.Scanner;

public class Main {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[3];

        for(int i=0; i< array1.length; i++)
        {
            array1[i] = scanner.nextInt();
        }
        int sum = 0;

        for(int i=0; i< array1.length; i++)
        {
            if(array1[i] % 2 != 0)
            {
                sum += array1[i];
            }
        }
        System.out.println("Sum of the odd numbers: " + sum);

        scanner.close();
    }
}