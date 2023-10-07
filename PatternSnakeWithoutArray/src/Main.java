import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, k = 0;

        for (i = 1; i < n; i++) {
            for (j = 1; j <= (2 * n) - i; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else if (i % 2 == 1) {
                    k++;
                    System.out.print(k + " ");
                } else {
                    System.out.print(k + " ");
                    k--;
                }
            }
            k += n;
            System.out.println();
        }
    }
}
