import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int n = sc.nextInt();

        // Declare array
        int[] arr = new int[n];

        int sum = 0;

        // Read array elements and calculate sum
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        // Print sum
        System.out.println("Sum = " + sum);

        sc.close();
    }
}
