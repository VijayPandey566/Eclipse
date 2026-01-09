import java.util.Scanner;

public class CountOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int n = sc.nextInt();

        int[] arr = new int[n];
        int oddCount = 0;

        // Read elements and count odd numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        // Print odd count
        System.out.println("Odd Count = " + oddCount);

        sc.close();
    }
}
