import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100) + 1;

        System.out.println("The computer has picked a natural number between 1 and 100. Try to guess the number.");
        System.out.println("Enter your guess:");

        int attempt = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int guess = scanner.nextInt();
            attempt++;

            if (guess > number) {
                System.out.println("Lower");
            } else if (guess < number) {
                System.out.println("Higher");
            } else {
                System.out.println("Congratulations! You guessed the number!");
                break;
            }
        }

        System.out.println("Number of attempts: " + attempt);
        scanner.close();
    }
}
