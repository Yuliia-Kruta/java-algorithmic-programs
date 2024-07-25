public class PerfectNumbers {
    public static void main(String[] args) {
        final int LIMIT = 20000;

        for (int number = 2; number < LIMIT; number++) {
            if (isPerfect(number)) {
                System.out.println(number + " - Perfect Number");
            }
        }
    }

    private static boolean isPerfect(int number) {
        int sumOfDivisors = 1;

        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                sumOfDivisors += divisor;
            }
        }

        return sumOfDivisors == number;
    }
}

