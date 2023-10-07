import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of integers in the array
        int n = scanner.nextInt();

        // Read the array of integers
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate and print the maximum values for each integer
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int sum = 0;
            int product = 1;

            while (num != 0) {
                int digit = num % 10;
                sum += digit;
                product *= digit;
                num /= 10;
            }

            int max = Math.max(sum, product);
            System.out.print(max + " ");
        }

        scanner.close();
    }
}
