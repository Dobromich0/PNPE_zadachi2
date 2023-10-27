import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[5];

        int maxDigit = 0;

        for(int i = 0; i < array1.length; i++ )
        {
            array1[i] = scanner.nextInt();

        }
        System.out.print("Array: ");
        for(int i = 0; i < array1.length; i++ )
        {
            System.out.print(array1[i] + " ");
        }
        for(int i = 0; i < array1.length; i ++)
        {
            if(array1[i] > maxDigit)
            {
                maxDigit = array1[i];
            }
        }
        System.out.println(" ");

        System.out.println("Biggest-Number: " + maxDigit);
        scanner.close();
    }
}