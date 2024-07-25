import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first natural number:");
        int a = scanner.nextInt();

        System.out.println("Enter the second natural number:");
        int b = scanner.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("Both numbers must be natural numbers (positive integers).");
            return;
        }

        while (true) {
            if (a == b) {
                System.out.println("The greatest common divisor (GCD) is: " + a);
                break;
            }
            if (a < b) {
                b -= a;
            } else {
                a -= b;
            }
        }
    }
}
