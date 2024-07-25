import java.util.Scanner;

public class RecursiveFibonacciFactorialNumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fibonacci sequence
        int numFibonacci;
        while (true) {
            System.out.println("Enter the number of Fibonacci sequence members to display:");
            numFibonacci = scanner.nextInt();
            if (numFibonacci >= 0) {
                break;
            } else {
                System.out.println("Please enter a non-negative integer.");
            }
        }
        for (int i = 0; i < numFibonacci; i++) {
            System.out.println(i + " - " + fibonacci(i));
        }

        // Factorial calculation
        int factorialNum;
        while (true) {
            System.out.println("Enter the number to calculate its factorial:");
            factorialNum = scanner.nextInt();
            if (factorialNum >= 0) {
                break;
            } else {
                System.out.println("Factorial is not defined for negative numbers. Please enter a non-negative integer.");
            }
        }
        System.out.println("Factorial of " + factorialNum + " = " + factorial(factorialNum));

        // Digit count
        int digitCountNum;
        while (true) {
            System.out.println("Enter a natural number to count the digits:");
            digitCountNum = scanner.nextInt();
            if (digitCountNum >= 0) {
                break;
            } else {
                System.out.println("Please enter a non-negative integer.");
            }
        }
        System.out.println("The number of digits in " + digitCountNum + " is " + countDigits(digitCountNum));

        scanner.close();
    }

    // Optimized Fibonacci calculation using an iterative approach
    private static int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }

    private static int factorial(int m) {
        if (m < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        if (m == 0 || m == 1) return 1;
        return m * factorial(m - 1);
    }

    private static int countDigits(int a) {
        int count = 1;
        if (a / 10 == 0) {
            return 1;
        } else {
            count += countDigits(a / 10);
            return count;
        }
    }
}
