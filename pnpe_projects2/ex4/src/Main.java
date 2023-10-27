import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];

        int[] array2 = new int[5];
        for(int i = 0; i < array1.length; i++ )
        {
            array1[i] = scanner.nextInt();
        }
        System.out.print("Array: ");
        for(int i = 0; i < array1.length; i++ )
        {
            System.out.print(array1[i] + " ");
        }
        System.out.println(" ");
        for(int i = 0; i < array1.length; i++)
        {
            array2[i]= array1[array1.length - 1 - i];
        }
        System.out.print("Reverse Array: ");
        for(int i = 0; i < array2.length; i++ )
        {
            System.out.print(array2[i] + " ");
        }

        scanner.close();
    }
}