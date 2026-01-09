import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int n = sc.nextInt();

        int[] arr = new int[n];

        int evenCount = 0;
        int oddCount = 0;

        // Read elements and count even & odd
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print result
        System.out.println("Even Count = " + evenCount);
        System.out.println("Odd Count = " + oddCount);

        sc.close();
    }
}
