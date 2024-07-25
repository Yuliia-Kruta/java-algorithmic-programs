import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double a = scanner.nextDouble();
        System.out.println("a: " + a);

        System.out.println("Enter the second number:");
        double b = scanner.nextDouble();
        System.out.println("b: " + b);

        double c = Math.sqrt(a * a + b * b);
        System.out.println("According to the Pythagorean theorem, the third number (c) = " + c);

        scanner.close();
    }
}
