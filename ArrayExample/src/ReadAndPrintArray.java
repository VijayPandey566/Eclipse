import java.util.Scanner;

public class ReadAndPrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Array size input
        int n = sc.nextInt();

        // Step 2: Array declare
        int[] arr = new int[n];

        // Step 3: Array elements input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 4: Print array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();

    }
}
