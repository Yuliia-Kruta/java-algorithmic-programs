import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("Enter a number to check (any number up to 2,000,000,000):");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println("The number " + number + " is a palindrome.");
        } else {
            System.out.println("The number " + number + " is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (originalNumber != 0) {
            reversedNumber = reversedNumber * 10 + (originalNumber % 10);
            originalNumber = originalNumber / 10;
        }

        return reversedNumber == number;
    }
}
