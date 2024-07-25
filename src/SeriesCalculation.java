import java.util.Scanner;

public class SeriesCalculation {
    /* The general term of the series is given by:
    * Term_k = x^(2k) / (2k)! */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer x:");
        int x = scanner.nextInt();

        System.out.println("Enter a natural number n:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Error: n must be a positive integer.");
            scanner.close();
            return;
        }

        for (int k = 1; k <= n; k++) {
            float term = (float) Math.pow(x, 2 * k) / factorial(2 * k);
            System.out.printf("Term %d: %.4f%n", k, term);
        }

        scanner.close();
    }

    private static int factorial(int m) {
        if (m == 1 || m == 0) {
            return 1;
        }
        return m * factorial(m - 1);
    }
}
